import design_partner.observer_01.CaseCommitObserver;
import design_partner.observer_01.CaseTerminateObserver;
import design_partner.observer_01.MyEvent;
import design_partner.observer_01.MyObserver;
import org.junit.Test;

import java.util.*;

/**
 * @author liusy
 * @since 2021/9/5下午8:36
 */
public class Test1 {
    private List<MyObserver> observers = new ArrayList<MyObserver>();
    {
        observers.add(new CaseCommitObserver());
        observers.add(new CaseTerminateObserver());
    }

    @Test
    public void testObserver(){
        for (MyObserver observer : observers) {
            observer.doEvent(new MyEvent(UUID.randomUUID().toString(),"event1",this));
        }

    }
}
