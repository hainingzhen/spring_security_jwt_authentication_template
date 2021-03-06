package com.sgone.capstone.security.access_definitions;


/**
 * This class defines all the permissions available for this project.
 * <br><br>
 * <b><i>READ_SELF</i></b> - Allowing an authenticated user to read all information stored on the database about the user.
 * <br><br>
 * <b><i>READ_ALL</i></b> - Allowing an authenticated user to read all information stored on the database about all users with
 * said role prefix.
 * <br><br>
 * Example - An authenticated user with <i>APP_ADMIN_READ_ALL</i> permission means this user can read information stored
 * on the database of all ADMIN level users.
 * <br><br>
 * The <b><i>getPermission</i></b> method returns the <i>String</i> <b>permission</b> associated with each constant.
 */
public enum UserPermission {
    // Permission to Read and Edit OWNER level account information
    APP_OWNER_READ_SELF("app_owner:read_self"),
    APP_OWNER_WRITE_SELF("app_owner:write_self"),

    // Permission to Read and Edit ADMIN level account information
    APP_ADMIN_READ_ALL("app_admin:read_all"),
    APP_ADMIN_WRITE_ALL("app_admin:write_all"),
    APP_ADMIN_READ_SELF("app_admin:read_self"),
    APP_ADMIN_WRITE_SELF("app_admin:write_self"),

    // Permission to Read and Edit normal APP USER level account information
    APP_USER_READ_ALL("app_user:read_all"),
    APP_USER_WRITE_ALL("app_user:write_all"),
    APP_USER_READ_SELF("app_user:read_self"),
    APP_USER_WRITE_SELF("app_user:write_self");

    /*
        TODO: Add more permissions here depending on application functionalities
     */

    private final String permission;

    UserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
