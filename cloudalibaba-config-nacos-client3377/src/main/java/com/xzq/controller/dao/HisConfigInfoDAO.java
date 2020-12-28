package com.xzq.controller.dao;

import com.xzq.controller.entity.HisConfigInfo;
import org.springframework.stereotype.Repository;

/**
 * HisConfigInfoDAO继承基类
 */
@Repository
public interface HisConfigInfoDAO extends MyBatisBaseDao<HisConfigInfo, Long> {
}