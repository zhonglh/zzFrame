
package com.zz.bms.core.enums;

import com.zz.bms.core.exceptions.BizException;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Arrays;

/**
 * <p>查询操作符</p>
 * @author Administrator
 */
public enum EnumSearchOperator {
    eq("","等于", "="),
    ne("ne","不等于", "!="),
    gt("gt","大于", ">"),
    gte("gte","大于等于", ">="),
    lt("lt","小于", "<"),
    lte("lte","小于等于", "<="),
    isNull("isNull","空", "is null"),
    isNotNull("isNotNull","非空", "is not null"),

    /*
    prefixLike("prefixLike","前缀模糊匹配", "like"),
    prefixNotLike("prefixNotLike","前缀模糊不匹配", "not like"),
    suffixLike("suffixLike","后缀模糊匹配", "like"),
    suffixNotLike("suffixNotLike","后缀模糊不匹配", "not like"),
    */



    between("between" , "范围-左闭右闭" , "between"),
    betweenOpen("betweenOpen" , "范围-左开右开" , "betweenOpen"),
    betweenLeftOpen("betweenLeftOpen" , "范围-左开右闭", "betweenLeftOpen"),
    betweenRightOpen("betweenRightOpen" , "范围-右开左闭", "betweenRightOpen"),

    like("like","模糊匹配", "like"),
    notLike("notLike","不匹配", "not like"),
    in("in","包含", "in"),
    notIn("notIn","不包含", "not in"),
    custom("custom","自定义默认的", null)
    ;

    private String code;
    private String info;
    private String symbol;

    EnumSearchOperator(String code, String info, String symbol) {
        this.code = code;
        this.info = info;
        this.symbol = symbol;
    }


    public String getTheValue() {
        return code;
    }


    public String getTheName() {
        return info;
    }



    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }

    public String getSymbol() {
        return symbol;
    }

    public static String toStringAllOperator() {
        return Arrays.toString(EnumSearchOperator.values());
    }

    /**
     * 操作符是否允许为空
     *
     * @param operator
     * @return
     */
    public static boolean isAllowBlankValue(final EnumSearchOperator operator) {
        return operator == EnumSearchOperator.isNotNull || operator == EnumSearchOperator.isNull;
    }


    public static EnumSearchOperator getEnumByCode(String code){
        for (EnumSearchOperator operator : values()) {
            if (operator.getCode().trim().toLowerCase().equals(code.trim().toLowerCase())) {
                return operator;
            }
        }
        return null;
    }

    public static EnumSearchOperator valueBySymbol(String symbol) throws BizException {
        symbol = formatSymbol(symbol);
        for (EnumSearchOperator operator : values()) {
            if (operator.getSymbol().equals(symbol)) {
                return operator;
            }
        }

        throw new BizException("EnumSearchOperator not method search operator symbol : " + symbol);
    }

    private static String formatSymbol(String symbol) {
        if (StringUtils.isBlank(symbol)) {
            return symbol;
        }
        return symbol.trim().toLowerCase().replace("  ", " ");
    }


}
