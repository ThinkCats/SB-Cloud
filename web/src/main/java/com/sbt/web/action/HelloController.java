package com.sbt.web.action;

import com.sbt.web.domain.Customer;
import com.sbt.web.domain.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by hehe on 2017/5/24.
 */
@Slf4j
@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        List<Customer> customers = customerRepository.findByLastName("wang");
        log.info("===> Customers : {}", customers.toString());
        modelMap.addAttribute("message","foo bar.");
        return "hello";
    }

}
