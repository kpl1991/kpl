package cn.kpl.controller;

import cn.kpl.model.SysUserModel;
import cn.kpl.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource(name="userService")
    private UserService userService;

    @RequestMapping("/findUser")
    public List<SysUserModel> findUser(@RequestParam(value="name", defaultValue="World") String name) {
        List<SysUserModel> userList = userService.findUser(null);
        return userList;
    }
}
