package com.azxx.microservice.consumer.feign;

import com.azxx.microservice.consumer.config.FeignConfig;
import com.azxx.microservice.consumer.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 * TODO(一句话描述该类的功能)
 * </p>
 *
 * @author xuzheng
 * @since 2020/3/7 22:42
 */
@FeignClient(name = "provider",configuration = FeignConfig.class,fallback = UserFeignFallback.class)
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    User findById(@PathVariable Long id);
}
