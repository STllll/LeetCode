package design.proxydesign.jdkproxy;


import java.lang.reflect.Proxy;

public class bughoustclient {
    public static void main(String[] args) {
        bughoustimpl bughoustimpl = new bughoustimpl();
        buyhouse proxybuyhouse = (buyhouse) Proxy.newProxyInstance(buyhouse.class.getClassLoader(), new Class[]{buyhouse.class},new dynamicproxy(bughoustimpl));
        proxybuyhouse.buy();
//        buyhouse buyhouse = new bughoustimpl();
//        CglibProxy cglibProxy = new CglibProxy();
//        bughoustimpl bughoustimpl = (bughoustimpl)cglibProxy.getinstance(buyhouse);
//        bughoustimpl.buy();
    }

}
