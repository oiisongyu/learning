package design_partner.strategy;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liusy
 * @since 2021/9/2下午11:27
 */
public class TaskService {
    private ConcurrentHashMap<String,AbstractPayChannel> abstractPayChannelConcurrentHashMap;

    public void doSubmitTask(CaseInfo caseInfo){
        //根据指令类型获取对应类型的指令审批上下文对象
        AbstractPayChannel abstractPayChannel = abstractPayChannelConcurrentHashMap.get("1");
    }


}
