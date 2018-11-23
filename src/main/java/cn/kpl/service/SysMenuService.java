package cn.kpl.service;

import cn.kpl.model.SysMenuModel;

import java.util.List;
import java.util.Map;

public interface SysMenuService {

    List<SysMenuModel> findMenus(Map<String, String> filter);
}
