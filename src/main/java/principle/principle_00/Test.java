package principle.principle_00;

import principle.principle_00.model.CashCard;
import principle.principle_00.model.CreditCard;

import java.math.BigDecimal;

/**
 * @author liusy
 * @since 2021/8/30下午10:32
 */
public class Test {
    public static void main(String[] args) {
        CashCard cashCard = new CashCard();
        cashCard.setBalance(new BigDecimal("0"));
        cashCard.setCardNo("202108300001");
        cashCard.recharge(new BigDecimal("1000"));

        CreditCard creditCard = new CreditCard();
        creditCard.setBalance(new BigDecimal("0"));
        creditCard.setCardNo("202108300002");
        creditCard.recharge(new BigDecimal("10000"));
        creditCard.withDrawl(new BigDecimal("10000"));

        //子类重载方法影响了父类的功能
        CashCard cashCard1 = new CreditCard();
        cashCard1.withDrawl(new BigDecimal("100000"));
    }
}
