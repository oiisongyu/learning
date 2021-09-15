package design_partner.worknode;

import design_partner.strategy.CaseInfo;
import design_partner.strategy.TaskService;

/**
 * @author liusy
 * @since 2021/9/2下午11:41
 */
public class PayFlowContext {

    private CaseInfo caseInfo;

    private BaseWorkNodeFactory baseWorkNodeFactory;

    private TaskService taskService;

    public PayFlowContext(CaseInfo caseInfo, BaseWorkNodeFactory baseWorkNodeFactory){
        this.caseInfo = caseInfo;
        this.baseWorkNodeFactory = baseWorkNodeFactory;
    }

    public String complete(){
        this.baseWorkNodeFactory.getKjjb().complete(caseInfo);
        return "123";
    }

}
