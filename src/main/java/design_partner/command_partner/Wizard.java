package design_partner.command_partner;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liusy
 * @since 2021/9/12下午9:53
 */
public class Wizard {
    private Queue<Command> commandQueue = new LinkedList<>();

    public void useSkill(Target target, Command skill){
        skill.execute(target);
        commandQueue.add(skill);
    }

    public void undoLastSkill() {
        if (commandQueue.peek() == null){
            return;
        }
        Command poll = commandQueue.poll();
        poll.undo();
    }
}
