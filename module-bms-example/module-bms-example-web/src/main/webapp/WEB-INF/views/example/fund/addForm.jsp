<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader  />


<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">

                <form id="editForm" action="" method="post">

                    <div class="block-tit">
                        &nbsp;<i class="fa fa-th-list"></i>&nbsp;基本信息
                    </div>

                    <table class="info-table">
                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>


                                                <tr>
                                <th>基金名称<font color="red">*</font></th>
                                <td>
                                            <input type="text" required="required" class="form-control input-sm required"
                                                   placeholder="请输入基金名称" autocomplete="off"
                                                   value="${ m.fundName }" id="fundName" name="fundName"
                                                       maxlength="50"  />
                                </td>
                                    <th>基金代码<font color="red">*</font></th>
                                    <td>
                                                <input type="text" required="required" class="form-control input-sm required"
                                                       placeholder="请输入基金代码" autocomplete="off"
                                                       value="${ m.fundCode }" id="fundCode" name="fundCode"
                                                           maxlength="10"  />
                                    </td>
                            </tr>
                            <tr>
                                <th>基金类型<font color="red">*</font></th>
                                <td>
                                            <select id="fundType"  name="fundType" required="required" style="width:98%">
                                                <option value="" ></option>
                                                <c:forEach items="${ fund_type_dicts }" var="dict">
                                                    <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.fundType }">selected</c:if>>${ dict.dictName  }</option>
                                                </c:forEach>
                                            </select>
                                </td>
                                    <th>基金投向<font color="red">*</font></th>
                                    <td>
                                                <select id="fundDirection"  name="fundDirection" required="required" style="width:98%">
                                                    <option value="" ></option>
                                                    <c:forEach items="${ fund_direction_dicts }" var="dict">
                                                        <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.fundDirection }">selected</c:if>>${ dict.dictName }</option>
                                                    </c:forEach>
                                                </select>
                                    </td>
                            </tr>
                            <tr>
                                <th>起购金额<font color="red">*</font></th>
                                <td>
                                            <input type="text" required="required" class="form-control input-sm number fd-decimal2 required"
                                                   placeholder="请输入起购金额" autocomplete="off"
                                                   value="${ m.startMoney }" id="startMoney" name="startMoney" step="0.01"
                                                       maxlength="14"  />
                                </td>
                                    <th>管理类型<font color="red">*</font></th>
                                    <td>
                                                <select id="managType"  name="managType" required="required" style="width:98%">
                                                    <option value="" ></option>
                                                    <c:forEach items="${ manag_type_dicts }" var="dict">
                                                        <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.managType }">selected</c:if>>${ dict.dictName }</option>
                                                    </c:forEach>
                                                </select>
                                    </td>
                            </tr>
                            <tr>
                                <th>基金规模<font color="red">*</font></th>
                                <td>
                                            <input type="text" required="required" class="form-control input-sm number fd-decimal2 required"
                                                   placeholder="请输入基金规模" autocomplete="off"
                                                   value="${ m.fundScale }" id="fundScale" name="fundScale" step="0.01"
                                                       maxlength="14"  />
                                </td>
                                    <th>基金经理<font color="red">*</font></th>
                                    <td>
                                                <c:if test="${ fn:indexOf(allQueryString,'&managerUserId=') >= 0 }">
                                                    <input type="text" class="form-control input-sm" name="managerUserName" id="managerUserName"  value="${ m.managerUserName }" readonly>
                                                </c:if>
                                                <c:if test="${ fn:indexOf(allQueryString,'&managerUserId=') < 0 }">

                                                    <c:if test="${ m.managerUserId != null}">
                                                        <input type="hidden" name="managerUserId" id="managerUserId" value="${ m.managerUserId }">
                                                        <input type="text" name="managerUserName" id="managerUserName" value="${ m.managerUserName }" required="required" class="form-control input-sm " readonly="readonly">
                                                    </c:if>
                                                    <c:if test="${ m.managerUserId == null}">
                                                        <div class="input-group">
                                                            <input type="hidden" name="managerUserId" id="managerUserId" value="${ m.managerUserId }" >
                                                            <input type="text" name="managerUserName" id="managerUserName" value="${ m.managerUserName }" required="required" class="form-control input-sm managerUserName " placeholder="请选择基金经理" style="cursor: pointer;" readonly="readonly">
                                                            <div class="input-group-btn">
                                                                <button type="button"  class="btn btn-primary btn-sm managerUserName">
                                                                    &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                                </button>
                                                                <button type="button" id="clearManagerUserId"   class="btn btn-primary btn-sm">
                                                                    &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                                </button>
                                                            </div>
                                                        </div>
                                                    </c:if>
                                                </c:if>
                                    </td>
                            </tr>
                            <tr>
                                <th>成立日期</th>
                                <td>

                                                <input type="text"  class="form-control input-sm Wdate "
                                                       placeholder="请输入成立日期" autocomplete="off"
                                                       onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'startDate'})"
                                                       value="<fmt:formatDate value="${ m.startDate }" pattern="yyyy-MM-dd" />" id="startDate" name="startDate" readonly   />

                                </td>
                                    <th>到期日期</th>
                                    <td>

                                                    <input type="text"  class="form-control input-sm Wdate "
                                                           placeholder="请输入到期日期" autocomplete="off"
                                                           onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'endDate'})"
                                                           value="<fmt:formatDate value="${ m.endDate }" pattern="yyyy-MM-dd" />" id="endDate" name="endDate" readonly   />


                                    </td>
                            </tr>
                            <tr>
                                <th>投资领域</th>
                                <td>
                                            <div class="info-detail">
                                            <textarea  class="form-control input-sm  "
                                                      name="investmentField" id="investmentField" placeholder="请输入投资领域，500字以内" maxlength="500" rows="5">${ m.investmentField }</textarea>
                                            </div>
                                </td>
                                    <th>收入分配</th>
                                    <td>
                                                <div class="info-detail">
                                        <textarea  class="form-control input-sm  " rows="5"
                                                  id="incomeAllocation"  name="incomeAllocation" placeholder="请输入收入分配，500字以内" maxlength="500" rows="4">${ m.incomeAllocation }</textarea>
                                                </div>
                                    </td>
                            </tr>
                            <tr>
                                <th>附件</th>
                                <td>
                                            <div class="" style="margin-bottom: 0px">
                                                <div class="info-detail">
                                                    <input type="hidden" id="fundFiles" name="fundFiles" value="${  m.fundFiles }">
                                                    <div class="uploader-list">
                                                        <ul id="thelist_fundFiles" class="file-list" style="margin: 0 0 10px 0" ></ul>
                                                    </div>
                                                    <div class="btns">
                                                        <div id="uploadFile_fundFiles" title='附件' class="webuploader-container" style="width: 80px" data-options="viewAreaId:'#thelist_fundFiles',  businessFileType:'fundFiles'  ,businessTempId: '${  m.fundFiles }' ">
                                                            <i class="fa fa-upload"></i>
                                                            <span>上传附件</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>



                                </td>
                                    <th>备注</th>
                                    <td>
                                                <div class="info-detail">
                                        <textarea  class="form-control input-sm  " rows="5"
                                                  id="remark"  name="remark" placeholder="请输入备注，500字以内" maxlength="500" rows="4">${ m.remark }</textarea>
                                                </div>
                                    </td>
                            </tr>
                            <tr>
                                <th>部门</th>
                                <td>
                                            <c:if test="${ fn:indexOf(allQueryString,'&depId=') >=0 }">
                                                <input type="text" class="form-control input-sm" name="depName" id="depName"  value="${ m.depName }" readonly>
                                            </c:if>
                                            <c:if test="${ fn:indexOf(allQueryString,'&depId=') < 0 }">
                                                <c:if test="${ m.depId != null}">
                                                    <input type="hidden" name="depId" id="depId" value="${ m.depId }">
                                                    <input type="text" name="depName" id="depName" value="${ m.depName }" required="required" class="form-control input-sm " readonly="readonly">
                                                </c:if>
                                                <c:if test="${ m.depId == null}">
                                                    <div class="input-group">
                                                        <input type="hidden" name="depId" id="depId" value="${ m.depId }">
                                                        <input type="text" name="depName" id="depName" value="${ m.depName }"  class="form-control input-sm depName " placeholder="请选择部门" style="cursor: pointer;" readonly="readonly">
                                                        <div class="input-group-btn">
                                                            <button type="button"
                                                                    class="btn btn-primary btn-sm depName">
                                                                &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                            </button>
                                                            <button type="button" id="clearDepId"
                                                                    class="btn btn-primary btn-sm">
                                                                &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                            </button>
                                                        </div>
                                                    </div>
                                                </c:if>
                                            </c:if>
                                </td>
                            </tr>
                    </tbody>
                    </table>



                        <input type="hidden" id="tempExampleBank" />
                        <input type="hidden" id="tempSystemUser" />


                    <div class="block-each block-each-another">

                            <div class="block-tit">
                                &nbsp;<i class="fa fa-th-list"></i>&nbsp;基金账户
                            </div>




                                <div class="exampleFundaccount" style="width: 100%">
                                    <table id='tableData-exampleFundaccount' class='easyui-datagrid' singleSelect="true" scrollbarSize="0"   method='post' fit='false'  fitColumns="true" border='true'>
                                        <thead>
                                        <tr>

                                                    <th field='fundAccountTypeName' align="left" width="1" sortable='false' formatter="exampleFundaccount_fundAccountTypeNameFmt"  >基金账户类型</th>
                                                    <th field='accountName' align="left" width="1" sortable='false' formatter="exampleFundaccount_accountNameFmt"  >户名</th>
                                                    <th field='bankName' align="left" width="1" sortable='false' formatter="exampleFundaccount_bankNameFmt"  >开户行</th>
                                                    <th field='accountNo' align="left" width="1" sortable='false' formatter="exampleFundaccount_accountNoFmt"  >账号</th>
                                                    <th field='startDate' align="center" width="1" sortable='false' formatter="exampleFundaccount_startDateFmt"  >开始日期</th>
                                                    <th field='otherBankName' align="left" width="1" sortable='false' formatter="exampleFundaccount_otherBankNameFmt"  >其他行</th>
                                                    <th field='userName' align="left" width="1" sortable='false' formatter="exampleFundaccount_userNameFmt"  >账户处理人</th>
                                            <th field="option" align="left" formatter="markFmtFundAccount">操作</th>
                                        </tr>
                                        </thead>
                                    </table>
                                    <div style="text-align: center;margin: 5px">
                                        <button type="button" class="btn btn-primary btn-sm" onclick="doAddFundAccount()">
                                           <i class="fa fa-plus"></i>
                                            <span>添 加</span>
                                        </button>
                                    </div>
                                </div>



                            <div class="block-tit">
                                &nbsp;<i class="fa fa-th-list"></i>&nbsp;基金备案
                            </div>

                                <table class="info-table">
                                    <colgroup>
                                        <col style="width: 15%" />
                                        <col style="width: 35%" />
                                        <col style="width: 15%" />
                                        <col style="width: 35%" />
                                    </colgroup>

                                    <tbody>


                                            <tr>

                                                        <th>备案日期<font color="red">*</font></th>
                                                        <td>

                                                                        <input type="text" required="required" class="form-control input-sm Wdate required"
                                                                               placeholder="请输入备案日期" autocomplete="off"
                                                                               onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'fundRecordBO_recordDate'})"
                                                                               value="${ m.fundRecordBO.recordDate }" id="fundRecordBO_recordDate" name="fundRecordBO.recordDate" readonly   />

                                                        </td>


                                            </tr>
                                            <tr>
                                                <th>备案地点<font color="red">*</font></th>
                                                <td>
                                                            <input type="text" required="required" class="form-control input-sm required"
                                                                   placeholder="请输入备案地点" autocomplete="off"
                                                                   value="${ m.fundRecordBO.recordAddr }" id="fundRecordBO_recordAddr" name="fundRecordBO.recordAddr"
                                                                       maxlength="200"  />
                                                </td>

                                                        <th>开户行<font color="red">*</font></th>
                                                        <td>
                                                                    <c:if test="${ fn:indexOf(allQueryString,'&bankId=') >= 0 }">
                                                                        <input type="text" class="form-control input-sm" name="fundRecordBO.bankName" id="fundRecordBO_bankName"  value="${ m.fundRecordBO.bankName }" readonly>
                                                                    </c:if>
                                                                    <c:if test="${ fn:indexOf(allQueryString,'&bankId=') < 0 }">

                                                                        <c:if test="${ m.fundRecordBO.bankId != null}">
                                                                            <input type="hidden" name="fundRecordBO.bankId" id="fundRecordBO_bankId" value="${ m.fundRecordBO.bankId }">
                                                                            <input type="text" name="fundRecordBO.bankName" id="fundRecordBO_bankName" value="${ m.fundRecordBO.bankName }" required="required" class="form-control input-sm fundRecordBO_bankName "  readonly="readonly">
                                                                        </c:if>
                                                                        <c:if test="${ m.fundRecordBO.bankId == null}">
                                                                            <div class="input-group">
                                                                                <input type="hidden" name="fundRecordBO.bankId" id="fundRecordBO_bankId" value="${ m.fundRecordBO.bankId }" >
                                                                                <input type="text" name="fundRecordBO.bankName" id="fundRecordBO_bankName" value="${ m.fundRecordBO.bankName }" required="required" class="form-control input-sm fundRecordBO_bankName " placeholder="请选择开户行" style="cursor: pointer;" readonly="readonly">
                                                                                <div class="input-group-btn">
                                                                                    <button type="button"  class="btn btn-primary btn-sm fundRecordBO_bankName">
                                                                                        &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                                                    </button>
                                                                                    <button type="button" id="clearfundRecordBO_BankId"   class="btn btn-primary btn-sm">
                                                                                        &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                                                    </button>
                                                                                </div>
                                                                            </div>
                                                                        </c:if>
                                                                    </c:if>
                                                        </td>


                                            </tr>
                                            <tr>
                                                <th>证件类型</th>
                                                <td>
                                                            <select id="fundRecordBO_cardType"  name="fundRecordBO.cardType"  style="width:98%">
                                                                <option value="" ></option>
                                                                <c:forEach items="${ card_type_dicts }" var="dict">
                                                                    <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.fundRecordBO.cardType }">selected</c:if>>${ dict.dictName  }</option>
                                                                </c:forEach>
                                                            </select>
                                                </td>

                                                        <th>备案人</th>
                                                        <td>
                                                                    <c:if test="${ fn:indexOf(allQueryString,'&recordUserId=') >= 0 }">
                                                                        <input type="text" class="form-control input-sm" name="fundRecordBO.recordUserName" id="fundRecordBO_recordUserName"  value="${ m.fundRecordBO.recordUserName }" readonly>
                                                                    </c:if>
                                                                    <c:if test="${ fn:indexOf(allQueryString,'&recordUserId=') < 0 }">

                                                                        <c:if test="${ m.fundRecordBO.recordUserId != null}">
                                                                            <input type="hidden" name="fundRecordBO.recordUserId" id="fundRecordBO_recordUserId" value="${ m.fundRecordBO.recordUserId }">
                                                                            <input type="text" name="fundRecordBO.recordUserName" id="fundRecordBO_recordUserName" value="${ m.fundRecordBO.recordUserName }"  class="form-control input-sm fundRecordBO_recordUserName "  readonly="readonly">
                                                                        </c:if>
                                                                        <c:if test="${ m.fundRecordBO.recordUserId == null}">
                                                                            <div class="input-group">
                                                                                <input type="hidden" name="fundRecordBO.recordUserId" id="fundRecordBO_recordUserId" value="${ m.fundRecordBO.recordUserId }" >
                                                                                <input type="text" name="fundRecordBO.recordUserName" id="fundRecordBO_recordUserName" value="${ m.fundRecordBO.recordUserName }"  class="form-control input-sm fundRecordBO_recordUserName " placeholder="请选择备案人" style="cursor: pointer;" readonly="readonly">
                                                                                <div class="input-group-btn">
                                                                                    <button type="button"  class="btn btn-primary btn-sm fundRecordBO_recordUserName">
                                                                                        &nbsp;<i class="fa fa-search"></i>&nbsp;
                                                                                    </button>
                                                                                    <button type="button" id="clearfundRecordBO_RecordUserId"   class="btn btn-primary btn-sm">
                                                                                        &nbsp;<i class="fa fa-close"></i>&nbsp;
                                                                                    </button>
                                                                                </div>
                                                                            </div>
                                                                        </c:if>
                                                                    </c:if>
                                                        </td>


                                            </tr>
                                    </tbody>

                                </table>

                    </div>




                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">
                <shiro:hasPermission name="example.fund:add">
                    <button type="button" class="btn btn-primary btn-sm" onclick="doSave()">
                        <i class="fa fa-save"></i>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>
                <button type="button" class="btn  btn-warning btn-sm" onclick="closeWindow()">
                    <i class="fa fa-close"></i>
                    <span>取 消</span>
                </button>
            </div>
        </div>
    </div>
