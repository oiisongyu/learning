package principle.principle_01.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author liusy
 * @since 2021/8/30下午11:20
 */
@Data
public abstract class BankCard {
    private String cardNo;
    private BigDecimal balance;

    public BankCard(String cardNo, BigDecimal balance) {
        this.cardNo = cardNo;
        this.balance = balance;
    }

    abstract boolean rule(BigDecimal amount);

    /**
     * balance +
     * @param amount 金额
     */
    public void positive(BigDecimal amount){
        balance = balance.add(amount);
        System.out.println("cardNo:"+ cardNo +" have positive ! balance=" + balance.doubleValue());
    }

    /**
     * balance -
     * @param amount 金额
     */
    public void negative(BigDecimal amount){
        balance = balance.subtract(amount);
        System.out.println("cardNo:"+ cardNo +" have negative ! balance=" + balance.doubleValue());

    }
}
