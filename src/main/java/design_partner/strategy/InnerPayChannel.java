package design_partner.strategy;

/**
 * @author liusy
 * @since 2021/8/1下午7:49
 */
@PayChannel(channel = "inner")
public class InnerPayChannel implements AbstractPayChannel<String>{
    @Override
    public String doPay(String psn) {
        return "psn:" + psn + " is paying by InnerPayChannel";
    }

    @Override
    public String complete() {
        return null;
    }
}
