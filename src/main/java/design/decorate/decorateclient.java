package design.decorate;

public class decorateclient {
    public static void main(String[] args) {
        person p = new concreteperson();
        ma m1 =new ma();
        mb m2 = new mb();
        m1.setP(p);
        m2.setP(m1);
        m2.eat();
    }
}
