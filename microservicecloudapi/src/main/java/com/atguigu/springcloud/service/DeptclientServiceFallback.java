package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptclientServiceFallback implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {

        return new DeptClientService() {
            @Override
            public Dept getdeptbyid(long id) {
                return new Dept().setId(id).setDeptName("该ID"+id+"没有对应的数据").setDb_source("无数据库");

            }
            @Override
            public List<Dept> getalldept() {
                return null;
            }
        };
    }
}