</div>


<script>
    var inAllPage = "${ inAllPage }";
    var queryString = "${ queryString }";
</script>

<bms:contentJS />

<script src="${ staticUrl }/statics2/js/project/form.js"></script>
<script src="${ staticUrl }/statics2/js/project/common-upload.js"></script>

<script src="${ staticUrl }/statics2/business-js/example/bank/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>

<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>




<script language="JavaScript">
    $(function() {


        //选择基金经理
        $(".managerUserName").OpenSystemUserSelectWin({
            title: "基金经理",
            selectType: "d1",
            callId: "managerUserId",
            callName: "managerUserName",
            clearId: "clearManagerUserId"
        });

        //选择部门
        $(".depName").OpenSystemDepSelectWin({
            title: "部门",
            selectType: "t1",
            callId: "depId",
            callName: "depName",
            clearId: "clearDepId"
        });

        $(".fundRecordBO_bankName").OpenExampleBankSelectWin({
            title: "开户行",
            selectType: "d1",
            callId: "fundRecordBO_bankId",
            callName: "fundRecordBO_bankName",
            clearId: "clearfundRecordBO_BankId"
        });
        $(".fundRecordBO_recordUserName").OpenSystemUserSelectWin({
            title: "备案人",
            selectType: "d1",
            callId: "fundRecordBO_recordUserId",
            callName: "fundRecordBO_recordUserName",
            clearId: "clearfundRecordBO_RecordUserId"
        });




        $("#tempExampleBank").OpenExampleBankSelectWin({
            title: "银行信息",
            selectType: "d1",
            callId: "",
            callName: "",
            clearId: ""
        },function(id,name,row){
            $(tempExampleBank).val(row.bankName);
            $(tempExampleBank).prev().val(row.id);

            costTableRows(tableId , tableJavaName , tempExampleBankIndex);

        });
        $("#tempSystemUser").OpenSystemUserSelectWin({
            title: "用户",
            selectType: "d1",
            callId: "",
            callName: "",
            clearId: ""
        },function(id,name,row){
            $(tempSystemUser).val(row.userName);
            $(tempSystemUser).prev().val(row.id);

            costTableRows(tableId , tableJavaName , tempSystemUserIndex);

        });

        $('#tableData-exampleFundaccount').datagrid({
            data : []
        });
    });


    var tableId , tableJavaName;

    var tempExampleBank  , tempExampleBankIndex ;
    var tempSystemUser  , tempSystemUserIndex ;


    function fund_account_type_dicts() {
        var html = "<option value=''>请选择</option>";
    <c:forEach items="${ fund_account_type_dicts }" var="dict">
        html += "<option value='${ dict.dictVal }'>${ dict.dictName }</option>";
    </c:forEach>
        return html;
    }



    function openExampleBank(theTabelId , theTableJavaName ,obj ,index){
        if(obj != null && obj != undefined) {
            tempExampleBankIndex = index;
            tempExampleBank = obj[0];
            if(tempExampleBank == null){
                tempExampleBank = obj;
            }


            tableId = theTabelId;
            tableJavaName = theTableJavaName;

            $("#tempExampleBank").click();
        }
    }
    function clearExampleBank(theTabelId , theTableJavaName ,obj ,index){
        if(obj != null && obj != undefined){
            tempExampleBankIndex = index;
            tempExampleBank = obj[0];
            if(tempExampleBank == null){
                tempExampleBank = obj;
            }

            tableId = theTabelId
            tableJavaName = theTableJavaName
            $(tempExampleBank).val("");
            $(tempExampleBank).prev().val("");

            costTableRows(tableId , tableJavaName , tempExampleBankIndex);
        }
    }
    function openSystemUser(theTabelId , theTableJavaName ,obj ,index){
        if(obj != null && obj != undefined) {
            tempSystemUserIndex = index;
            tempSystemUser = obj[0];
            if(tempSystemUser == null){
                tempSystemUser = obj;
            }


            tableId = theTabelId;
            tableJavaName = theTableJavaName;

            $("#tempSystemUser").click();
        }
    }
    function clearSystemUser(theTabelId , theTableJavaName ,obj ,index){
        if(obj != null && obj != undefined){
            tempSystemUserIndex = index;
            tempSystemUser = obj[0];
            if(tempSystemUser == null){
                tempSystemUser = obj;
            }

            tableId = theTabelId
            tableJavaName = theTableJavaName
            $(tempSystemUser).val("");
            $(tempSystemUser).prev().val("");

            costTableRows(tableId , tableJavaName , tempSystemUserIndex);
        }
    }







    function exampleFundaccount_fundAccountTypeNameFmt(val, row,index){
        var html = "<select name='fundAccountBOList["+index+"].fundAccountType' id='fundAccountBOList_"+index+"_fundAccountType' onblur='costTableRows(\"tableData-exampleFundaccount\" , \"fundAccountBOList\" , "+index+")' class='form-control input-sm required'>" ;
        html += checkedOption(fund_account_type_dicts() , row.fundAccountType);
        html += "</select>";
        return html;
    }


    function exampleFundaccount_accountNameFmt(val, row,index){

        var html = '<input type="text" required="required" class="form-control input-sm required"'+
            'placeholder="请输入户名" autocomplete="off" '+ ' onblur="costTableRows(\'tableData-exampleFundaccount\' , \'fundAccountBOList\' , '+index+')"'+
            'value="'+val+'" id="fundAccountBOList_'+index+'_accountName" name="fundAccountBOList['+index+'].accountName"'+
            '   maxlength="100"  />';

        return html;

    }


    function exampleFundaccount_bankNameFmt(val, row,index){

        var html = '<div class="input-group">';
        html += '<input type="hidden" name="fundAccountBOList['+index+'].bankId" id="fundAccountBOList_'+index+'_bankId" value="'+row.bankId+'" >';
        html += '<input type="text"  class="form-control input-sm bankName" onclick="openExampleBank(\'tableData-exampleFundaccount\',\'fundAccountBOList\',this,'+index+')" required="required" value="'+row.bankName+'" id="fundAccountBOList_'+index+'_bankName"  name="fundAccountBOList['+index+'].bankName"  onblur="costTableRows(\'tableData-exampleFundaccount\' , \'fundAccountBOList\' , '+index+')" placeholder="请选择开户行" readonly >';
        html += '<div class="input-group-btn">';
        html += '<div class="btn btn-primary btn-sm" onclick="openExampleBank(\'tableData-exampleFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_bankName\'),'+index+')">';
        html += '&nbsp;<i class="fa fa-search"></i>&nbsp;';
        html += '</div>';
        html += '<div class="btn btn-primary btn-sm" onclick="clearExampleBank(\'tableData-exampleFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_bankName\'),'+index+')"  >';
        html += '&nbsp;<i class="fa fa-close"></i>&nbsp;';
        html += '</div>';
        html += '</div>';
        html += '</div>';

        return html;
    }


    function exampleFundaccount_accountNoFmt(val, row,index){

        var html = '<input type="text" required="required" class="form-control input-sm required"'+
            'placeholder="请输入账号" autocomplete="off" '+ ' onblur="costTableRows(\'tableData-exampleFundaccount\' , \'fundAccountBOList\' , '+index+')"'+
            'value="'+val+'" id="fundAccountBOList_'+index+'_accountNo" name="fundAccountBOList['+index+'].accountNo"'+
            '   maxlength="50"  />';

        return html;

    }


    function exampleFundaccount_startDateFmt(val, row,index){

        var html = '<input type="text"  class="form-control input-sm Wdate "'+
        'placeholder="请输入开始日期" autocomplete="off"'+ ' onblur="costTableRows(\'tableData-exampleFundaccount\' , \'fundAccountBOList\' , '+index+')"'+
        'onclick="WdatePicker({dateFmt: \'yyyy-MM-dd\', el: \'fundAccountBOList_'+index+'_startDate\'})"'+
        'value="'+val+'" id="fundAccountBOList_'+index+'_startDate" name="fundAccountBOList['+index+'].startDate" readonly   />';
        return html;

    }


    function exampleFundaccount_otherBankNameFmt(val, row,index){

        var html = '<div class="input-group">';
        html += '<input type="hidden" name="fundAccountBOList['+index+'].otherBankId" id="fundAccountBOList_'+index+'_otherBankId" value="'+row.otherBankId+'" >';
        html += '<input type="text"  class="form-control input-sm otherBankName" onclick="openExampleBank(\'tableData-exampleFundaccount\',\'fundAccountBOList\',this,'+index+')" required="required" value="'+row.otherBankName+'" id="fundAccountBOList_'+index+'_otherBankName"  name="fundAccountBOList['+index+'].otherBankName"  onblur="costTableRows(\'tableData-exampleFundaccount\' , \'fundAccountBOList\' , '+index+')" placeholder="请选择其他行" readonly >';
        html += '<div class="input-group-btn">';
        html += '<div class="btn btn-primary btn-sm" onclick="openExampleBank(\'tableData-exampleFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_otherBankName\'),'+index+')">';
        html += '&nbsp;<i class="fa fa-search"></i>&nbsp;';
        html += '</div>';
        html += '<div class="btn btn-primary btn-sm" onclick="clearExampleBank(\'tableData-exampleFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_otherBankName\'),'+index+')"  >';
        html += '&nbsp;<i class="fa fa-close"></i>&nbsp;';
        html += '</div>';
        html += '</div>';
        html += '</div>';

        return html;
    }


    function exampleFundaccount_userNameFmt(val, row,index){

        var html = '<div class="input-group">';
        html += '<input type="hidden" name="fundAccountBOList['+index+'].userId" id="fundAccountBOList_'+index+'_userId" value="'+row.userId+'" >';
        html += '<input type="text"  class="form-control input-sm userName" onclick="openSystemUser(\'tableData-exampleFundaccount\',\'fundAccountBOList\',this,'+index+')" required="required" value="'+row.userName+'" id="fundAccountBOList_'+index+'_userName"  name="fundAccountBOList['+index+'].userName"  onblur="costTableRows(\'tableData-exampleFundaccount\' , \'fundAccountBOList\' , '+index+')" placeholder="请选择账户处理人" readonly >';
        html += '<div class="input-group-btn">';
        html += '<div class="btn btn-primary btn-sm" onclick="openSystemUser(\'tableData-exampleFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_userName\'),'+index+')">';
        html += '&nbsp;<i class="fa fa-search"></i>&nbsp;';
        html += '</div>';
        html += '<div class="btn btn-primary btn-sm" onclick="clearSystemUser(\'tableData-exampleFundaccount\', \'fundAccountBOList\',document.getElementById(\'fundAccountBOList_'+index+'_userName\'),'+index+')"  >';
        html += '&nbsp;<i class="fa fa-close"></i>&nbsp;';
        html += '</div>';
        html += '</div>';
        html += '</div>';

        return html;
    }
    function markFmtFundAccount(val, r,index){
        var html =	'<div class="grid-column-option">';
        html+=	'<a href="javascript: doDelFundAccount('+ index + ');" title="删除"><i class="fa fa-trash"></i></a>';
        html+=	'</div>';
        return html;
    }


    function doDelFundAccount(index){
        $('#tableData-exampleFundaccount').datagrid("deleteRow" , index);
        var rows = $('#tableData-exampleFundaccount').datagrid("getRows");
        $('#tableData-exampleFundaccount').datagrid("loadData",rows);
    }

    function doAddFundAccount() {
        var rows = $('#tableData-exampleFundaccount').datagrid("getRows");
        rows.push({ id : "" ,fundId : "" ,fundName : "" ,fundAccountType : "" ,fundAccountTypeName : "" ,accountName : "" ,bankId : "" ,bankName : "" ,accountNo : "" ,startDate : "" ,otherBankId : "" ,otherBankName : "" ,userId : "" ,userName : ""  });
        $('#tableData-exampleFundaccount').datagrid("loadData",rows);
    }


</script>


<bms:contentFooter />