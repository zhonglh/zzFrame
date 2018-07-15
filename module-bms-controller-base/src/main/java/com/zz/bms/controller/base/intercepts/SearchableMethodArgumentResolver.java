
package com.zz.bms.controller.base.intercepts;

import com.google.common.collect.Lists;
import com.zz.bms.core.search.Searchable;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.MethodParameter;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.List;
import java.util.Map;

/**
 * 请求查询参数字符串及分页/排序参数绑定到Searchable
 * <pre>
 *     查询参数格式如下：
 *     1.1、默认查询字符串
 *         search.baseInfo.realname_like=zhang
 *         search.age_lt=12
 *     1.2、控制器处理方法写法
 *        public void test(Searchable searchable);
 *
 *     2.1、自定义查询字符串
 *         foo_search.baseInfo.realname_like=zhang
 *         foo_search.age_lt=12
 *         test_search.age_gt=12
 *     2.2、控制器处理方法写法
 *        public void test(@Qualifier("foo") Searchable searchable1, @Qualifier("test") Searchable searchable2);
 *
 *     3.1、禁用查询时分页及排序
 *          public void test(@Search(page = false, sort = false) Searchable searchable);
 * </pre>
 * @author Administrator
 */
public class SearchableMethodArgumentResolver extends BaseMethodArgumentResolver {

    private static final String DEFAULT_SEARCH_PREFIX = "search";

    private String prefix = DEFAULT_SEARCH_PREFIX;

    /**
     * 设置查询参数前缀
     *
     * @param prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }


    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return Searchable.class.isAssignableFrom(parameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

        String searchPrefix = getSearchPrefix(parameter);

        Map<String, String[]> searcheableMap = getPrefixParameterMap(searchPrefix, webRequest, true);

        boolean hasCustomSearchFilter = searcheableMap.size() > 0;


        Searchable searchable = null;
        if (hasCustomSearchFilter) {
            if (searchable == null) {
                searchable = Searchable.newSearchable();
            }
            for (String name : searcheableMap.keySet()) {
                String[] mapValues = filterSearchValues(searcheableMap.get(name));

                if (mapValues.length == 1) {
                    if (name.endsWith("in")) {
                        searchable.addSearchParam(name, StringUtils.split(mapValues[0], ",; "));
                    } else {
                        searchable.addSearchParam(name, mapValues[0]);
                    }
                } else {
                    searchable.addSearchParam(name, mapValues);
                }
            }
        }


        return searchable;
    }

    private String[] filterSearchValues(String[] values) {
        List<String> result = Lists.newArrayList(CollectionUtils.arrayToList(values));
        for (int i = 0; i < result.size(); i++) {
            if (StringUtils.isBlank(result.get(i))) {
                result.remove(i);
            }
        }
        return result.toArray(values);
    }

    private String getSearchPrefix(MethodParameter parameter) {
        Qualifier qualifier = parameter.getParameterAnnotation(Qualifier.class);

        if (qualifier != null) {
            return new StringBuilder(((Qualifier) qualifier).value()).append("_").append(prefix).toString();
        }

        return prefix;
    }





}
