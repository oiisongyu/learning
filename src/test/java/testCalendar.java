import java.util.Calendar;

/**
 * @author liusy
 * @since 2021/8/27上午10:42
 */
public class testCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE,-1);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.YEAR,-1);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.DAY_OF_YEAR,calendar.getMaximum(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.getTime());
    }
}
