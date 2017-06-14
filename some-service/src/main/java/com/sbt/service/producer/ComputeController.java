package com.sbt.service.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hehe on 2017/6/5.
 */
@Slf4j
@RestController
public class ComputeController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        log.info("Request Compute Remote Service,Port 2222,Result is {}", a + b);
        return a + b;
    }
}
