package cn.kpl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Test {

    @RequestMapping("/test")
    public Map greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("name","hello "+name);
        map.put("id", "123");
        return map;
    }
}
