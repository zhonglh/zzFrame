package com.zz.bms.core.ui;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 */
public class Pages<T> implements Serializable{

    public Pages(){

    }


    public Pages(List<T> list){
        this.results = list;
    }



    /**
     * 每页的记录数
     */
    private int pageSize ;

    /**
     * 当前页数
     */
    private int pageNum;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 记录内容
     */
    private List<T> results;


    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getResults() {
        return results;
    }

    public void setResults(List results) {
        this.results = results;
    }
}
