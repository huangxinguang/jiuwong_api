package com.ectrip;

import org.springframework.stereotype.Component;

/**
 * Created by huangxinguang on 2017/5/24 下午2:11.
 */

@Component("helloWorldServerImpl")
public class HelloWorldServerImpl implements HelloWorldServer {

    public String sayHello(String name) {
        return "hello "+name;
    }
}
