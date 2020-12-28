package com.xzq.controller.service.impl;

import com.xzq.controller.dao.HisConfigInfoMapper;
import com.xzq.controller.entity.HisConfigInfo;
import com.xzq.controller.service.HisConfigInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HisConfigInfoServiceImpl implements HisConfigInfoService {

    private final HisConfigInfoMapper mapper;

    @Autowired
    public HisConfigInfoServiceImpl(HisConfigInfoMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<HisConfigInfo> listInfo() {
        return mapper.selectList(null);
    }
}
