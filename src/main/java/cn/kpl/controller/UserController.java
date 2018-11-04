package cn.kpl.controller;

import cn.kpl.model.User;
import cn.kpl.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Resource(name="userService")
    private UserService userService;

    @RequestMapping("/findUser")
    public List<User> findUser(@RequestParam(value="name", defaultValue="World") String name) {
        List<User> userList = userService.findUser(null);
        return userList;
    }
}
