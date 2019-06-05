package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.zz.bms.controller.base.controller.BaseExcelController;
import com.zz.bms.controller.base.controller.BaseGroupCURDController;
import com.zz.bms.controller.base.controller.BaseGroupExcelController;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.bo.TsMenuBO;
import com.zz.bms.system.query.impl.TsMenuQueryImpl;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.TsMenuService;
import com.zz.bms.util.spring.ContextHolderUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * zz 专用 base controller
 * 其它项目可以按照需求， 重新设计一个base controller
 */
public abstract class ZzGroupDefaultController<
        RwModel extends BaseEntity<PK>,
        QueryModel extends RwModel,
        PK extends Serializable,
        RwQuery extends Query,
        OnlyQuery extends RwQuery
        >
        extends BaseGroupExcelController<RwModel,QueryModel,PK,RwQuery,OnlyQuery> {


    @Autowired
    private TsDictService tsDictService;


    @Autowired
    private TsMenuService menuService ;


    private String addPageName = "addForm";



    @Override
    protected String computeBreadcrumb(){
        HttpServletRequest  request = ContextHolderUtils.getRequest();
        String uri = request.getRequestURI();
        int contextLength = request.getContextPath().length() ;
        uri = uri.substring(contextLength);
        List<TsMenuBO> list =  computeMenu(uri);
        if(list == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(TsMenuBO menu : list){
            sb.append(menu.getMenuName()).append(">");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    /**
     * 计算对应的菜单
     * @param uri
     * @return
     */
    private List<TsMenuBO> computeMenu(String uri){
        //todo 缓存
        TsMenuQueryImpl<TsMenuBO> menuQuery = new TsMenuQueryImpl<TsMenuBO>();
        menuQuery.menuUrl(uri);
        Wrapper wrapper = menuQuery.buildWrapper();
        TsMenuBO menuBO = menuService.getOne(wrapper);
        if(menuBO == null){
            return null;
        }
        List list = menuService.getAllMenu(menuBO);
        if(list == null || list.isEmpty()){
            return null;
        }
        return list;
    }


    /**
     * 获取增加界面的 jsp 名称 , 不包括路径
     * 增加和修改页面不是用同一个页面，所以 重写了 getAddPageName
     * @return
     */
    @Override
    protected String getAddPageName(){
        return addPageName;
    }

    @Override
    public Map<String, ?> getDictMaps(String... dictTypes) {
        return tsDictService.allDict(dictTypes);
    }

    @Override
    public String getDictVal(Object dict) {
        TsDictBO dictBO = (TsDictBO)dict;
        return dictBO.getDictVal();
    }

    @Override
    public String getDictName(Object dict) {
        TsDictBO dictBO = (TsDictBO)dict;
        return dictBO.getDictName();
    }
}
