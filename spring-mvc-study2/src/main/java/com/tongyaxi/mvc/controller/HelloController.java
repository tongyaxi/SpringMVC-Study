package com.tongyaxi.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Controller+context:component-scan
 * 注解+扫描来配置控制器，这样SpringMVC才知道这个类控制器，将当前类中方法作为控制器方法，来响应浏览器请求。
 */
@Controller
public class HelloController {

    //  通过@RequestMapping注解，可以通过请求路径匹配要处理的具体的请求
    //  /表示的当前工程的上下文路径
    // 以下控制器方法可以通过视图控制器来完成
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }

    @RequestMapping("/param")
    public String param(){
        return "test_param";
    }

    @RequestMapping("/test_view")
    public String testView(){
        return "test_view";
    }
}
