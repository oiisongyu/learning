package design_partner.abstract_factory;

/**
 * @author liusy
 * @since 2021/7/30下午5:14
 */
public class Main {
    public static void main(String[] args) {
        MyTransportFactory transportFactory = new MyTransportFactory();
        Car car = transportFactory.getCar();
        System.out.println(car.getBrand());
        System.out.println(transportFactory.getShip().getBrand());
    }
}
