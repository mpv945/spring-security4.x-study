package org.lc.study.spring.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lengchuan <lishuijun1992@gmail.com>
 * @desc helloworld test
 * @date 2017/6/12 11:19
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    private final static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);


    @RequestMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Map tets() {
        Map<String, Object> map = new HashMap<>();
        map.put("hello", "hellow orld");
        return map;
    }

}
