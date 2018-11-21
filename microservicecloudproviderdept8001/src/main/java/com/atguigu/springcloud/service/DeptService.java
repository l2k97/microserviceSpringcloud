package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entities.Dept;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DeptService {

    public Dept getdeptbyid(long id);
    public List<Dept> getalldept();
    public void adddept(Dept dept);

}
