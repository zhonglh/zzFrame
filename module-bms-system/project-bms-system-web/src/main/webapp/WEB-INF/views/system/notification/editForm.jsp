<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/common/taglibs.jspf" %>
<bms:contentHeader title="zz" />




<div style="padding:0 10px">
    <div class="row">
        <div class="col-xs-12 col-lg-12 col-md-12" style="padding-left: 0;padding-right: 0">
            <div class="block-each block-each-another">
                <div class="block-tit">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-youjiantou"></use>
                    </svg>基本信息
                </div>


                <div id="detailForm" class="detailForm">
                    <table class="info-table">

                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>


                                <tr>

                                    <th>模块</th>

                                    <td class="fd_notifyModule">
                                            ${ m.notifyModule }


                                    </td>

                                    <th>通知标题</th>

                                    <td>
                                            ${ m.title }
                                    </td>


                                </tr>


                                <tr>

                                    <th>通知内容<font color="red">*</font></th>

                                    <td class="fd_content">
                                            ${ m.content }


                                    </td>

                                    <th>通知时间<font color="red">*</font></th>

                                    <td>
                                            <fmt:formatDate value="${ m.notifyTime }" pattern="yyyy-MM-dd  HH:mm:ss" />
                                    </td>


                                </tr>


                                <tr>

                                    <th>通知文件</th>

                                    <td class="fd_notifyFiles">
                                            ${ m.notifyFiles }


                                    </td>



                                </tr>



                    </table>
                </div>


                <form action="" method="post" class="form-auto-fill hide editForm" id="editForm" viewId="detailForm" formId="editForm">
                    <input type="hidden" id="id" name="id" value="${ m.id }">
                    <table class="info-table">
                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>

                                <tr>

                                    <th>模块</th>

                                    <td>


                                                <input type="text"  class="form-control input-sm "
                                                       placeholder="请输入模块" autocomplete="off"
                                                       value="${ m.notifyModule }" id="notifyModule" name="notifyModule"
                                                           maxlength="100"  />



                                    </td>



                                        <th>通知标题</th>

                                        <td>





                                                    <input type="text"  class="form-control input-sm "
                                                           placeholder="请输入通知标题" autocomplete="off"
                                                           value="${ m.title }" id="title" name="title"
                                                               maxlength="100"  />




                                        </td>


                                </tr>


                                <tr>

                                    <th>通知内容<font color="red">*</font></th>

                                    <td>



                                                <div class="info-detail">
                                                    <textarea required="required" class="form-control input-sm required "
                                                              name="content " placeholder="请输入通知内容，65535字以内" maxlength="65535" rows="6"><c:out value="${ m.content $}" escapeXml="true"/></textarea>
                                                </div>





                                    </td>



                                        <th>通知时间<font color="red">*</font></th>

                                        <td>






                                                    <div class="input-group">



                                                        <input type="text" required="required" class="form-control input-sm required"
                                                               placeholder="请输入通知时间" autocomplete="off"
                                                               onclick="WdatePicker({dateFmt: 'yyyy-MM-dd', el: 'notifyTime'})
                                                                       value="${ m.notifyTime }" id="notifyTime" name="notifyTime" readonly   />

                                                        <div class="input-group-btn">
                                                            <button type="button" class="btn btn-primary btn-sm" onclick="document.getElementById('notifyTime').click()">
                                                                <svg class="icon" aria-hidden="true">
                                                                    <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-rili"></use>
                                                                </svg>
                                                            </button>
                                                            <button type="button" class="btn btn-primary btn-sm" onclick="clearTime(NotifyTime);">
                                                                <svg class="icon" aria-hidden="true">
                                                                    <use  xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-close"></use>
                                                                </svg>
                                                            </button>
                                                        </div>

                                                    </div>




                                        </td>


                                </tr>


                                <tr>

                                    <th>通知文件</th>

                                    <td>




                                    </td>



                                </tr>


                        </tbody>


                    </table>
                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" id="toolBar">



                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm btn-showEdit" onclick="switchEditDetail()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-edit"></use>
                        </svg>
                        <span>编 辑</span>
                    </button>
                </shiro:hasPermission>

                <button type="button" class="btn  btn-warning btn-sm btn-showEdit" onclick="closeWindow()">
                    <svg class="icon" aria-hidden="true">
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-chexiao"></use>
                    </svg>
                    <span>返 回</span>
                </button>


                <shiro:hasPermission name="system.user:update">
                    <button type="button" class="btn btn-primary btn-sm hide" onclick="doUpdate()">
                        <svg class="icon" aria-hidden="true">
                            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#icon-save-continue"></use>
                        </svg>
                        <span>保 存</span>
                    </button>
                </shiro:hasPermission>

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


    //显示模式   明细/编辑
    var showMode = "detail";

    var queryString = "${ queryString }";
</script>





<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>





<script language="JavaScript">


    $(function() {


    });


</script>

<bms:contentFooter />