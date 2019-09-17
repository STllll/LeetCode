package design.proxydesign.observe;

import java.util.ArrayList;
import java.util.List;

public class observesubject extends subject {
    private   String state;
    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        //状态发生改变，通知观察者
        notifyupdate(newState);
    }

}
