package design_partner.command_partner;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author liusy
 * @since 2021/9/12下午2:04
 */
@Data
public class Target {
    private static Logger logger = LoggerFactory.getLogger(Target.class);

    private int size;

    private Boolean visible;

    public Target(int size, Boolean visible) {
        this.size = size;
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Target{" +
                "size=" + size +
                ", visible=" + visible +
                '}';
    }
}
