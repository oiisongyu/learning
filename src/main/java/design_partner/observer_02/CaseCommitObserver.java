package design_partner.observer_02;

import design_partner.observer_01.MyEvent;
import design_partner.observer_01.MyObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liusy
 * @since 2021/9/5下午8:25
 */
public class CaseCommitObserver implements Observer {
    private static Logger logger = LoggerFactory.getLogger(CaseCommitObserver.class);


    @Override
    public void doEvent() {
        logger.info("[{}]=======CaseCommitObserver执行了,Source:[{}]");
    }
}
