package thread.countdown;

import java.util.concurrent.TimeoutException;

public class MyCountDownLatch {
    private Node node;
    private volatile int state;

    public void countDown(){
        synchronized (this) {
            this.state = this.state - 1;
            if (this.state == 0){
                this.notifyAll();
            }
        }



    }

    public void await() throws Exception{
        synchronized (this) {
            while (this.state > 0) {
                this.wait();
            }
        }
    }

    public MyCountDownLatch(int state) {
        this.state = state;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
