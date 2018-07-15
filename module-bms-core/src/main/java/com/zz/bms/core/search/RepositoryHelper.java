
package com.zz.bms.core.search;


import com.zz.bms.core.search.callback.SearchCallback;

/**
 * 仓库辅助类
 * @author Administrator
 */
public class RepositoryHelper {

    public static String prepareQL( final Searchable searchable, final SearchCallback searchCallback) {

        StringBuilder s = new StringBuilder("");
        searchCallback.prepareQL(s, searchable);
        return s.toString();
    }

}
