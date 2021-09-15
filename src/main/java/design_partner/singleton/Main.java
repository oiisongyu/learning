package design_partner.singleton;

/**
 * @author liusy
 * @since 2021/7/25下午11:24
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getINSTANCE();
        System.out.println(singleton1);
        Singleton singleton2 = Singleton.getINSTANCE();
        System.out.println(singleton2);

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);

        EnumSingleton.INSTANCE.test();
        EnumSingleton.INSTANCE.test();
        EnumSingleton.INSTANCE.test();
        //1709537756
        System.out.println(EnumSingleton.INSTANCE);
        System.out.println(EnumSingleton.INSTANCE);
        System.out.println(EnumSingleton.INSTANCE);
        System.out.println(EnumSingleton.INSTANCE.hashCode());

    }
}
