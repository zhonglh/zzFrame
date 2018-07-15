
package com.zz.bms.core.search.callback;


import com.zz.bms.core.search.Searchable;

/**
 * @author Administrator
 */
public interface SearchCallback {

    public static final SearchCallback DEFAULT = new DefaultSearchCallback();


    /**
     * 动态拼SQL where、group by having
     *
     * @param ql
     * @param search
     */
    public void prepareQL(StringBuilder ql, Searchable search);


}
