package proxy.fomatMethod;

/**
 * @author liusy
 * @since 2021/8/8下午10:39
 */
public class Main {
    public static void main(String[] args) {
        InnerPay inner = new InnerPay();
        inner.doPay("123");
        OuterPay outerPay = new OuterPay();
        outerPay.doPay("234 ");
    }

}
