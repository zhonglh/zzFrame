
package com.zz.bms.controller.base;

import com.google.common.collect.Maps;
import com.zz.bms.util.spring.MessageUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/**
 * 许可处理逻辑类
 * @author Administrator
 */
public class PermissionList implements Serializable {

    public static final String CREATE_PERMISSION = "add";
    public static final String UPDATE_PERMISSION = "update";
    public static final String DELETE_PERMISSION = "delete";
    public static final String VIEW_PERMISSION = "detail";
    public static final String IMPORT_PERMISSION = "importExcel";
    public static final String EXPORT_PERMISSION = "exportExcel";

    /**
     * 资源前缀
     */
    private String resourceIdentity;

    /**
     * key:    权限
     * value : 资源
     */
    private Map<String, String> resourcePermissions = Maps.newHashMap();


    /**
     * 自动生成 create update delete 的权限串
     *
     * @param resourceIdentity
     * @return
     */
    public static PermissionList newPermissionList(String resourceIdentity) {

        PermissionList permissionList = new PermissionList();

        permissionList.resourceIdentity = resourceIdentity;

        permissionList.resourcePermissions.put( resourceIdentity + ":" + CREATE_PERMISSION      , CREATE_PERMISSION);
        permissionList.resourcePermissions.put( resourceIdentity + ":" + UPDATE_PERMISSION      ,UPDATE_PERMISSION);
        permissionList.resourcePermissions.put( resourceIdentity + ":" + DELETE_PERMISSION      ,DELETE_PERMISSION);
        permissionList.resourcePermissions.put( resourceIdentity + ":" + VIEW_PERMISSION        ,VIEW_PERMISSION);
        permissionList.resourcePermissions.put( resourceIdentity + ":" + IMPORT_PERMISSION      ,IMPORT_PERMISSION);
        permissionList.resourcePermissions.put( resourceIdentity + ":" + EXPORT_PERMISSION      ,EXPORT_PERMISSION);

        return permissionList;
    }


    /**
     * 添加权限 自动生成如showcase:sample:permission
     *
     * @param permission
     */
    public void addPermission(String permission) {
        resourcePermissions.put(permission, resourceIdentity + ":" + permission);
    }


    public void assertHasCreatePermission() {
        assertHasPermission(CREATE_PERMISSION, "no.create.permission");
    }

    public void assertHasUpdatePermission() {
        assertHasPermission(UPDATE_PERMISSION, "no.update.permission");
    }

    public void assertHasDeletePermission() {
        assertHasPermission(DELETE_PERMISSION, "no.delete.permission");
    }

    public void assertHasViewPermission() {
        assertHasAnyPermission("no.any.permission");
    }


    public void assertHasImportPermission() {
        assertHasPermission(IMPORT_PERMISSION, "no.import.permission");
    }

    public void assertHasExportPermission() {
        assertHasPermission(EXPORT_PERMISSION, "no.export.permission");
    }


    public String getPermission(String permission){
        for(String key : resourcePermissions.keySet()){
            String val = resourcePermissions.get(key);
            if(key.equals(permission) || val.equals(permission) ){
                return key;
            }
        }
        return null;
    }


    /**
     * 即增删改中的任何一个即可
     */
    public void assertHasEditPermission() {
        assertHasAnyPermission(new String[]{
                CREATE_PERMISSION,
                UPDATE_PERMISSION,
                DELETE_PERMISSION
        });
    }

    public void assertHasPermission(String permission) {
        assertHasPermission(permission, null);
    }

    public void assertHasPermission(String permission, String errorCode) {
        if (StringUtils.isEmpty(errorCode)) {
            errorCode = getDefaultErrorCode();
        }
        String resourcePermission = getPermission(permission);
        if (resourcePermission == null) {
            resourcePermission = this.resourceIdentity + ":" + permission;
        }

        checkPermission(resourcePermission , errorCode);

    }



    /**
     * 检查是否有权限
     * 如果没有使用Shiro 来管理权限， 可以重载该方法
     * @param resourcePermission
     */
    public void checkPermission(String resourcePermission ,String errorCode){
        if (!SecurityUtils.getSubject().isPermitted(resourcePermission)) {
            throw new UnauthorizedException(MessageUtils.message(errorCode, resourcePermission));
        }
    }

    public void assertHasAllPermission(String[] permissions) {
        assertHasAllPermission(permissions, null);
    }

    public void assertHasAllPermission(String[] permissions, String errorCode) {
        if (StringUtils.isEmpty(errorCode)) {
            errorCode = getDefaultErrorCode();
        }

        if (permissions == null || permissions.length == 0) {
            throw new UnauthorizedException(MessageUtils.message(errorCode, resourceIdentity + ":" + Arrays.toString(permissions)));
        }

        Subject subject = SecurityUtils.getSubject();

        for (String permission : permissions) {
            String resourcePermission = getPermission(permission);
            if (resourcePermission == null) {
                resourcePermission = this.resourceIdentity + ":" + permission;
            }
            if (!subject.isPermitted(resourcePermission)) {
                throw new UnauthorizedException(MessageUtils.message(errorCode, resourceIdentity + ":" + Arrays.toString(permissions)));
            }
        }

    }

    public void assertHasAnyPermission(String[] permissions) {
        assertHasAnyPermission(permissions, null);
    }





    public void assertHasAnyPermission(String[] permissions, String errorCode) {
        if (StringUtils.isEmpty(errorCode)) {
            errorCode = getDefaultErrorCode();
        }
        if (permissions == null || permissions.length == 0) {
            throw new UnauthorizedException(MessageUtils.message(errorCode, resourceIdentity + ":" + Arrays.toString(permissions)));
        }

        Subject subject = SecurityUtils.getSubject();

        for (String permission : permissions) {
            String resourcePermission = getPermission(permission);
            if (resourcePermission == null) {
                resourcePermission = this.resourceIdentity + ":" + permission;
            }
            if (subject.isPermitted(resourcePermission)) {
                return;
            }
        }

        throw new UnauthorizedException(MessageUtils.message(errorCode, resourceIdentity + ":" + Arrays.toString(permissions)));
    }




    public void assertHasAnyPermission(String errorCode) {
        if(StringUtils.isEmpty(errorCode)) {
            errorCode = getDefaultErrorCode();
        }

        Subject subject = SecurityUtils.getSubject();

        for (String resourcePermission : resourcePermissions.keySet()) {
            if (subject.isPermitted(resourcePermission)) {
                return;
            }
        }

        throw new UnauthorizedException(MessageUtils.message(errorCode));
    }


    public Map<String, String> getResourcePermissions() {
        return resourcePermissions;
    }

    private String getDefaultErrorCode() {
        return "no.permission";
    }

}
