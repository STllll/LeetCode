package design.proxydesign.staticproxy;

public class carclient {
    public static void main(String[] args) {
        buycarservice buycarservice = new buycarservice();
        buycarproxy buycarproxy = new buycarproxy(buycarservice);
        buycarproxy.findcar();
    }
}
