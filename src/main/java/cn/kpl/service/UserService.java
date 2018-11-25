package cn.kpl.service;

import cn.kpl.model.SysUserModel;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<SysUserModel> findUser(Map<String,String> filter);
}
