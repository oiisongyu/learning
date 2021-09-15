package design_partner.strategy;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 支付上下文对象
 * @author liusy
 * @since 2021/9/2下午10:50
 */
public class Context<T> {
    private AbstractPayChannel<T> abstractPayChannel;

    private TaskService taskService;

    public Object doPay(T param){
        return this.abstractPayChannel.doPay(param);
    }

    public Context(AbstractPayChannel<T> abstractPayChannel){
        this.abstractPayChannel = abstractPayChannel;
    }

}
