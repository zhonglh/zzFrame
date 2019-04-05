<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz后台管理系统" />


<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">
                <div class="block-tit">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                    </svg>基本信息
                </div>
                <form id="editForm" action="" method="post">
                    <input type="hidden" id="id" name="id" value="${m.id}">
                    <table class="info-table">
                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>
                        <tr>
                            <th>部门编号<font color="red">*</font></th>
                            <td><input type="text" class="form-control input-sm required"  placeholder="请输入部门编号" autocomplete="off"
                                       value="${m.depCode}" id="depCode" name="depCode" minlength="2" maxlength='20'/></td>

                            <th>部门名称<font color="red">*</font></th>
                            <td><input type="text" class="form-control input-sm required"  placeholder="请输入部门名称"  autocomplete="off"
                                       value="${m.depName}" id="depName" name="depName" minlength="1" maxlength='50'/></td>
                        </tr>


                        <tr>
                            <th>部门负责人</th>
                            <td>
                                <div class="input-group">
                                    <input type="text"  id="leadUserName" name="leadUserName" class="form-control input-sm leadUserName"
                                           placeholder="请选择部门负责人" readonly="readonly">
                                    <input type="hidden" id="leadUserId" name="leadUserId" value="${m.leadUserId}">
                                    <div class="input-group-btn">
                                        <button type="button"  class="btn btn-primary btn-sm leadUserName">
                                            <svg class="icon" aria-hidden="true">
                                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-sousuo"></use>
                                            </svg>
                                        </button>
                                        <button type="button"  id="clearLeadUserId"  class="btn btn-primary btn-sm">
                                            <svg class="icon" aria-hidden="true">
                                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                                            </svg>
                                        </button>
                                    </div>
                                </div>
                            </td>
                            <th>上级部门</th>
                            <td>
                                <div class="input-group">
                                    <input type="text"  id="pname" name="pname" value="${m.pname}" class="form-control input-sm  pname "
                                           placeholder="请选择上级部门" readonly="readonly" >
                                    <input type="hidden" id="pid" name="pid" value="${m.pid}">
                                    <div class="input-group-btn">
                                        <button type="button" class="btn btn-primary btn-sm pname">
                                            <svg class="icon" aria-hidden="true">
                                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-sousuo"></use>
                                            </svg>
                                        </button>
                                        <button type="button" id="clearPid" class="btn btn-primary btn-sm">
                                            <svg class="icon" aria-hidden="true">
                                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                                            </svg>
                                        </button>
                                    </div>
                                </div>
                            </td>
                        </tr>

                        <tr>
                            <th >备注</th>
                            <td colspan="3">
                                <div class="info-detail">
                                    <textarea class="form-control input-sm" name="remark" placeholder="请输入备注，500字以内" maxlength="500" rows="3">${m.remark}</textarea>
                                </div>
                            </td>
                        </tr>
                        </tbody>

                    </table>
                </form>
            </div>
            <div style="margin-top:10px;position:absolute;">


                <shiro:hasPermission name="system.user:add">
                <button type="button" class="btn btn-primary btn-sm" onclick="doSave()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-save-continue"></use>
                    </svg>
                    <span>保 存</span>
                </button>
                </shiro:hasPermission>


                <button type="button" class="btn  btn-warning btn-sm" onclick="closeWindow()">
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
    var tableid = "tableData-${tableId}";
</script>



<bms:contentJS />

<script src="${staticUrl}/statics2/js/project/form.js"></script>

<script src="${staticUrl}/statics2/business-js/system/dep/search.js"></script>
<script src="${staticUrl}/statics2/business-js/system/user/search.js"></script>


<script language="JavaScript">




    $(function() {

        //部门选择
        $(".pname").OpenSystemDepSelectWin({
            title: "上级部门",
            selectType: "t1",
            callId: "pid",
            callName: "pname",
            clearId: "clearPid"
        });


        //人员选择
        $(".leadUserName").OpenSystemUserSelectWin({
            title: "部门负责人",
            selectType: "d1",
            callId: "leadUserId",
            callName: "leadUserName",
            clearId: "clearLeadUserId"
        });


    });



</script>



<bms:contentFooter />
