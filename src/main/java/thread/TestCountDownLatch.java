package thread;

import java.util.concurrent.CountDownLatch;


public class TestCountDownLatch {
    static CountDownLatch latch = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(() ->{
           latch.countDown();
           latch.countDown();
           latch.countDown();
        });
        a.run();
        latch.await();
    }

}
