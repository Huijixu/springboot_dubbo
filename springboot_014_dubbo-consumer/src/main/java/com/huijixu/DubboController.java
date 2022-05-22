package com.huijixu;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HuiJixu
 * @version 2.0
 * @since 2021.9
 */

@RestController
public class DubboController {


    /**
     * RPC远程接口调用
     * 将创建好的代理对象 ，注入给stuService
     */
//    @DubboReference(interfaceClass = StuService.class,version = "1.0")
    @DubboReference(version = "1.0")
    private StuService service;

    @RequestMapping("/query")
    public String  query(Integer id){
        Stu stu = service.query(id);
        return "RPC远程调用接口 ，获取对象"+stu ;
    }
}
