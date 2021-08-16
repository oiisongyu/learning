package proxy.staticProxy;

/**
 * @author liusy
 * @since 2021/8/15下午9:28
 */
public class UserProxy implements IUserDao {
    private IUserDao userDao;
    public UserProxy(IUserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("before User.save() 执行前");
        this.userDao.save();
        System.out.println("after User.save() 执行后");
    }

    @Override
    public void delete() {

    }

    @Override
    public void saveAndDelete() {

    }
}
