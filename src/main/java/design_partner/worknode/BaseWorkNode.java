package design_partner.worknode;

import design_partner.strategy.CaseInfo;

/**
 * @author liusy
 * @since 2021/9/2下午11:35
 */
public abstract class BaseWorkNode {
    public abstract void complete(CaseInfo caseInfo);
    public abstract void revert(CaseInfo caseInfo);
    public abstract void terminate(CaseInfo caseInfo);
}
