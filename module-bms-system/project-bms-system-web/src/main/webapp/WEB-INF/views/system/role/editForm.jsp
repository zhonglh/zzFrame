<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader />




<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">


                <form action="" method="post" id="editForm" viewId="editForm" >

                    <div class="block-tit">
                        &nbsp;<i class="fa fa-th-list"></i>&nbsp;基本信息
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

                            <th>角色名称<font color="red">*</font></th>

                            <td class="fd_roleName">${ m.roleName }</td>

                            <th>角色编号<font color="red">*</font></th>

                            <td class="fd_roleCode">${ m.roleCode }</td>


                        </tr>


                        <tr>
                            <th>备注</th>
                            <td colspan="3" class="fd_remark"><c:out value="${m.remark}" escapeXml="true"/></td>
                        </tr>


                        <tr>
                            <th>许可设置</th>

                            <td colspan="3">

                                <div class="easyui-panel" style="padding:5px">
                                    <ul id="permitSelectedTree" class="easyui-tree" idField="id" treeField="text"></ul>
                                </div>

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

                                <th>角色名称<font color="red">*</font></th>

                                <td>
                                    <input type="text" required="required" class="form-control input-sm required"
                                           placeholder="请输入角色名称" autocomplete="off"
                                           value="${ m.roleName }" id="roleName" name="roleName"    maxlength="50"  />
                                </td>



                                <th>角色编号<font color="red">*</font></th>

                                <td>
                                    <input type="text" required="required" class="form-control input-sm required"
                                           placeholder="请输入角色编号" autocomplete="off"
                                           value="${ m.roleCode }" id="roleCode" name="roleCode"    maxlength="20"  />
                                </td>
                            </tr>



                            <tr>
                                <th>备注</th>

                                <td colspan="3">

                                            <textarea class="form-control input-sm" name="remark" id="remark"
                                                      placeholder="请输入备注，200字以内" maxlength="200" rows="4">${ m.remark }</textarea>
                                </td>



                            </tr>




                            <tr>
                                <th>许可设置</th>

                                <td colspan="3">

                                    <div class="easyui-panel" style="padding:5px">
                                        <ul id="rolePermitTree" class="easyui-tree" idField="id" treeField="text"></ul>
                                    </div>

                                </td>



                            </tr>

                        </tbody>

                    </table>

                    <input type="hidden" id="permitIds" name="permitIds">
                </form>
            </div>


            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">

                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm hide-area" onclick="openEdit()">
                        <i class="fa fa-edit"></i>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm hide-area" onclick="closeWindow()">
                    <i class="fa fa-mail-reply"></i>
                    <span>返 回</span>
                </button>

                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm show-area" onclick="doUpdate()">
                        <i class="fa fa-save"></i>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm show-area" onclick="cancelEdit()">
                    <i class="fa fa-close"></i>
                    <span>取 消</span>
                </button>

            </div>
        </div>
    </div>
</div>





<script>

    var inAllPage = "${inAllPage}";

</script>





<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>
<script src="${ staticUrl }/statics2/business-js/system/dep/search.js"></script>

<script language="JavaScript">


    $(function() {

        //,
        //onlyLeafCheck:true

        $("#rolePermitTree").tree({
            url:'${ctx}/system/role/permitTree/${m.id}',
            animate:true,
            checkbox : true
        });

        $("#permitSelectedTree").tree({
            url:'${ctx}/system/role/permitSelectedTree/${m.id}',
            animate:true
        });

        $(function() {

            //选择部门
            $(".depName").OpenSystemDepSelectWin({
                title: "部门",
                selectType: "t1",
                callId: "depId",
                callName: "depName",
                clearId: "clearDepId"
            });

        });

    });

    /**
     * 获取选中的许可ID
     * @returns {string}
     */
    function getTreeCheckedNode(){
        var nodes = $("#rolePermitTree").tree('getChecked');
        if(nodes && nodes.length > 0){
            var ids = new Array();
            $.each(nodes,function(index,node){
                if(node.attributes.treeType === "permit") {
                    ids.push(node.id);
                }
            });
            return  ids.join(',');
        }
        return "";
    }

    /**
     * 将选择的许可放到隐藏域中
     */
    function customDoHandle(){
        var permitIds = getTreeCheckedNode();
        var permit = $("#permitIds");
        if(permit){
            permit.val(permitIds);
        }else {
            var html = "<input type='hidden' name='permitIds' value='"+permitIds+"'>";
            $("#editForm").append($(html));
        }
    }


    function updateAfter(){
        $("#permitSelectedTree").tree({
            url:'${ctx}/system/role/permitSelectedTree/${m.id}',
            animate:true
        });


        $("#rolePermitTree").tree({
            url:'${ctx}/system/role/permitTree/${m.id}',
            animate:true,
            checkbox : true
        });
    }


</script>

<bms:contentFooter />