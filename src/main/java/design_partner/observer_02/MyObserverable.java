package design_partner.observer_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liusy
 * @since 2021/9/14上午12:29
 */
public class MyObserverable implements Observerable {
    private String message = "";


    List<Observer> observers = new ArrayList<>();


    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.doEvent();
        }
    }

    public void updateMessage(String message){
        this.message = message;
        this.notifyObserver();
    }
}
