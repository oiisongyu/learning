package design_partner.strategy;

/**
 * @author liusy
 * @since 2021/8/2上午11:19
 */
public class Main {
    public static void main(String[] args) {
        PayExecutor payExecutor = new PayExecutor();
        System.out.println(payExecutor.doPay("inner","123"));
    }
}
