package principle.principle_01.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author liusy
 * @since 2021/8/30下午11:32
 */
public class CreditCard extends CashCard{
    private Logger logger = LoggerFactory.getLogger(CreditCard.class);

    public CreditCard(String cardNo, BigDecimal balance) {
        super(cardNo, balance);
    }

    @Override
    boolean rule(BigDecimal amount) {
        return false;
    }


    boolean ruleOfCreditCard(BigDecimal amount) {
        return amount.compareTo(new BigDecimal("10000")) < 0;
    }

    /**
     * 贷款方法 需校验金额小于额度
     * @param amount
     */
    public void loan(BigDecimal amount){
        boolean rule = this.ruleOfCreditCard(amount);
        if (!rule){
            logger.info("生成贷款单失败,金额超限");
            return;
        }
        logger.info("信用卡[{}]贷款,金额[{}]",super.getCardNo(),amount.doubleValue());
        super.positive(amount);

    }
}
