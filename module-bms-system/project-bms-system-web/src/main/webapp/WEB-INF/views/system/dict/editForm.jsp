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


                <div id="detailInfo" class="detailInfo">
                    <table class="info-table">

                        <colgroup>
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                            <col style="width: 15%" />
                            <col style="width: 35%" />
                        </colgroup>

                        <tbody>
                            <tr>
                                <th>字典名<font color="red">*</font></th>

                                <td class="fd_dictName">
                                    ${ m.dictName }
                                </td>

                                <th>字典值<font color="red">*</font></th>

                                <td class="fd_dictVal">
                                        ${ m.dictVal }
                                </td>


                            </tr>


                            <tr>
                                <th>名称国际化</th>

                                <td class="fd_dictI18n">
                                        ${ m.dictI18n }
                                </td>
                                <th>字典限制正则</th>

                                <td class="fd_dictReg">
                                    ${ m.dictReg }
                                </td>

                            </tr>


                            <tr>
                                <th>顺序<font color="red">*</font></th>
                                <td class="fd_orderby">
                                        ${ m.orderby }
                                </td>

                            </tr>

                        </tbody>


                    </table>
                </div>


                <form action="" method="post" class="form-auto-fill hide editForm" id="editForm" viewId="detailInfo" formId="editForm">
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
                                    <th>字典名<font color="red">*</font></th>
                                    <td>
                                        <input type="text" required="required" class="form-control input-sm required"
                                               placeholder="请输入字典名" autocomplete="off"
                                               value="${ m.dictName }" id="dictName" name="dictName"
                                               maxlength="50"  />
                                    </td>
                                    <th>字典值<font color="red">*</font></th>
                                    <td>
                                        <input type="text" id="dictVal" name="dictVal" maxlength="2" value="${m.dictVal}"
                                               required="required" class="form-control input-sm required"
                                               placeholder="请输入字典值" autocomplete="off">
                                    </td>

                                </tr>


                                <tr>
                                    <th>名称国际化</th>
                                    <td>
                                                <input type="text"  class="form-control input-sm "
                                                       placeholder="请输入名称国际化" autocomplete="off"
                                                       value="${ m.dictI18n }" id="dictI18n" name="dictI18n"
                                                           maxlength="100"  />
                                    </td>
                                    <th>字典限制正则</th>
                                    <td>
                                        <input type="text"  class="form-control input-sm "
                                               placeholder="请输入字典限制正则" autocomplete="off"
                                               value="${ m.dictReg }" id="dictReg" name="dictReg"
                                               maxlength="100"  />
                                    </td>
                                </tr>


                                <tr>
                                    <th>顺序<font color="red">*</font></th>
                                    <td>
                                                <input type="text" required="required" class="form-control input-sm number required"
                                                       placeholder="请输入顺序" autocomplete="off"
                                                       value="${ m.orderby }" id="orderby" name="orderby" maxlength="10"  />
                                    </td>


                                </tr>



                        </tbody>


                    </table>
                </form>
            </div>

            <div style="margin-top:10px;position:absolute;" align="center" class="toolBar">



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
    var inAllPage = "${inAllPage}";
</script>





<bms:contentJS />


<script src="${ staticUrl }/statics2/js/project/form.js"></script>


    <script src="${ staticUrl }/statics2/business-js/system/dicttype/search.js"></script>



<script language="JavaScript">



</script>

<bms:contentFooter />