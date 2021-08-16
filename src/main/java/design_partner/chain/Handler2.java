package design_partner.chain;

/**
 * @author liusy
 * @since 2021/8/3上午12:18
 */
public class Handler2 extends MyHandler {
    public Handler2(MyHandler next) {
        super(next);
    }

    @Override
    public void doHandler(String param) {
        if ("2".equals(param)) {
            System.out.println("Handler2 run");
        } else {
            super.doHandler(param);
        }
    }
}
