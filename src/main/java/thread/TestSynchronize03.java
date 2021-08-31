package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liusy
 * @since 2021/8/26上午12:17
 */
public class TestSynchronize03 {
    static Lock lock = new ReentrantLock();
    static int i = 0;
    static void add(){
        lock.lock();
        try {
            while (i < 10){
                Thread.sleep(100);
                i += 1;
                System.out.println("ThreadName:" + Thread.currentThread().getName() + "已执行" + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
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
