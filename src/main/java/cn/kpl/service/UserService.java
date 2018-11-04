package cn.kpl.service;

import cn.kpl.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> findUser(Map<String,String> filter);
}
