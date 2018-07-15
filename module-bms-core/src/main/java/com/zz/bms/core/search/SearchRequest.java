
package com.zz.bms.core.search;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.zz.bms.core.enums.EnumSearchOperator;
import com.zz.bms.core.exceptions.BizException;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * <p>查询条件（包括分页和排序）</p>
 */

public final class SearchRequest extends Searchable {

    private final Map<String, SearchFilter> searchFilterMap = Maps.newHashMap();
    /**
     * 使用这个的目的是保证拼sql的顺序是按照添加时的顺序
     */
    private final List<SearchFilter> searchFilters = Lists.newArrayList();


    private boolean converted;


    public SearchRequest() {
        this(null);
    }



    /**
     * <p>根据查询参数拼Search<br/>
     * 查询参数格式：property_op=value 或 customerProperty=value<br/>
     * customerProperty查找规则是：1、先查找domain的属性，2、如果找不到查找domain上的SearchPropertyMappings映射规则
     * 属性、操作符之间用_分割，op可省略/或custom，省略后值默认为custom，即程序中自定义<br/>
     * 如果op=custom，property也可以自定义（即可以与domain的不一样）,
     * </p>
     *
     * @param searchParams 查询参数组
     */
    public SearchRequest(final Map<String, Object> searchParams)    throws BizException {
        toSearchFilters(searchParams);
    }


    private void toSearchFilters(final Map<String, Object> searchParams) throws BizException {
        if (searchParams == null || searchParams.size() == 0) {
            return;
        }
        for (Map.Entry<String, Object> entry : searchParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            addSearchFilter(SearchFilterHelper.newCondition(key, value));
        }
    }


    @Override
    public Searchable addSearchParam(final String key, final Object value) throws BizException {
        addSearchFilter(SearchFilterHelper.newCondition(key, value));
        return this;
    }

    @Override
    public Searchable addSearchParams(Map<String, Object> searchParams) throws BizException {
        toSearchFilters(searchParams);
        return this;
    }


    @Override
    public Searchable addSearchFilter(SearchFilter searchFilter) {
        if (searchFilter == null) {
            return this;
        }
        if (searchFilter instanceof Condition) {
            Condition condition = (Condition) searchFilter;
            String key = condition.getKey();
            searchFilterMap.put(key, condition);
        }
        int index = searchFilters.indexOf(searchFilter);
        if(index != -1) {
            searchFilters.set(index, searchFilter);
        } else {
            searchFilters.add(searchFilter);
        }
        return this;

    }


    @Override
    public Searchable addSearchFilters(Collection<? extends SearchFilter> searchFilters) {
        if (CollectionUtils.isEmpty(searchFilters)) {
            return this;
        }
        for (SearchFilter searchFilter : searchFilters) {
            addSearchFilter(searchFilter);
        }
        return this;
    }

    @Override
    public Searchable or(final SearchFilter first, final SearchFilter... others) {
        addSearchFilter(SearchFilterHelper.or(first, others));
        return this;
    }

    @Override
    public Searchable and(final SearchFilter first, final SearchFilter... others) {

        addSearchFilter(SearchFilterHelper.and(first, others));
        return this;
    }



    @Override
    public Searchable removeSearchFilter(final String searchProperty, final EnumSearchOperator operator) {
        this.removeSearchFilter(searchProperty + Condition.separator + operator);
        return this;
    }
    /**
     * @param key
     * @return
     */
    @Override
    public Searchable removeSearchFilter(final String key) {
        if (key == null) {
            return this;
        }

        SearchFilter searchFilter = searchFilterMap.remove(key);

        if (searchFilter == null) {
            searchFilter = searchFilterMap.remove(getCustomKey(key));
        }

        if (searchFilter == null) {
            return this;
        }

        searchFilters.remove(searchFilter);

        return this;
    }

    private String getCustomKey(String key) {
        return key + Condition.separator + EnumSearchOperator.custom;
    }


    @Override
    public <T> Searchable convert(final Class<T> entityClass) {
        SearchableConvertUtils.convertSearchValueToEntityValue(this, entityClass);
        markConverted();
        return this;
    }


    @Override
    public Searchable markConverted() {
        this.converted = true;
        return this;
    }


    @Override
    public Collection<SearchFilter> getSearchFilters() {
        return Collections.unmodifiableCollection(searchFilters);
    }

    @Override
    public boolean isConverted() {
        return converted;
    }

    @Override
    public boolean hasSearchFilter() {
        return searchFilters.size() > 0;
    }


    @Override
    public boolean containsSearchKey(String key) {
        boolean contains =
                searchFilterMap.containsKey(key) ||
                        searchFilterMap.containsKey(getCustomKey(key));

        if(contains) {
            return true;
        }

        //否则检查其中的or 和 and
        return containsSearchKey(searchFilters, key);
    }

    private boolean containsSearchKey(List<SearchFilter> searchFilters, String key) {
        boolean contains = false;
        for(SearchFilter searchFilter : searchFilters) {
            if(searchFilter instanceof OrCondition) {
                OrCondition orCondition = (OrCondition) searchFilter;
                contains = containsSearchKey(orCondition.getOrFilters(), key);
            }
            if(searchFilter instanceof AndCondition) {
                AndCondition andCondition = (AndCondition) searchFilter;
                contains = containsSearchKey(andCondition.getAndFilters(), key);
            }

            if(searchFilter instanceof Condition) {
                Condition condition = (Condition) searchFilter;
                contains = condition.getKey().equals(key) || condition.getSearchProperty().equals(key);
            }

            if(contains) {
                return true;
            }
        }

        return contains;
    }

    @Override
    public Object getValue(String key) {
        SearchFilter searchFilter = searchFilterMap.get(key);
        if (searchFilter == null) {
            searchFilter = searchFilterMap.get(getCustomKey(key));
        }
        if (searchFilter == null) {
            return null;
        }

        if (searchFilter instanceof Condition) {
            Condition condition = (Condition) searchFilter;
            return condition.getValue();
        }

        return null;
    }



    @Override
    public String toString() {
        return "SearchRequest{" +
                "searchFilterMap=" + searchFilterMap +
                '}';
    }
}
