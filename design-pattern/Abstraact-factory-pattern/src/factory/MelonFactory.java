package factory;

import factory.impl.Lily;
import factory.impl.Rose;
import factory.impl.SweetMelon;
import factory.impl.Tulip;
import factory.impl.WaterMelon;
import factory.impl.YellowMelon;

/**
 * @author maybelence
 * @descrpition 瓜的工厂类
 * @date 2021-05-07
 */
public class MelonFactory extends AbstractFactory {

    @Override
    public IFlower getFlower(Enum<FlowerEnum> productEnum) {
        return null;
    }

    @Override
    public IMelon getMelon(Enum<MelonEnum> productEnum) {
        if (MelonEnum.WATER == productEnum) return new WaterMelon();
        if (MelonEnum.YELLOW == productEnum) return new YellowMelon();
        if (MelonEnum.SWEET == productEnum) return new SweetMelon();
        return null;
    }
}


