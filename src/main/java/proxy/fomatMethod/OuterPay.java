package proxy.fomatMethod;

/**
 * @author liusy
 * @since 2021/8/8下午11:40
 */
public class OuterPay extends AbstractPay{
    @Override
    boolean isCheckParam() {
        return false;
    }

    @Override
    String beforePay(String payBody) {
        return "Outer before";
    }

    @Override
    String pay(String payBody) {
        return "Outer pay";
    }

    @Override
    String analysis(String payBody) {
        return "Outer analysis";
    }

    @Override
    String success(String payBody) {
        return "Outer success";
    }
}
