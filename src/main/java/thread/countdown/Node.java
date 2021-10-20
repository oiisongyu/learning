package thread.countdown;

import java.util.concurrent.locks.LockSupport;

public class Node {
    private Node next;
    private Thread thread;

    public void awaitThread() throws Exception{
        LockSupport.park(thread);
    }

    public void notifyThread(){
        LockSupport.unpark(thread);
        if (this.next != null){
            this.next.notifyThread();
        }
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
}
