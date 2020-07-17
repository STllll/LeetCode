package design.decorate;

public class concreteperson implements person {

    @Override
    public void eat() {
        System.out.println("我在吃饭");
    }
}
