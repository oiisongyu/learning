package thread;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liusy
 * @since 2021/9/25下午4:10
 */
public class TestAbc1 {

    private ReentrantLock lock = new ReentrantLock();

    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private Condition conditionC = lock.newCondition();
    int i = 0;

    @Test
    public void test() {
        threadA.start();
        threadB.start();
        threadC.start();

    }

    Thread threadA = new Thread(() ->{
        lock.lock();
        try {
            for (int i1 = 0; i1 < 10; i1++) {
                while (i % 3 != 0){
                    conditionA.await();
                }
                System.out.println("i = {" + i +"}this is A");
                i++;
                conditionB.signal();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    });

    Thread threadB = new Thread(() ->{
        lock.lock();
        try {
            for (int i1 = 0; i1 < 10; i1++) {
                while (i % 3 != 1){
                    conditionB.await();
                }
                System.out.println("i = {" + i +"}this is B");
                i++;
                conditionC.signal();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    });

    Thread threadC = new Thread(() ->{
        lock.lock();
        try {
            for (int i1 = 0; i1 < 10; i1++) {
                while (i % 3 != 2){
                    conditionC.await();
                }
                System.out.println("i = {" + i +"}this is C");
                i++;
                conditionA.signal();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    });



}
