package thread;

/**
 * @author liusy
 * @since 2021/8/19下午7:26
 * 可见性
 *          volatile 关键字 保证数据的可见性.保证读到最新.防止指令重拍
 *          代码里存在volatile -> 字节码 -> jvm -> 操作系统实现 缓存一致性
 *          MESI 缓存一致性协议
 * 原子性
 *          多线程同时修改同一个变量
 *
 * 乱序性
 *          基于指令重排
 * synchronized     锁对象
 *                  偏向锁(标记本线程使用)         -       轻量锁         -           重量锁(操作系统申请)
 *
 * 通过synchronized实现多线程操作同一个变量递增
 */
public class Main {
    static int a;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("set a = 1");
                    a = 1;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true){
                System.out.println("set a = 2");
                a = 2;
            }
        });

        thread1.start();
        thread2.start();

        if (a == 1 && a == 2){
            System.out.println("线程不安全");
        }

    }

}
