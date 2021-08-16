package design_partner.chain;

/**
 * @author liusy
 * @since 2021/8/3上午12:06
 */
public abstract class MyHandler {
    private  final  MyHandler next;

    public MyHandler(MyHandler next){
        this.next = next;
    }

    public void doHandler(String param){
        if (next != null){
            next.doHandler(param);
        }
    }
}
