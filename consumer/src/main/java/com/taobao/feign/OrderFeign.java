package com.taobao.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "order")
public interface OrderFeign {
}
