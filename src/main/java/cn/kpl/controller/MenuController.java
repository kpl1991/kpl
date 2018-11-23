package cn.kpl.controller;

import cn.kpl.model.SysMenuModel;
import cn.kpl.service.SysMenuService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/system")
public class MenuController {

    @Resource(name = "sysMenuService")
    private SysMenuService menuService;

    /*
        基于@CrossOrigin跨域
     */
    @CrossOrigin
    @RequestMapping("/findMenus")
    public List<SysMenuModel> findMenus(@RequestParam(value = "p_menu_id", required = false) String p_menu_id) {
        Map<String, String> filter = new HashMap<>();
        filter.put("p_menu_id", p_menu_id);
        List<SysMenuModel> menuList = menuService.findMenus(filter);
        return menuList;
    }

    /*
      基于JSONP跨域
     */
    @RequestMapping("/findMenus2")
    public List<SysMenuModel> findMenus2(@RequestParam(value = "p_menu_id", required = false) String p_menu_id) {

        return null;
    }
}
