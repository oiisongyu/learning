package design_partner.chain;

/**
 * @author liusy
 * @since 2021/8/3上午12:18
 */
public class Handler1 extends MyHandler {
    public Handler1(MyHandler next) {
        super(next);
    }

    @Override
    public void doHandler(String param) {
        if ("1".equals(param)) {
            System.out.println("Handler1 run");
        } else {
            super.doHandler(param);
        }
    }
}
