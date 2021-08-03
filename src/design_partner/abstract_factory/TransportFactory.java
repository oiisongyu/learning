package design_partner.abstract_factory;

/**
 * 交通工具抽象工工厂
 * @author liusy
 * @since 2021/7/30下午4:45
 */
public interface TransportFactory {
    Car getCar();
    Ship getShip();
}
