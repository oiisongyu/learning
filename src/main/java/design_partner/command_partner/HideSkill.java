package design_partner.command_partner;

/**
 * @author liusy
 * @since 2021/9/12下午9:41
 */
public class HideSkill implements Command {
    private Target target;
    @Override
    public void execute(Target target) {
        target.setVisible(false);
        this.target = target;
        System.out.println(target);
    }

    @Override
    public void undo() {
        if (target != null){
            target.setVisible(true);
            System.out.println(target);
        }
    }
}
