package design.proxydesign.jdkproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
     private  Object target;
     public Object getinstance(final Object object) {
         this.target = object;
         Enhancer enhance = new Enhancer();
         enhance.setSuperclass(this.target.getClass());
         enhance.setCallback(this);
         return enhance.create();
     }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("买房前");
        Object result = methodProxy.invoke(o, objects);
        System.out.println("买房后");
        return result;
    }
}
