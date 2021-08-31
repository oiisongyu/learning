package principle.principle_00.model;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 里氏替换
 *      子类不能覆盖父类的非抽象方法
 *      子类可以新增自己的方法
 *      子类重载父类方法时:
 *          子类的入参需比父类宽松
 *          子类的返回值要比父类严格
 *
 * @author liusy
 * @since 2021/8/30下午9:52
 */
@Data
public class CashCard {
    private Logger logger = LoggerFactory.getLogger(CashCard.class);
    private String cardNo;
    private BigDecimal balance;

    public void recharge(BigDecimal amount){
        balance = balance.add(amount);
        System.out.println("cardNo:"+ cardNo +" have recharged ! balance=" + balance.doubleValue());
    }

    public void withDrawl(BigDecimal amount){
        balance = balance.subtract(amount);
        System.out.println("cardNo:"+ cardNo +" have withDrawled ! balance=" + balance.doubleValue());
    }

}
