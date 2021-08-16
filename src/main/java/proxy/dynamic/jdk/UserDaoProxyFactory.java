package proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liusy
 * @since 2021/8/15下午10:25
 */
public class UserDaoProxyFactory {
    private UserDao target;

    public UserDaoProxyFactory (UserDao target){
        this.target = target;
    }
    public Object getUserDaoProxy(){
        UserDao target = new UserDao();
        return Proxy.newProxyInstance(UserDao.class.getClassLoader(), UserDao.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("dynamic + before method 执行了");
                return method.invoke(target, args);
            }
        });
    }

}
