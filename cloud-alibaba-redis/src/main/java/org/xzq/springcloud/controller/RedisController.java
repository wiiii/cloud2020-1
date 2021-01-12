package org.xzq.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xzq.springcloud.service.RedisService;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/get")
    public Object blog(String key) {
        return redisService.get(key);
    }

    @RequestMapping("/inset")
    public void inset(String key) {
        redisService.set(key, "value");
    }
}
