package com.azxx.microservice.consumer.feign;

import com.azxx.microservice.consumer.entity.User;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * <p>
 * TODO(一句话描述该类的功能)
 * </p>
 *
 * @author xuzheng
 * @since 2020/3/8 12:35
 */
@Component
public class UserFeignFallback implements UserFeignClient{
    @Override
    public User findById(Long id) {
        return new User(id, "默认用户2", "默认用户2", 0, new BigDecimal(1));

    }
}
