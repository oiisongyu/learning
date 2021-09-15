package design_partner.observer_01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liusy
 * @since 2021/9/5下午8:34
 */
public class CaseTerminateObserver implements MyObserver {
    private static Logger logger = LoggerFactory.getLogger(CaseTerminateObserver.class);
    @Override
    public void doEvent(MyEvent event) {
        logger.info("[{}]=======CaseTerminateObserver执行了,Source:[{}]",event.getEventName(),event.getSource());

    }
}
