package cn.kpl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class Home {

    private final Logger logger = LoggerFactory.getLogger(Home.class);

    @RequestMapping("/")
    public String welcome(HttpServletRequest request, HttpServletResponse response) {
        String remoteAddr = request.getRemoteAddr();
        int port = request.getRemotePort();

        logger.info("request from: " + remoteAddr + ":" + port);

        return "index.html";
    }
}
