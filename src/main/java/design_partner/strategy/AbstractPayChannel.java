package design_partner.strategy;

/**
 * @author liusy
 * @since 2021/8/1下午7:15
 */
public interface AbstractPayChannel<T> {
    String doPay(T param);

    String complete();
}
