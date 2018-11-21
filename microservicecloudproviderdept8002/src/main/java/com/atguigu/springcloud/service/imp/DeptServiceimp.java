package com.atguigu.springcloud.service.imp;


import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceimp implements DeptService {

    @Autowired
   private DeptDao deptDao;

    public Dept getdeptbyid(long id)
    {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> getalldept() {
        return deptDao.findAll();
    }

    @Override
    public void adddept(Dept dept) {
          deptDao.addDept(dept);
    }

    public static void main(String[] args) {
        Dept dept=new Dept(1003,"asd","ss");
        System.out.println(dept);

    }
}
