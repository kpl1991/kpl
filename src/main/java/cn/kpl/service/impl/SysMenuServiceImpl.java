package cn.kpl.service.impl;

import cn.kpl.mapper.SysMenuMapper;
import cn.kpl.model.SysMenuModel;
import cn.kpl.service.SysMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {

    @Resource
    private SysMenuMapper menuMapper;

    public List<SysMenuModel> findMenus(Map<String,String> filter){
        return menuMapper.findMenus(filter);
    }
}
