package design_partner.strategy;

/**
 * @author liusy
 * @since 2021/8/2上午11:19
 */
public class Main {
    public static void main(String[] args) {
       Context<String> context =new Context<String>(new InnerPayChannel());
        Object o = context.doPay("123");
        System.out.println(o.toString());
    }
}
