package design_partner.abstract_factory;

/**
 * @author liusy
 * @since 2021/7/30下午5:08
 */
public class YamahaShip implements Ship {
    @Override
    public String getBrand() {
        return "this is a yamaha ship";
    }
}
