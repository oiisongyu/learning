package thread;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * @author liusy
 * @since 2021/8/26上午12:17
 */
public class TestSynchronize01 {
    static int i = 0;
    static private Object object = new Object();
    static void add(){
        //同步代码块 锁住object对象,只有一个线程能获取
        synchronized (object){
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

    private static CountDownLatch countDownLatch = new CountDownLatch(100);
    @Test
    public void test() throws InterruptedException {
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
        countDownLatch.await();
//        try {
//            thread1.join();
//            thread2.join();
//        }catch (Exception e){
//
//        }

    }


}
