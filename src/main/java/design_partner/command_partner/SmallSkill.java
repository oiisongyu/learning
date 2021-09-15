package design_partner.command_partner;

/**
 * @author liusy
 * @since 2021/9/12下午9:45
 */
public class SmallSkill implements Command {

    private Target target;
    @Override
    public void execute(Target target) {
        target.setSize(target.getSize()/10);
        this.target = target;
        System.out.println(target);
    }

    @Override
    public void undo() {
        if (target!= null){
            target.setSize(target.getSize()*10);
            System.out.println(target);
        }
    }
}
