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



                <div id="detailForm">
                    <table class="info-table">
                        <tr>
                            <th width="15%">用户名称</th>
                            <td class="fd_userName">${m.userName}</td>

                            <th width="15%">用户登录名</th>
                            <td class="fd_loginName">${m.loginName}</td>
                        </tr>
                        <tr>
                            <th>直属领导</th>
                            <td class="fd_leadUserName">${m.leadUserName}</td>
                            <th>所在部门</th>
                            <td class="fd_depName">${m.depName}</td>
                        </tr>

                        <tr>
                            <th width="15%">手机号</th>
                            <td class="fd_phone">${m.phone}</td>

                            <th width="15%">邮箱</th>
                            <td class="fd_email">${m.email}</td>
                        </tr>
                        <tr>
                            <th >备注</th>
                            <td colspan="3" class="fd_remark">${m.remark}</td>
                        </tr>

                    </table>
                </div>


                <form id="editForm" action="" method="post" class="form-auto-fill hide" viewId="detailForm">
                    <input type="hidden" id="id" name="id" value="${m.id}">
                    <table class="info-table">
                        <tr>
                            <th width="15%">用户名称<font color="red">*</font></th>
                            <td><input type="text" class="form-control input-sm required"  placeholder="请输入用户名称"
                                       value="${m.userName}" id="userName" name="userName" minlength="2" maxlength='50'/></td>

                            <th width="15%">用户登录名<font color="red">*</font></th>
                            <td><input type="text" class="form-control input-sm required"  placeholder="请输入用户登录名"  autocorrect="off" autocapitalize="off"
                                       value="${m.loginName}" id="loginName" name="loginName" minlength="4" maxlength='20'/></td>
                        </tr>

                        <c:if test="${empty m.id}">
                        <tr>
                            <th width="15%">密码<font color="red">*</font></th>
                            <td><input type="password" class="form-control input-sm required"  placeholder="请输入用户名称"
                                       autocorrect="off" autocapitalize="off" id="loginPassword" name="loginPassword" minlength="6" maxlength='10'/></td>

                            <th width="15%">确认密码<font color="red">*</font></th>
                            <td><input type="password" class="form-control input-sm required"  placeholder="请输入用户名称" id="loginPasswordConfirm" name="loginPasswordConfirm"
                                       autocorrect="off" autocapitalize="off" equalto="#loginPassword" data-msg-equalto="您2次输入的新密码不一致！" minlength="6" maxlength='10'/></td>
                        </tr>
                        </c:if>

                        <tr>
                            <th>直属领导</th>
                            <td>
                                <div class="input-group">
                                    <input type="text"  id="leadUserName" name="leadUserName" class="form-control input-sm leadUserName"
                                           placeholder="请选择直属领导" readonly="readonly" value="${m.leadUserName}">
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
                            <th>所在部门</th>
                            <td>
                                <div class="input-group">
                                    <input type="text"  id="depName" name="depName" value="${m.depName}" class="form-control input-sm  sysdepInfo "
                                           placeholder="请选择所在部门" readonly="readonly" >
                                    <input type="hidden" id="depId" name="depId" value="${m.depId}">
                                    <div class="input-group-btn">
                                        <button type="button" class="btn btn-primary btn-sm crm-sysdepInfo">
                                            <svg class="icon" aria-hidden="true">
                                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-sousuo"></use>
                                            </svg>
                                        </button>
                                        <button type="button" id="clearSysdepInfo" class="btn btn-primary btn-sm">
                                            <svg class="icon" aria-hidden="true">
                                                <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                                            </svg>
                                        </button>
                                    </div>
                                </div>
                            </td>
                        </tr>

                        <tr>
                            <th width="15%">手机号<font color="red">*</font></th>
                            <td><input type="text" class="form-control input-sm required"  placeholder="请输入手机号"
                                       value="${m.phone}" id="phone" name="phone" minlength="11" maxlength='11'/></td>

                            <th width="15%">邮箱<font color="red">*</font></th>
                            <td><input type="email" class="form-control input-sm required"  placeholder="请输入邮箱"
                                       value="${m.email}"  id="email" name="email" minlength="4" maxlength='50'/></td>
                        </tr>
                        <tr>
                            <th >备注</th>
                            <td colspan="3">
                                <div class="info-detail">
                                    <textarea class="form-control input-sm" name="remark" placeholder="请输入备注，500字以内" maxlength="500" rows="3">${m.remark}</textarea>
                                </div>
                            </td>
                        </tr>

                    </table>
                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" id="toolBar">



                <button type="button" class="btn btn-primary btn-sm btn-showEdit" onclick="switchEditDetail()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-edit"></use>
                    </svg>
                    <span>编 辑</span>
                </button>

                <button type="button" class="btn  btn-warning btn-sm btn-showEdit" onclick="closeWindow()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-chexiao"></use>
                    </svg>
                    <span>返 回</span>
                </button>


                <button type="button" class="btn btn-primary btn-sm hide" onclick="doUpdate()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-save-continue"></use>
                    </svg>
                    <span>保 存</span>
                </button>
                <button type="button" class="btn  btn-warning btn-sm hide" onclick="switchEditDetail()">
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

    //显示模式   明细/编辑
    var showMode = "detail";

</script>





<bms:contentJS />

<script src="${staticUrl}/statics2/js/project/form.js"></script>


<script src="${staticUrl}/statics2/business-js/system/user.js"></script>
<script src="${staticUrl}/statics2/business-js/system/dep.js"></script>


<script language="JavaScript">

    /*

        //绑定区域选择弹窗
        $('.areaInfo').OpenAreaSelectWin({
            title: '省市',
            selectType: 't1',
            callId: 'areaId',
            callName: 'areaName',
            clearId: 'clearAreaInfo',
            isSelectedLeaf: "true",
            checkFun: function(id, name, obj){
                if(obj.parentId <= 1){
                    warn('请选择市名称');
                    return false;
                }
                return true;
            }
        }, function(id, name, obj){
            $("#areaName").val(obj.parentName + ">" + name);
        });

        //部门选择
        $(".sysdepInfo").OpenSysDepSelectWin({title: "部门",selectType: "t1",callId: "deptId",callName: "deptName",clearId: "clearSysdepInfo"});

    */


    $(function() {
        //人员选择
        $(".leadUserName").OpenSystemUserSelectWin({
            title: "直属领导",
            selectType: "d1",
            callId: "leadUserId",
            callName: "leadUserName",
            clearId: "clearLeadUserId"
        });


    });


</script>

<bms:contentFooter />

