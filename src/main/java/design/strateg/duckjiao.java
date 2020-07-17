package design.strateg;

import com.sun.deploy.util.ReflectionUtil;

import java.lang.reflect.Method;

public class duckjiao {
    private duck d;

    public void guagua() throws Throwable {
        if(d != null)
        d.behavior();
       Method method = ReflectionUtil.getMethod(this.getClass(), "guagua", null, true);
       method.invoke(method);
    }

    public void setduckjiao(duck d) {
        this.d = d;
    }
}
