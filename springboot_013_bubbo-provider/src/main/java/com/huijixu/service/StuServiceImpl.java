package com.huijixu.service;

import com.huijixu.Stu;
import com.huijixu.StuService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author HuiJixu
 * @version 2.0
 * @since 2021.9
 */

//暴露服务
//@Component   //可选
//@DubboService(interfaceClass = StuService.class,version = "1.0")   //pom下不了 ， 没法用
@DubboService(version = "1.0")   //pom下不了 ， 没法用
public class StuServiceImpl implements StuService {
    @Override
    public Stu query(Integer id) {
        Stu stu = new Stu();
        if( id == 101){

            stu.setAge(21);
            stu.setId("101");
            stu.setName("===hjx");
        }else if (id == 102){

            stu.setAge(22);
            stu.setId("102");
            stu.setName("xcj===");
        }
        return stu;

    }
}
