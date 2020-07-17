package design.decorate;

public class decorator extends  concreteperson {
    person p ;

    public void setP(person p) {
        this.p = p;
    }

    public void eat() {
        p.eat();
    }
}
