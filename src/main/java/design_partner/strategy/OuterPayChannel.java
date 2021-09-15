package design_partner.strategy;

import java.util.HashMap;

/**
 * @author liusy
 * @since 2021/8/2上午9:06
 */
@PayChannel(channel = "outer")
public class OuterPayChannel implements AbstractPayChannel<HashMap<String,Object>> {
    @Override
    public String doPay(HashMap<String,Object> psn) {
        return "psn:" + psn + "is paying by OuterPayChannel";
    }

    @Override
    public String complete() {
        return null;
    }
}
