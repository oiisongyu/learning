package design_partner.observer_01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liusy
 * @since 2021/9/5下午8:25
 */
public class CaseCommitObserver implements MyObserver {
    private static Logger logger = LoggerFactory.getLogger(CaseCommitObserver.class);
    @Override
    public void doEvent(MyEvent event) {
        logger.info("[{}]=======CaseCommitObserver执行了,Source:[{}]",event.getEventName(),event.getSource());
    }
}
