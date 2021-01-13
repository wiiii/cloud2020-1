package org.xzq.springcloud.service;

import com.xzq.springcloud.entities.HisConfigInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("nacos-config-client")
public interface ProducerFeign {

    @GetMapping("listInfo")
    List<HisConfigInfo> listInfo();
}
