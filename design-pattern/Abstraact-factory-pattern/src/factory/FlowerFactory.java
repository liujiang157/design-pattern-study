package factory;

import factory.impl.Lily;
import factory.impl.Rose;
import factory.impl.Tulip;

/**
 * @author maybelence
 * @descrpition 鲜花工厂类
 * @date 2021-05-07
 */
public class FlowerFactory extends AbstractFactory{

    @Override
    public IFlower getFlower(Enum<FlowerEnum>  productEnum) {
        if (FlowerEnum.ROSE == productEnum) return new Rose();
        if (FlowerEnum.LILY == productEnum) return new Lily();
        if (FlowerEnum.TULIP == productEnum) return new Tulip();
        return null;
    }

    @Override
    public IMelon getMelon(Enum<MelonEnum>  productEnum) {
        return null;
    }
}



