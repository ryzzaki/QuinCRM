/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincrm;

/**
 *
 * @author cuong
 */
public class CurrentUser {

    private static String userfname;
    private static String userlname;
    private static String username;
    private static String userpass;
    private static String userPC;

    public void setFname(String newName) {
        CurrentUser.userfname = newName;
    }

    public String getFname() {
        return userfname;
    }

    public void setLname(String newName) {
        CurrentUser.userlname = newName;
    }

    public String getLname() {
        return userlname;
    }

    public void setUsername(String newName) {
        CurrentUser.username = newName;
    }

    public String getUsername() {
        return username;
    }

    public void setUserpass(String newName) {
        CurrentUser.userpass = newName;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserPC(String newName) {
        CurrentUser.userPC = newName;
    }

    public String getUserPC() {
        return userPC;
    }
}
