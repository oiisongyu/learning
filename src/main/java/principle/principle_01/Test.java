package principle.principle_01;

import principle.principle_01.model.CashCard;
import principle.principle_01.model.CreditCard;

import java.math.BigDecimal;

/**
 * @author liusy
 * @since 2021/8/30下午11:30
 */
public class Test {
    public static void main(String[] args) {
        CashCard cashCard = new CashCard("202108300001",new BigDecimal("10000"));
        cashCard.withDrawl(new BigDecimal("1000"));

        CreditCard creditCard = new CreditCard("202108300002",new BigDecimal("100000"));
        creditCard.loan(new BigDecimal("10000"));
        creditCard.loan(new BigDecimal("10001"));
        creditCard.loan(new BigDecimal("9999"));

        //子类继承符合里氏替换 父类可由子类代替
        CashCard cashCard1 = new CreditCard("202108300003",new BigDecimal("100"));
        cashCard1.withDrawl(new BigDecimal("100"));
    }
}
