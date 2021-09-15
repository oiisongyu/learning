package design_partner.command_partner;

/**
 * @author liusy
 * @since 2021/9/12下午2:02
 */
public interface  Command {

    void execute(Target target);

    void undo();
}
