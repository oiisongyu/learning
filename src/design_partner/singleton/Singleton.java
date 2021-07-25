package design_partner.singleton;

/**
 * @author liusy
 * @since 2021/7/25下午11:22
 */
public class Singleton {

    static Singleton INSTANCE;
    private Singleton (){};

    static {
        INSTANCE = new Singleton();
    }

    public static Singleton getINSTANCE (){
        return INSTANCE;
    }

}
