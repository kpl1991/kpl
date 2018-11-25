package cn.kpl.mapper;

import cn.kpl.model.SysUserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    List<SysUserModel> findUser(Map<String,String> filter);
}
