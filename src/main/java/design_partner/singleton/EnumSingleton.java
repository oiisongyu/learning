package design_partner.singleton;

/**
 * 枚举实现单例
 *      优点:不会被反射/反序列化破坏单例
 *          线程安全
 * @author liusy
 * @since 2021/9/7上午12:22
 */
public enum EnumSingleton {
    INSTANCE;
    public int i = 0;
    public void test(){
        System.out.println("这里是单例模式第"+ ++i + "次调用" );
    }
}
