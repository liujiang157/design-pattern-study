import factory.AbstractFactory;
import factory.FlowerFactory;
import factory.MelonFactory;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-07
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryEnum factoryEnum) {
        if (factoryEnum == FactoryEnum.FLOWER) return new FlowerFactory();
        if (factoryEnum == FactoryEnum.MELON) return new MelonFactory();
        return null;
    }
}
enum FactoryEnum {
    FLOWER, MELON
}
