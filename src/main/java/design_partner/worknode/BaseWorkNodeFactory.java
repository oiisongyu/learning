package design_partner.worknode;

/**
 * @author liusy
 * @since 2021/9/2下午11:50
 */
public abstract class BaseWorkNodeFactory {
    public BaseWorkNode getKjjb(){
        throw new RuntimeException("没有子类实现");
    }

    public BaseWorkNode getKjfh(){
        throw new RuntimeException("没有子类实现");
    }
}
