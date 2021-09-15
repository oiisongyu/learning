package design_partner.observer_02;

/**
 * 被观察者
 * @author liusy
 * @since 2021/9/14上午12:25
 */
public interface Observerable {
    void register(Observer observer);

    void removeRegister(Observer observer);

    void notifyObserver();
}
