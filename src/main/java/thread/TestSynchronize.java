package thread;


/**
 * 线程安全问题, 多线程并发操作同一个变量,导致重复同时修改变量的值
 * 解决办法:  同步代码块
 *           同步方法
 *           Lock锁
 * @author liusy
 * @since 2021/8/26上午12:17
 */
public class TestSynchronize {
    static int i = 0;
    static void add(){
        try {
            while (i < 10){
                Thread.sleep(100);
                i += 1;
                System.out.println("ThreadName:" + Thread.currentThread().getName() + "已执行" + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            add();;
        });

        Thread thread2 = new Thread(() -> {
            add();;
        });
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }


}
