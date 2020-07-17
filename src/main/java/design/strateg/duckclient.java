package design.strateg;

public class duckclient {
    public static void main(String[] args) throws Throwable {
        shak s = new shak();
        quake q = new quake();
        duckjiao jiao = new duckjiao();
        jiao.setduckjiao(q);
        jiao.guagua();
        jiao.setduckjiao(s);
        jiao.guagua();
    }
}
