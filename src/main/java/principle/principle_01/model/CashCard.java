package principle.principle_01.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author liusy
 * @since 2021/8/30下午11:26
 */
public class CashCard extends BankCard {
    private Logger logger = LoggerFactory.getLogger(CashCard.class);
    public CashCard(String cardNo, BigDecimal balance) {
        super(cardNo, balance);
    }

    @Override
    boolean rule(BigDecimal amount) {
        return true;
    }

    public void withDrawl(BigDecimal amount){
        logger.info("储蓄卡[{}]取款,金额[{}]",super.getCardNo(),amount.doubleValue());
        super.negative(amount);
    }
}
