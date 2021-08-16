package proxy.dynamic.jdk;

import proxy.staticProxy.IUserDao;

/**
 * @author liusy
 * @since 2021/8/15下午10:24
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("save 执行了");
    }

    @Override
    public void delete() {
        System.out.println("delete 执行了");
    }

    @Override
    public void saveAndDelete() {
        save();
        delete();
    }
}
