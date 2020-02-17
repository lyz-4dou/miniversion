package com.taobao.feign;

import com.taobao.entity.User;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "commodity")
public interface CommodityFeign {
}
