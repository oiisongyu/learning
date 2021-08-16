package design_partner.abstract_factory;

/**
 * @author liusy
 * @since 2021/7/30下午4:49
 */
public class AudiFactory implements TransportFactory {
    @Override
    public Car getCar() {
        return null;
    }

    @Override
    public Ship getShip() {
        return null;
    }
}
