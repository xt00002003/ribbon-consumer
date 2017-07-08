package com.example.dark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon-consumer
 * User: dark xue
 * Date: 2017/7/8
 * Time: 15:17
 * description:
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/demo/index",String.class).getBody();
    }
}
