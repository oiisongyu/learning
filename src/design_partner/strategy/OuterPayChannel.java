package design_partner.strategy;

/**
 * @author liusy
 * @since 2021/8/2上午9:06
 */
@PayChannel(channel = "outer")
public class OuterPayChannel implements AbstractPayChannel{
    @Override
    public String doPay(String psn) {
        return "psn:" + psn + "is paying by OuterPayChannel";
    }
}
