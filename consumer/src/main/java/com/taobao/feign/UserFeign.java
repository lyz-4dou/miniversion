package com.taobao.feign;

import com.taobao.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "user",path = "/user")
public interface UserFeign {
    @GetMapping("/findAll")
    List<User> findAll();
}
