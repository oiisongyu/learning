package design_partner.observer_01;

import lombok.Data;

/**
 * @author liusy
 * @since 2021/9/5下午6:23
 */
@Data
public class MyEvent<T> {
    private String pkId;

    private String eventName;

    private T source;

    public MyEvent(String pkId, String eventName, T source) {
        this.pkId = pkId;
        this.eventName = eventName;
        this.source = source;
    }
}
