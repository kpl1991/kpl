package cn.kpl.mapper;

import cn.kpl.model.SysMenuModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysMenuMapper {

    List<SysMenuModel> findMenus(Map<String, String> filter);
}
