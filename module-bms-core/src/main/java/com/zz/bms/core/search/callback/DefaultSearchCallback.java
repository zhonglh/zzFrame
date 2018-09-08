
package com.zz.bms.core.search.callback;

import com.zz.bms.core.enums.EnumSearchOperator;
import com.zz.bms.core.search.*;
import org.springframework.util.StringUtils;


/**
 * @author Administrator
 */
public class DefaultSearchCallback implements SearchCallback {


    private String alias;
    private String aliasWithDot;

    public DefaultSearchCallback() {
        this("");
    }

    public DefaultSearchCallback(String alias) {
        this.alias = alias;
        if (!StringUtils.isEmpty(alias)) {
            this.aliasWithDot = alias + ".";
        } else {
            this.aliasWithDot = "";
        }
    }

    public String getAlias() {
        return alias;
    }

    public String getAliasWithDot() {
        return aliasWithDot;
    }

    @Override
    public void prepareQL(StringBuilder ql, Searchable search) {
        if (!search.hasSearchFilter()) {
            return;
        }

        int paramIndex = 1;
        for (SearchFilter searchFilter : search.getSearchFilters()) {

            if (searchFilter instanceof Condition) {
                Condition condition = (Condition) searchFilter;
                if (condition.getOperator() == EnumSearchOperator.custom) {
                    continue;
                }
            }

            ql.append(" and ");

            paramIndex = genCondition(ql, paramIndex, searchFilter);

        }
    }

    private int genCondition(StringBuilder ql, int paramIndex, SearchFilter searchFilter) {
        boolean needAppendBracket = searchFilter instanceof OrCondition || searchFilter instanceof AndCondition;

        if (needAppendBracket) {
            ql.append("(");
        }

        if (searchFilter instanceof Condition) {
            Condition condition = (Condition) searchFilter;
            //自定义条件
            String entityProperty = condition.getEntityProperty();
            String operatorStr = condition.getOperatorStr();
            //实体名称
            ql.append(getAliasWithDot());
            ql.append(entityProperty);
            //操作符
            //1、如果是自定义查询符号，则使用SearchPropertyMappings中定义的默认的操作符
            ql.append(" ");
            ql.append(operatorStr);

            if (!condition.isUnaryFilter()) {
                ql.append(" "+ formtValue(condition, condition.getValue()));
                return paramIndex;
            }
        } else if (searchFilter instanceof OrCondition) {
            boolean isFirst = true;
            for (SearchFilter orSearchFilter : ((OrCondition) searchFilter).getOrFilters()) {
                if (!isFirst) {
                    ql.append(" or ");
                }
                paramIndex = genCondition(ql, paramIndex, orSearchFilter);
                isFirst = false;
            }
        } else if (searchFilter instanceof AndCondition) {
            boolean isFirst = true;
            for (SearchFilter andSearchFilter : ((AndCondition) searchFilter).getAndFilters()) {
                if (!isFirst) {
                    ql.append(" and ");
                }
                paramIndex = genCondition(ql, paramIndex, andSearchFilter);
                isFirst = false;
            }
        }

        if (needAppendBracket) {
            ql.append(")");
        }
        return paramIndex;
    }



    private Object formtValue(Condition condition, Object value) {
        EnumSearchOperator operator = condition.getOperator();
        if (operator == EnumSearchOperator.like || operator == EnumSearchOperator.notLike) {
            return "%" + value + "%";
        }
        /**
        if (operator == EnumSearchOperator.prefixLike || operator == EnumSearchOperator.prefixNotLike) {
            return value + "%";
        }

        if (operator == EnumSearchOperator.suffixLike || operator == EnumSearchOperator.suffixNotLike) {
            return "%" + value;
        }
         */
        return value;
    }



}
