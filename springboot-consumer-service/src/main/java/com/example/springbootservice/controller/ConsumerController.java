/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.example.springbootservice.controller;


import com.example.springbootservice.client.ServiceFeignClient;
import com.example.springbootservice.common.RestfulResult;
import com.example.springbootservice.entity.ServiceInfo;
import com.example.springbootservice.utils.CommUtils;
import com.example.springbootservice.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController // 重要，如果用Controller会404
@RequestMapping(value = "service")
public class ConsumerController {

    @Autowired
    private ServiceFeignClient serviceFeignClient;

    @RequestMapping(value = "/consumerService", method = RequestMethod.GET)
    public JsonResult consumerService(HttpServletRequest request, HttpServletResponse response,
                                      ServiceInfo serviceInfo) {

        JsonResult restfulResult = serviceFeignClient.hello(serviceInfo);


        return restfulResult;
    }

}