package thread;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liusy
 * @since 2021/9/25下午4:10
 */
public class TestAbc {

    private static ReentrantLock lock = new ReentrantLock();

    static int i = 0;


    public static void main(String[] args) {
        Thread threadA = new Thread(() ->{
            for (int i1 = 0; i1 < 10; i1++) {
                lock.lock();
                try {
                    while (i % 3 == 0){
                        System.out.println("i = {" + i +"}" + " this is A");
                        i++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread threadB = new Thread(() ->{
            for (int i1 = 0; i1 < 10; i1++) {
                lock.lock();
                try {
                    while (i % 3 == 1){
                        System.out.println("i = {" + i +"}" + " this is B");
                        i++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread threadC = new Thread(() ->{
            for (int i1 = 0; i1 < 10; i1++) {
                lock.lock();
                try {
                    while (i % 3 == 2){
                        System.out.println("i = {" + i +"}" + " this is C");
                        i++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
    }



}
