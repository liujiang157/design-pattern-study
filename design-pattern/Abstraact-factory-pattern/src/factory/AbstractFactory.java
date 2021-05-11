package factory;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-07
 */
public abstract class AbstractFactory {

    public abstract IFlower getFlower(Enum<FlowerEnum> productEnum);

    public abstract IMelon getMelon(Enum<MelonEnum> productEnum);
}
