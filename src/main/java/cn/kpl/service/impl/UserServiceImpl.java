package cn.kpl.service.impl;

import cn.kpl.mapper.UserMapper;
import cn.kpl.model.User;
import cn.kpl.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> findUser(Map<String,String> filter){
        return userMapper.findUser(filter);
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
