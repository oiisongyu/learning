package design_partner.worknode.factorys;

import design_partner.worknode.BaseWorkNode;
import design_partner.worknode.BaseWorkNodeFactory;
import design_partner.worknode.node.ZdtaKjjbWorkNode;

/**
 * @author liusy
 * @since 2021/9/2下午11:52
 */
public class ZdtaWorkNodeFactory extends BaseWorkNodeFactory {
    @Override
    public BaseWorkNode getKjfh() {
        return new ZdtaKjjbWorkNode();
    }
}
