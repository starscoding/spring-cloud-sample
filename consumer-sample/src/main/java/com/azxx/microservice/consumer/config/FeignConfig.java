package com.azxx.microservice.consumer.config;

import org.jboss.logging.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * <p>
 * TODO(一句话描述该类的功能)
 * </p>
 *
 * @author xuzheng
 * @since 2020/3/7 22:54
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        //这里记录所有，根据实际情况选择合适的日志level
        return Logger.Level.INFO;
    }
}
