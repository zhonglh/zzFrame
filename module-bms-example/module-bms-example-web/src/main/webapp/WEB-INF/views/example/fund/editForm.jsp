<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz1" />




<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">

                <form action="" method="post" id="editForm" viewId="editForm" >

                    <div class="block-tit">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                        </svg>基本信息
                    </div>


                    <table class="info-table hide-area">

                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>
                            <tr>
                                <th>基金名称<font color="red">*</font></th>
                                <td class="fd_fundName">
                                    <c:out value="${ m.fundName }" escapeXml="true"/>
                                </td>
                                <th>基金代码<font color="red">*</font></th>
                                <td class="fd_fundCode">
                                    <c:out value="${ m.fundCode }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>基金类型<font color="red">*</font></th>
                                <td class="fd_fundTypeName">
                                    ${ m.fundTypeName }
                                </td>
                                <th>基金投向<font color="red">*</font></th>
                                <td class="fd_fundDirectionName">
                                    ${ m.fundDirectionName }
                                </td>
                            </tr>

                            <tr>
                                <th>起购金额<font color="red">*</font></th>
                                <td class="fd_startMoney">
                                    <c:out value="${ m.startMoney }" escapeXml="true"/>
                                </td>
                                <th>管理类型<font color="red">*</font></th>
                                <td class="fd_managTypeName">
                                    ${ m.managTypeName }
                                </td>
                            </tr>

                            <tr>
                                <th>基金规模<font color="red">*</font></th>
                                <td class="fd_fundScale">
                                    <c:out value="${ m.fundScale }" escapeXml="true"/>
                                </td>
                                <th>基金经理<font color="red">*</font></th>
                                <td class="fd_managerUserName">
                                    <c:out value="${ m.managerUserName }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>成立日期</th>
                                <td class="fd_startDate">
                                    <fmt:formatDate value="${ m.startDate }" pattern="yyyy-MM-dd" />
                                </td>
                                <th>到期日期</th>
                                <td class="fd_endDate">
                                    <fmt:formatDate value="${ m.endDate }" pattern="yyyy-MM-dd" />
                                </td>
                            </tr>

                            <tr>
                                <th>投资领域</th>
                                <td class="fd_investmentField">
                                    <c:out value="${ m.investmentField }" escapeXml="true"/>
                                </td>
                                <th>收入分配</th>
                                <td class="fd_incomeAllocation">
                                    <c:out value="${ m.incomeAllocation }" escapeXml="true"/>
                                </td>
                            </tr>

                            <tr>
                                <th>附件</th>
                                <td class="fd_fundFiles">
                                    <c:out value="${ m.fundFiles }" escapeXml="true"/>
                                </td>
                                <th>备注</th>
                                <td class="fd_remark">
                                    <c:out value="${ m.remark }" escapeXml="true"/>
                                </td>
                            </tr>


                        </tbody>
                    </table>

                    <input type="hidden" id="id" name="id" value="${ m.id }">

                    <table class="info-table show-area">
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
                                                <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.fundDirection }">selected</c:if>>${  dict.dictName }</option>
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
                                                <option value="${ dict.dictVal }" <c:if test="${ dict.dictVal == m.managType }">selected</c:if>>${  dict.dictName }</option>
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
                                                <input type="text" class="form-control input-sm" name="managerUserName" id="managerUserName" value="${ m.managerUserName }" readonly>
                                            </c:if>
                                            <c:if test="${ fn:indexOf(allQueryString,'&managerUserId=') < 0 }">
                                            <div class="input-group">
                                                <input type="hidden" name="managerUserId" id="managerUserId" value="${ m.managerUserId }" >
                                                <input type="text" name="managerUserName" id="managerUserName" value="${ m.managerUserName }" required="required" class="form-control input-sm managerUserName " placeholder="请选择基金经理" style="cursor: pointer;" readonly="readonly">
                                                <div class="input-group-btn">
                                                    <button type="button"  class="btn btn-primary btn-sm managerUserName">
                                                        <svg class="icon" aria-hidden="true">
                                                            <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                 xlink:href="#icon-sousuo">
                                                            </use>
                                                        </svg>
                                                    </button>
                                                    <button type="button" id="clearManagerUserId"   class="btn btn-primary btn-sm">
                                                        <svg class="icon" aria-hidden="true">
                                                            <use xmlns:xlink="http://www.w3.org/1999/xlink"
                                                                 xlink:href="#icon-close">
                                                            </use>
                                                        </svg>
                                                    </button>
                                                </div>
                                            </div>
                                            </c:if>
                                </td>
                            </tr>

                            <tr>
                                <th>成立日期</th>
                                <td>
                                        <div class="input-group">
                                            <input type="text"  class="form-control input-sm Wdate"
                                                   placeholder="请输入成立日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'startDate'})"
                                                           value="${ m.startDate }" id="startDate" name="startDate" readonly   />
                                        </div>
                                </td>
                                <th>到期日期</th>
                                <td>
                                        <div class="input-group">
                                            <input type="text"  class="form-control input-sm Wdate"
                                                   placeholder="请输入到期日期" autocomplete="off"
                                                   onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'endDate'})"
                                                           value="${ m.endDate }" id="endDate" name="endDate" readonly   />
                                        </div>
                                </td>
                            </tr>

                            <tr>
                                <th>投资领域</th>
                                <td>
                                        <div class="info-detail">
                                            <textarea  class="form-control input-sm  "
                                                      name="investmentField " placeholder="请输入投资领域，500字以内" maxlength="500" rows="6"><c:out value="${ m.investmentField }" escapeXml="true"/></textarea>
                                        </div>
                                </td>
                                <th>收入分配</th>
                                <td>
                                        <div class="info-detail">
                                            <textarea  class="form-control input-sm  "
                                              name="incomeAllocation" placeholder="请输入收入分配，500字以内" maxlength="500" rows="4">${ m.incomeAllocation }</textarea>
                                        </div>
                                </td>
                            </tr>

                            <tr>
                                <th>附件</th>
                                <td>
                                </td>
                                <th>备注</th>
                                <td>
                                        <div class="info-detail">
                                            <textarea  class="form-control input-sm  "
                                              name="remark" placeholder="请输入备注，500字以内" maxlength="500" rows="4">${ m.remark }</textarea>
                                        </div>
                                </td>
                            </tr>

                        </tbody>
                    </table>



                    <input type="hidden" id="tempExampleBank" />

                    <div class="block-each block-each-another">


                        <div class="block-tit">
                            <svg class="icon" aria-hidden="true">
                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                            </svg>备案信息
                        </div>

                            <table class="info-table hide-area">
                                <col style="width: 15%" />
                                <col style="width: 35%" />
                                <col style="width: 15%" />
                                <col style="width: 35%" />
                                <tr>
                                    <th>备案日期<font color="red">*</font></th>
                                    <td class="fd_fundRecordBO_recordDate">
                                        <c:if test="${m.fundRecordBO != null}">
                                        <fmt:formatDate value="${m.fundRecordBO.recordDate}" pattern="yyyy-MM-dd" />
                                        </c:if>
                                    </td>
                                    <th>备案地点<font color="red">*</font></th>
                                    <td class="fd_remark">
                                        <c:if test="${m.fundRecordBO != null}">
                                            ${m.fundRecordBO.recordAddr}
                                        </c:if>
                                    </td>
                                </tr>
                            </table>

                            <table class="info-table show-area">
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <tr>
                                <th>备案日期<font color="red">*</font></th>
                                <td>
                                    <input type="text" class="form-control input-sm Wdate required " name="fundRecordBO.recordDate" id="fundRecordBO_recordDate" value="<fmt:formatDate value="${m.fundRecordBO.recordDate}" pattern="yyyy-MM-dd" />" onclick="WdatePicker({dateFmt: 'yyyy-MM-dd'})" placeholder="请选择备案日期" readonly required="required">
                                </td>
                                <th>备案地点<font color="red">*</font></th>
                                <td><input type="text" name="fundRecordBO.recordAddr" id="fundRecordBO_recordAddr" value="${m.fundRecordBO.recordAddr}"  required="required" maxlength="200" placeholder="请输入备案地点" class="form-control input-sm required" required="required" /></td>
                            </tr>
                        </table>




                        <div class="block-tit">
                            <svg class="icon" aria-hidden="true">
                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                            </svg>基金账户
                        </div>

                        <div class="fundAccount">
                            <table id='tableData-fundAccount' class='easyui-datagrid' singleSelect="true" scrollbarSize="0"   method='post' fit='false'  fitColumns="true" border='true'>
                                <thead>
                                <tr>

                                    <th field="id" align="left" hidden="true">id</th>
                                    <th field='fundAccountTypeName' align="left" width="2" sortable='false' formatter="fundAccountTypeNameFmt">账户类型</th>
                                    <th field='bankName' align="left" width="2" sortable='false' formatter="bankNameFmt">开户行</th>
                                    <th field='accountName' align="left" width="2" sortable='false' formatter="accountNameFmt">户名</th>
                                    <th field='accountNo' align="left" width="2" sortable='false' formatter="accountNoFmt">账号</th>
                                    <th field="option" align="left" formatter="markFmt">操作</th>
                                </tr>
                                </thead>
                            </table>
                            <div style="text-align: center;margin: 5px">
                                <button type="button" class="btn btn-primary btn-sm" onclick="doAddFundAccount()">
                                    <svg class="icon" aria-hidden="true">
                                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-plus"></use>
                                    </svg>
                                    <span>添 加</span>
                                </button>
                            </div>
                        </div>

                    </div>



                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

                <shiro:hasPermission name="example.fund:update">
                    <button type="button" class="btn btn-primary btn-sm hide-area" onclick="openEdit()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-edit"></use>
                        </svg>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-chexiao"></use>
                    </svg>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="example.fund:update">
                    <button type="button" class="btn btn-primary btn-sm show-area" onclick="doUpdate()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-save-continue"></use>
                        </svg>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm show-area" onclick="cancelEdit()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                    </svg>
                    <span>取 消</span>
                </button>

            </div>
        </div>
    </div>
