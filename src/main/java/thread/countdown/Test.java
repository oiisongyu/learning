package thread.countdown;


public class Test {
    public static void main(String[] args) throws Exception{
        MyCountDownLatch latch =  new MyCountDownLatch(4);

        Thread a = new Thread(() -> {
            System.out.println("-------------- a ---------------");
            latch.countDown();
        });


        Thread b = new Thread(() -> {
            System.out.println("-------------- b ---------------");
            latch.countDown();
        });

        Thread c = new Thread(() -> {
            System.out.println("-------------- c ---------------");
            latch.countDown();
        });

        a.start();
        b.start();
        c.start();

        latch.await();
        System.out.println("执行完成");
    }
}
