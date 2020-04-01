/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.example.springbootservice.controller;


import com.example.springbootservice.entity.ServiceInfo;
import com.example.springbootservice.utils.JsonResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController // 重要，如果用Controller会404
@RequestMapping(value = "service")
public class DemoController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public JsonResult login(HttpServletRequest request, HttpServletResponse response,
                            ServiceInfo serviceInfo) {

//        RestfulResult restfulResult = new RestfulResult();
//
//        try {
//            restfulResult.setData();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        CommUtils.printDataJason(response, restfulResult);

        return JsonResult.buildSuccessResult("Service1:Welcome " + serviceInfo.getName() + "!");
    }

    @RequestMapping(value = "rest", method = RequestMethod.POST)
    public String rest(@RequestBody ServiceInfo serviceInfo) {

        return "Service1:Welcome " + serviceInfo.getName() + " !";
    }
}