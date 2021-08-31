package principle.principle_00.model;

import java.math.BigDecimal;

/**
 * @author liusy
 * @since 2021/8/30下午10:11
 */
public class CreditCard extends CashCard{

    @Override
    public void recharge(BigDecimal amount) {
        super.recharge(amount);
    }

    @Override
    public void withDrawl(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal(1000)) > 0){
            System.out.println("体现限额:1000");
            return;
        }
        super.withDrawl(amount);
    }
}
