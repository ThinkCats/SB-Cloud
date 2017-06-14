package com.sbt.client;

import com.sbt.client.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hehe on 2017/6/5.
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return consumerService.addService();
    }
}
