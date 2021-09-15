package design_partner.observer_02;

import design_partner.observer_01.MyEvent;
import design_partner.observer_01.MyObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liusy
 * @since 2021/9/5下午8:34
 */
public class CaseTerminateObserver implements Observer {
    private static Logger logger = LoggerFactory.getLogger(CaseTerminateObserver.class);
    @Override
    public void doEvent() {
        logger.info("[{}]=======CaseTerminateObserver执行了,Source:[{}]");

    }
}
