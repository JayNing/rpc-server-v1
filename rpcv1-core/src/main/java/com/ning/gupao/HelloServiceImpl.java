package com.ning.gupao;

/**
 * @Author JAY
 * @Date 2019/8/3 14:26
 * @Description TODO
 **/
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String msg) {
        System.out.println("HelloServiceImpl sayHello : " + msg);
        return "SUCCESS";
    }
}
