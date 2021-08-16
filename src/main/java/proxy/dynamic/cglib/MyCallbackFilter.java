package proxy.dynamic.cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * @author liusy
 * @since 2021/8/17上午12:30
 * 根据accept返回的数字决定走第几个回调
 */
public class MyCallbackFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {
        if (method.getName().equals("save")){
            return 1;
        }else {
            return 0;
        }
    }
}
