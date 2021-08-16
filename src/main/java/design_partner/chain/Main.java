package design_partner.chain;

/**
 * @author liusy
 * @since 2021/8/3上午12:15
 */
public class Main {
    public static void main(String[] args) {
        new Handler1(new Handler2(null)).doHandler("1");
        new Handler1(new Handler2(null)).doHandler("2");
    }
}
