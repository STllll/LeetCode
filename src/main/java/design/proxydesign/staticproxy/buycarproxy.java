package design.proxydesign.staticproxy;

public class buycarproxy implements  buycar{
    private  buycar buycar;

    buycarproxy(buycar buycar) {
        this.buycar = buycar;
    }

    @Override
    public void findcar() {
        System.out.println("买车前准备");
        buycar.findcar();
        System.out.println("买车后准备");
    }

}
