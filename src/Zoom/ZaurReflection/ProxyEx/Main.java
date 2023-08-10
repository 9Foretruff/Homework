package Zoom.ZaurReflection.ProxyEx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        InvocationHandler handler = new MyProxy();
        Class[] classes = new Class[]{Comparable.class, Callable.class};
        ClassLoader classLoader = handler.getClass().getClassLoader();
        Object proxy = Proxy.newProxyInstance(classLoader, classes, handler);
        proxy.toString();
        //proxy.toString();
        //((Comparable)proxy).compareTo(5);
        // ох уж этот прокси ....
    }

    static class MyProxy implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("hello");
            return null;
        }
    }
}