</div>

<script>
    var inAllPage = "${ inAllPage }";
</script>

<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/user/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>
<script src="${ staticUrl }/statics2/business-js/example/bank/search.js"></script>


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

        //选择银行
        $("#tempExampleBank").OpenExampleBankSelectWin({
            title: "银行",
            selectType: "d1",
            callId: "",
            callName: "",
            clearId: ""
        },function(id,name,row){
            $(tempExampleBank).val(row.bankName);
            $(tempExampleBank).prev().val(row.id);
            costTableRows(tableId , tableJavaName , tempExampleBankIndex)
        });


        $('#tableData-fundAccount').datagrid({
            url : $AppContext+dataUrl+"/fundAccount/list?fundId=${m.id}",
            onLoadSuccess : function(data){
                if(data.rows!=null){
                    $('#tableData-fundAccount').datagrid("resize", {height: (data.rows.length + 1) * 44-5});
                    $(".fd-decimal2").inputDecimal(2);
                }
            }

        });


    });


    var tableId , tableJavaName;
    var tempExampleBank  , tempExampleBankIndex ;


    function fund_account_type_dicts() {
        var html = "<option value=''>请选择</option>";
        <c:forEach items="${fund_account_type_dicts}" var="dict">
        html += "<option value='${dict.dictVal}'>${dict.dictName}</option>";
        </c:forEach>
        return html;
    }


    function openExampleBank(theTabelId , theTableJavaName , obj ,index){
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
    function clearExampleBank(theTabelId , theTableJavaName , obj ,index){
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


    function fundAccountTypeNameFmt(val, row,index) {
        
        var html = "<select name='fundAccountBOList["+index+"].fundAccountType' id='fundAccountBOList_"+index+"_fundAccountType' onblur='costTableRows(\"tableData-fundAccount\" , \"fundAccountBOList\" , "+index+")'  class='form-control input-sm show-area required'>" ;
        html += checkedOption(fund_account_type_dicts() , row.fundAccountType);
        html += "</select>";

        html += "<div class='hide-area'>"+row.fundAccountTypeName+"</div>";
        return html;
    }

    function bankNameFmt(val, row,index) {
        
        var html = '<div class="input-group show-area">';
        html += '<input type="hidden" name="fundAccountBOList['+index+'].bankId" id="fundAccountBOList_'+index+'_bankId" value="'+row.bankId+'" >';
        html += '<input type="text"  class="form-control input-sm bankName" onclick="openExampleBank(\'tableData-fundAccount\',\'fundAccountBOList\',this,'+index+')" required="required" value="'+row.bankName+'" id="fundAccountBOList_'+index+'_bankName"  name="fundAccountBOList['+index+'].bankName"  onblur="costTableRows(\'tableData-fundAccount\' , \'fundAccountBOList\' , '+index+')" placeholder="请选择开户行" readonly >';
        html += '<div class="input-group-btn">';
        html += '<div class="btn btn-primary btn-sm" onclick="openExampleBank(\'tableData-fundAccount\', \'fundAccountBOList\',document.getElementById("fundAccountBOList_'+index+'_bankName"),'+index+')">';
        html += '<svg class="icon" aria-hidden="true">';
        html += '<use xmlns:xlink="http://www.w3.org/1999/xlink"  xlink:href="#icon-sousuo"></use>';
        html += '</svg>';
        html += '</div>';
        html += '<div class="btn btn-primary btn-sm" onclick=“clearExampleBank(document.getElementById(\'tableData-fundAccount\', \'fundAccountBOList\',"fundAccountBOList_'+index+'_bankName"),'+index+')"  >';
        html += '<svg class="icon" aria-hidden="true">';
        html += ' <use xmlns:xlink="http://www.w3.org/1999/xlink"	xlink:href="#icon-close"></use>';
        html += '</svg>';
        html += '</div>';
        html += '</div>';
        html += '</div>';

        html += "<div class='hide-area' >"+row.bankName+"</div>" ;

        return html;
    }

    function accountNameFmt(val, row,index) {
        var html = '<input type="text" maxlength="100" value="'+val+'" name="fundAccountBOList['+index+'].accountName" id="fundAccountBOList_'+index+'_accountName" onblur="costTableRows(\'tableData-fundAccount\' , \'fundAccountBOList\' , '+index+')" placeholder="请输入账户名" class="form-control input-sm show-area required" />';
        html += "<div class='hide-area' >"+val+"</div>" ;
        return html;
    }

    function accountNoFmt(val, row,index) {
        var html = '<input type="text" maxlength="50" value="'+val+'" name="fundAccountBOList['+index+'].accountNo" id="fundAccountBOList_'+index+'_accountNo" onblur="costTableRows(\'tableData-fundAccount\' , \'fundAccountBOList\' , '+index+')" placeholder="请输入银行账号" isFormat="false" class="form-control input-sm fd-decimal show-area required" />';
        html += "<div class='hide-area' >"+val+"</div>" ;
        return html;
    }


    function markFmt(val, r,index){
        var html =	'<div class="grid-column-option">';
        html+=	'<a href="javascript: doDelFundAccount('+ index + ');" title="删除"><svg class="icon" aria-hidden="true"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-delete"></use></svg></a>';
        html+=	'</div>';
        return html;
    }



    function doDelFundAccount(index){
        $('#tableData-fundAccount').datagrid("deleteRow" , index);
        var rows = $('#tableData-fundAccount').datagrid("getRows");
        $('#tableData-fundAccount').datagrid("loadData",rows);
    }

    function doAddFundAccount() {
        var rows = $('#tableData-fundAccount').datagrid("getRows");
        rows.push({id:"" , fundAccountTypeName:"" , fundAccountType : "" , bankId : "" , bankName :"" , accountName:"" ,accountNo:"" });
        $('#tableData-fundAccount').datagrid("loadData",rows);
    }



</script>

<bms:contentFooter />