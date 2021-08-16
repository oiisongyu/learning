package proxy.dynamic.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import proxy.dynamic.jdk.UserDao;

/**
 * @author liusy
 * @since 2021/8/15下午11:04
 */
public class Main {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/liusy/Desktop");
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserDao.class);
        enhancer.setCallbackFilter(new MyCallbackFilter());
        //设置回调函数
        Callback[] callbacks = new Callback[]{
                cglibProxyFactory,new MyCallback1()
        };
        enhancer.setCallbacks(callbacks);
        UserDao userDao = (UserDao) enhancer.create();
        //save 触发callback[1];
        userDao.save();
    }
}
