package com.my.blog.website.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author yushijun
 * @date 2019/1/22
 * @description
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*180)
public class SpringRedisSessionConfiguration {
}
