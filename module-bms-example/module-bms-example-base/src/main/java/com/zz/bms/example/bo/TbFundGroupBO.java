package com.zz.bms.example.bo;
import com.zz.bms.util.configs.annotaions.GroupFieldAnnotation;


import com.zz.bms.example.bo.TbFundAccountBO ;
import com.zz.bms.example.bo.TbFundRecordBO ;

import java.io.Serializable;
import java.util.List;



/**
* TbFundGroup BO , 扩展 TbFundBO 对象
* 基金 数据传输对象，对应界面中的所有元素
* 注意： 对象属性需要和 TbFundGroupServiceImpl.getServices 对应
* @author Administrator
* @date 2019-5-8 13:19:36
*/
public class TbFundGroupBO extends TbFundBO implements Serializable {


    @GroupFieldAnnotation(childTableColumnName = "fund_id" , filedName = "基金账户")
    List<TbFundAccountBO> fundAccountBOList ;

    @GroupFieldAnnotation(childTableColumnName = "fund_id" , filedName = "基金备案")
    TbFundRecordBO fundRecordBO ;


    public List<TbFundAccountBO>  getFundAccountBOList(){
        return fundAccountBOList ;
    }
    public void setFundAccountBOList(List<TbFundAccountBO> fundAccountBOList ){
        this.fundAccountBOList = fundAccountBOList;
    }
    public TbFundRecordBO getFundRecordBO(){
        return fundRecordBO ;
    }
    public void setFundRecordBO(TbFundRecordBO fundRecordBO ){
         this.fundRecordBO = fundRecordBO;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
