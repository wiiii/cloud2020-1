package org.xzq.springcloud.service.impl;

import com.xzq.springcloud.entities.HisConfigInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.xzq.springcloud.service.ProducerFeign;
import org.xzq.springcloud.service.RedisService;
import org.xzq.springcloud.service.TestService;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    private ProducerFeign producerFeign;

    @Autowired
    private RedisService redisService;

    @Override
    public Object listInfo() {
        List<Object> list = redisService.lGet("listInfo", 0, -1);
        if (CollectionUtils.isEmpty(list)) {
            List<HisConfigInfo> result = producerFeign.listInfo();
            LOGGER.info("=================从数据库中获取数据:{}=================", result);
            redisService.lSet("listInfo", result, 60);
            return result;
        }
        LOGGER.info("=================从Redis中获取数据:{}=================", list);
        return list;
    }
}
