package design_partner.singleton;

/**
 * @author liusy
 * @since 2021/7/25下午11:38
 */
public class LazySingleton {

    static LazySingleton INSTANCE;
    private LazySingleton (){}

    public static LazySingleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
