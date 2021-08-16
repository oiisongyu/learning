package proxy.staticProxy;

/**
 * @author liusy
 * @since 2021/8/15下午9:27
 */
public class User implements IUserDao {
    @Override
    public void save() {
        System.out.println("User.save()执行了");
    }

    @Override
    public void delete() {

    }

    @Override
    public void saveAndDelete() {

    }
}
