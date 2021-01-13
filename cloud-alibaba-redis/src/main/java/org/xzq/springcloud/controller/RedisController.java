package org.xzq.springcloud.controller;

import com.xzq.springcloud.entities.HisConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xzq.springcloud.service.ProducerFeign;
import org.xzq.springcloud.service.RedisService;
import org.xzq.springcloud.service.TestService;

import java.util.List;

@RestController
public class RedisController {

    @Autowired
    private TestService testService;

    @GetMapping("listInfo")
    public Object listInfo() {
        return testService.listInfo();
    }
}
