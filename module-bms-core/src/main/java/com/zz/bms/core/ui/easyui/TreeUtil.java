package com.zz.bms.core.ui.easyui;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author zhonglh
 */
public class TreeUtil {


    public static EasyUiTree buildToTree(List<EasyUiTree> nodes,String rootNodeName) {
        return buildToTree(nodes , rootNodeName ,  null );
    }


    public static EasyUiTree buildToTree(List<EasyUiTree> nodes,List<String> selectIds) {
        return buildToTree(nodes , "所有" ,  selectIds );
    }


    public static EasyUiTree buildToTree(List<EasyUiTree> nodes,String rootNodeName ,List<String> selectIds) {

        //如果节点的List为null，就返回null
        if (nodes == null) {
            return null;
        }

        Map<String , String> selectMap = null;
        if(selectIds != null && !selectIds.isEmpty()){
            selectMap = new HashMap<String,String>();
            for(String id : selectIds) {
                selectMap.put(id , id);
            }
        }

        //没有父节点节点列表
        List<EasyUiTree> topNodes = new ArrayList<EasyUiTree>();


        for (EasyUiTree children : nodes) {
            if(selectMap != null) {
                if (selectMap.containsKey(children.getId())){
                    children.setChecked(true);
                }
            }

            //遍历所有的节点，找出所有的顶级节点，将没有父节点的节点存起来
            String pid = children.getPid();
            if (pid == null || "".equals(pid)) {
                topNodes.add(children);
                //只要没有父节点，添加后就跳过
                continue;
            }

            //那么剩下的节点都是有父节点,我们给这个孩子节点找父亲节点
            for (EasyUiTree parent : nodes) {
                String id = parent.getId();

                if (id != null && id.equals(pid)) {
                    if(parent.getChildren() == null){
                        parent.setChildren(new ArrayList<EasyUiTree>());
                    }
                    parent.getChildren().add(children);
                    break;
                }
            }

        }

        //把根节点返回，如果父节点不只一个，我们给这些节点创建一个根节点
        EasyUiTree root = new EasyUiTree();
        if (topNodes.size() == 1) {
            root = topNodes.get(0);
        } else {
            root.setId("-1");
            root.setPid("");
            root.setChildren(topNodes);
            root.setText(rootNodeName);
        }
        return root;
    }
}