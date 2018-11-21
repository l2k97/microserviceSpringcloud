package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
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


    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Dept getdeptbyid(@PathVariable("id") long id)
    {
       return deptService.getdeptbyid(id);

    } ;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
      public List<Dept> getalldept()
    {
        return deptService.getalldept();
    }



}
