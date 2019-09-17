package design.proxydesign.observe;

import java.util.ArrayList;
import java.util.List;

public class subject {
    List<observe> list = new ArrayList<>();
    public void register(observe observe) {
        list.add(observe);
    }

    public void attach(observe observe) {
        list.remove(observe);
    }

    public void notifyupdate(String state) {
        for(observe observe : list) {
            observe.update(state);
        }
    }
}
