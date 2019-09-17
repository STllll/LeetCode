package design.proxydesign.observe;

public class concreteobserve implements  observe {
    private String observestate;
    @Override
    public void update(String state) {
        observestate = state;
    }
}
