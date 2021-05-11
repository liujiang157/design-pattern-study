package factory;

import factory.model.Lily;
import factory.model.Rose;
import factory.model.Tulip;

/**
 * @author maybelence
 * @descrpition 鲜花工厂类
 * @date 2021-05-07
 */
public class FlowerFactory extends AbstractFactory{

    @Override
    public FlowerFactory.IFlower getFlower(Enum<FlowerEnum>  productEnum) {
        if (FlowerEnum.ROSE == productEnum) return new Rose();
        if (FlowerEnum.LILY == productEnum) return new Lily();
        if (FlowerEnum.TULIP == productEnum) return new Tulip();
        return null;
    }

    @Override
    public MelonFactory.IMelon getMelon(Enum<MelonEnum>  productEnum) {
        throw new IllegalArgumentException("无法通过本工厂获取该类型对象");
    }
}



