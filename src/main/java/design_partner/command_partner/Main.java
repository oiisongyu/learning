package design_partner.command_partner;

/**
 * @author liusy
 * @since 2021/9/12下午9:52
 */
public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Target target = new Target(10, true);
        wizard.useSkill(target,new HideSkill());
        wizard.undoLastSkill();


        wizard.useSkill(target,new HideSkill());
        wizard.useSkill(target,new SmallSkill());
        wizard.undoLastSkill();


    }
}
