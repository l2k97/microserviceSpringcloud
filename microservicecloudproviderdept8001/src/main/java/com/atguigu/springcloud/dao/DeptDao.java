package com.atguigu.springcloud.dao;


import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface DeptDao {

     public List<Dept> findAll();
     public Dept findById(long id);

    public void addDept(Dept dept);

}
