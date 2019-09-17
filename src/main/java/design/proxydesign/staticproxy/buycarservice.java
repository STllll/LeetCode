package design.proxydesign.staticproxy;

public class buycarservice implements buycar{
    @Override
    public void findcar() {
        System.out.println("我要买车");
    }
}
