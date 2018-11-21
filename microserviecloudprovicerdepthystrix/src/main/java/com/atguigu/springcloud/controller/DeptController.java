package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    DeptService deptService;


   // @HystrixCommand(fallbackMethod = "hystrx_test")
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Dept getdeptbyid(@PathVariable("id") long id)
    {

      Dept dept=  deptService.getdeptbyid(id);
      if(dept==null)
      {
          throw new RuntimeException();
      }
       return dept;

    } ;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
      public List<Dept> getalldept()
    {
        return deptService.getalldept();
    }




}
