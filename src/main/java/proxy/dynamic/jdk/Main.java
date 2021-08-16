package proxy.dynamic.jdk;

import proxy.staticProxy.IUserDao;

/**
 * @author liusy
 * @since 2021/8/15下午10:27
 * jdk代理:代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 */
public class Main {
    public static void main(String[] args) {
        IUserDao userDaoProxy = (IUserDao) new UserDaoProxyFactory(new UserDao()).getUserDaoProxy();
        userDaoProxy.save();
        userDaoProxy.delete();
        userDaoProxy.saveAndDelete();
    }
}
