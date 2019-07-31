package com.zha.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by zha on 2019/4/12.
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 30*60)
public class SessionConfig {

}
