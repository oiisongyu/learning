package design_partner.observer_02.test;

import design_partner.observer_02.CaseCommitObserver;
import design_partner.observer_02.CaseTerminateObserver;
import design_partner.observer_02.MyObserverable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author liusy
 * @since 2021/9/5下午8:36
 */
public class Test1 {

    @Test
    public void testObserver(){
        MyObserverable myObserverable =new MyObserverable();
        myObserverable.register(new CaseCommitObserver());
        myObserverable.register(new CaseTerminateObserver());

        myObserverable.updateMessage("123");
    }
}
