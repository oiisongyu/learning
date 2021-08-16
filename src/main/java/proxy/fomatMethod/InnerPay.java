package proxy.fomatMethod;

import java.util.Map;

/**
 * @author liusy
 * @since 2021/8/8下午10:32
 */
public class InnerPay extends AbstractPay {
    @Override
    boolean isCheckParam() {
        return true;
    }

    @Override
    String beforePay(String payBody) {
        return payBody + "inner beforePay";
    }

    @Override
    String pay(String payBody) {
        return payBody + "inner pay";
    }

    @Override
    String analysis(String payBody) {
        return payBody + "inner analysis";
    }

    @Override
    String success(String payBody) {
        return payBody + "inner success";
    }
}
