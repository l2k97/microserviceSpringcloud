package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    public Dept getdeptbyid(long id);
    public List<Dept> getalldept();
    public void adddept(Dept dept);

}
