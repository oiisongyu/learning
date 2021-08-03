package design_partner.abstract_factory;

/**
 * @author liusy
 * @since 2021/7/30下午5:11
 */
public class MyTransportFactory implements TransportFactory{
    @Override
    public Car getCar() {
        return new AudiCar();
    }

    @Override
    public Ship getShip() {
        return new YamahaShip();
    }
}
