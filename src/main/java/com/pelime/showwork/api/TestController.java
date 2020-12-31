package com.pelime.showwork.api;

import com.pelime.showwork.model.XResponse;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {

    @RequestMapping("1")
    public XResponse test1(){
        return XResponse.success("成功1");
    }
    @RequestMapping("2")
    @RequiresRoles("ADMIN")
    public XResponse test2(){
        return XResponse.success("成功2");
    }
}
