package design_partner.factory_00_01;

import design_partner.factory_00_01.impl.GoodsSendService;
import design_partner.factory_00_01.impl.TicketsSendService;
import design_partner.factory_00_01.model.SendReq;
import org.apache.log4j.Logger;


/**
 * @author liusy
 * @since 2021/8/27下午8:47
 * 工厂方法
 */
public class MyFactory {
    private static Logger logger = Logger.getLogger(MyFactory.class);
    private GoodsSendService goodsSendService;
    private TicketsSendService ticketsSendService;



    public ISend getService(SendReq req){
        if ("1".equals(req.getSendType())){
            if (goodsSendService == null){
                goodsSendService = new GoodsSendService();
            }
            return goodsSendService;
        }
        if ("2".equals(req.getSendType())){
            if (ticketsSendService == null){
                ticketsSendService = new TicketsSendService();
            }
            return ticketsSendService;
        }
        logger.info("根据sendType未获取到处理器");
        return null;
    }

    public ISend getServiceByClazz(Class<? extends ISend> clazz) throws Exception{
        return clazz.newInstance();
    }
}
