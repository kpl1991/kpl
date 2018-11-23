package cn.kpl.model;

import java.io.Serializable;

public class SysMenuModel implements Serializable {

   private String menu_id;
   private String menu_nm;
   private String menu_url;
   private String p_menu_id;

    public String getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(String menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_nm() {
        return menu_nm;
    }

    public void setMenu_nm(String menu_nm) {
        this.menu_nm = menu_nm;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public String getP_menu_id() {
        return p_menu_id;
    }

    public void setP_menu_id(String p_menu_id) {
        this.p_menu_id = p_menu_id;
    }
}
