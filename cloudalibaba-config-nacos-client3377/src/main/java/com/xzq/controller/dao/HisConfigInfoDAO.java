package com.xzq.controller.dao;

import com.xzq.springcloud.entities.HisConfigInfo;
import org.springframework.stereotype.Repository;

/**
 * HisConfigInfoDAO继承基类
 */
@Repository
public interface HisConfigInfoDAO extends MyBatisBaseDao<HisConfigInfo, Long> {
}