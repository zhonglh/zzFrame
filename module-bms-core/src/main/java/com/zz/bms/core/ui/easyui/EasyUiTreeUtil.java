package com.zz.bms.core.ui.easyui;


import com.zz.bms.core.db.entity.EntityUtil;

import java.util.*;


/**
 * @author zhonglh
 */
public class EasyUiTreeUtil {





    public static List<EasyUiTree> buildToOnlySelectedTree(List<EasyUiTree> nodes,List<String> selectIds) {
        return buildToOnlySelectedTree(nodes , "所有" ,  selectIds );
    }


    public static List<EasyUiTree> buildToOnlySelectedTree(List<EasyUiTree> nodes,String rootNodeName ,List<String> selectIds) {
        if(selectIds == null || selectIds.isEmpty()){
            return new ArrayList<EasyUiTree>();
        }

        List<EasyUiTree> list = new ArrayList<EasyUiTree>();

        for(String id : selectIds){
            List<EasyUiTree> selectNodes = getParentNodes(nodes , id);
            if(selectNodes != null){
                list.addAll(selectNodes);
            }
        }

        Map<String,EasyUiTree> treeMap = new HashMap<String ,EasyUiTree>();
        for(EasyUiTree node : list){
            treeMap.put(node.getId() , node);
        }


        return buildToTree(new ArrayList<>(treeMap.values()) , rootNodeName);


    }


    public static List<EasyUiTree> getParentNodes(List<EasyUiTree> nodes,String nodeId) {
        EasyUiTree selfNode = geNode(nodes , nodeId);
        if(selfNode == null){
            return null;
        }

        List<EasyUiTree> allNode = new ArrayList<EasyUiTree>();
        allNode.add(selfNode);

        if(EntityUtil.isEmpty(selfNode.getPid())){
            return allNode;
        }

        EasyUiTree temp = selfNode ;
        while (true){

            if(EntityUtil.isEmpty(temp.getPid())){
                break;
            }
            EasyUiTree parentNode = geNode(nodes , temp.getPid());
            if(parentNode != null){
                allNode.add(parentNode);
                temp = parentNode;
            }else {
                break;
            }
        }


        return allNode;

    }

    /**
     * 获取节点
     * @param nodes
     * @param nodeId
     * @return
     */
    public static EasyUiTree geNode(List<EasyUiTree> nodes,String nodeId) {

        for(EasyUiTree node : nodes){
            if(node.getId().equals(nodeId)){
                return node;
            }
        }
        return null;
    }


    /**
     * 将列表方式的数据转换为 EasyUI格式的树状数据
     * @param nodes
     * @param rootNodeName
     * @return
     */
    public static List<EasyUiTree> buildToTree(List<EasyUiTree> nodes,String rootNodeName) {
        return buildToTree(nodes , rootNodeName ,  null );
    }

    /**
     * 将列表方式的数据转换为 EasyUI格式的树状数据
     * @param nodes
     * @param selectIds
     * @return
     */
    public static List<EasyUiTree> buildToTree(List<EasyUiTree> nodes,List<String> selectIds) {
        return buildToTree(nodes , "所有" ,  selectIds );
    }

    /**
     * 将列表方式的数据转换为 EasyUI格式的树状数据
     * @param nodes
     * @param rootNodeName
     * @param selectIds
     * @return
     */
    public static List<EasyUiTree> buildToTree(List<EasyUiTree> nodes,String rootNodeName ,List<String> selectIds) {

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
       /* EasyUiTree root = new EasyUiTree();
        if (topNodes.size() == 1) {
            root = topNodes.get(0);
        } else {
            root.setId("-1");
            root.setPid("");
            root.setChildren(topNodes);
            root.setText(rootNodeName);
        }
        return root;*/

        return topNodes;

    }
}