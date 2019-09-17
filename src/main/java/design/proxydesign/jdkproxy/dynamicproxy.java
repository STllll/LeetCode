package design.proxydesign.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class dynamicproxy implements InvocationHandler {
    private  Object object;
    dynamicproxy(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买车前准备");
        Object result = method.invoke(object,args);
        System.out.println("买车后准备");
        return result;
    }
}
