package com.wuxc.service01.apiservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by silivar on 2018/9/18.
 */
//1.标注成为一个spring mvc的Controller

@RestController
@RequestMapping("/rest/v1")
public class ApiService {
    private static final Logger logger = LoggerFactory.getLogger(ApiService.class);
    private static String param01 = System.getenv("TEST_PARAM_01");

    @RequestMapping(value = "/service01")
    public String hello() {

        logger.error("index start");
        return "param01_gery_" + param01;
    }


}
