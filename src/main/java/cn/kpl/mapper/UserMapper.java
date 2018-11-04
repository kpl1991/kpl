package cn.kpl.mapper;

import cn.kpl.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    List<User> findUser(Map<String,String> filter);
}
