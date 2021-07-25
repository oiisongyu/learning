package design_partner.singleton;

/**
 * @author liusy
 * @since 2021/7/25下午11:22
 */
public class Singleton {

    static Singleton INSTANCE;
    private Singleton (){};

    public static Singleton getINSTANCE (){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

}
