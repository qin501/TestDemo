package cn.wsq;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        final List<String> list=new ArrayList<String>();
        List<String> proxyList= (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("proxy-->"+proxy.getClass().getName()+"method-->"+method.getName()+"args-->"+args);
                return method.invoke(list,args);
            }
        });
        proxyList.add("hello");
        System.out.println(proxyList);
    }
}
