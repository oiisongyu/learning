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
    }
}
