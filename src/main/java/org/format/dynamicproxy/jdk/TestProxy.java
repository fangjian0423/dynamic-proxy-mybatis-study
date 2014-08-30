package org.format.dynamicproxy.jdk;

import org.format.dynamicproxy.UserService;
import org.format.dynamicproxy.UserServiceImpl;

import java.lang.reflect.Proxy;

public class TestProxy {

    public static void main(String[] args) {
        TransactionInterceptor transactionInterceptor = new TransactionInterceptor();
        UserService userService = new UserServiceImpl();
        transactionInterceptor.setTarget(userService);
        UserService userServiceProxy =
                (UserService)Proxy.newProxyInstance(
                        userService.getClass().getClassLoader(),
                        userService.getClass().getInterfaces(),
                        transactionInterceptor);
        userServiceProxy.addUser();
    }

}
