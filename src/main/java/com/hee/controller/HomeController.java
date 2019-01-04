package com.hee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HomeController {
//    hee.com package 하위: <logger name="com.hee" additivity="false">을 상속받음 -> DEBUG level
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//    private static final Logger logger = LoggerFactory.getLogger("hee.com.controller.HomeController");

    @GetMapping(value = "/")
    public String home(Locale locale, HttpServletRequest request) {
//        DEBUG level 이므로 trace는 출력안됨
        logger.trace("trace level: Welcome home! The client locale is {}", locale);
        logger.debug("debug level: Welcome home! The client locale is {}", locale);
        logger.info("info level: Welcome home! The client locale is {}", locale);
        logger.warn("warn level: Welcome home! The client locale is {}", locale);
        logger.error("error level: Welcome home! The client locale is {}", locale);

//        사용자 추적
        String url = request.getRequestURL().toString();
        String clientIPAddress = request.getRemoteAddr();
        logger.info("Request URL: " + url);
        logger.info("Client IP: " + clientIPAddress);

        return "index";
    }
}
