package design_partner.strategy;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liusy
 * @since 2021/8/1下午7:34
 */
public class PayExecutor {
    static Map<String,AbstractPayChannel> abstractPayChannelMap = new HashMap<String,AbstractPayChannel>();

    public PayExecutor(){
        Annotation[] annotations = AbstractPayChannel.class.getAnnotations();
        abstractPayChannelMap.put("inner",new InnerPayChannel());
        abstractPayChannelMap.put("outer",new OuterPayChannel());
    }

    String doPay(String channel,String psn){
        return abstractPayChannelMap.get(channel).doPay(psn);
    }
}
