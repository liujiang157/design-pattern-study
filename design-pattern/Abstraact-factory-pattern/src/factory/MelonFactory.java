package factory;

import factory.model.SweetMelon;
import factory.model.WaterMelon;
import factory.model.YellowMelon;

/**
 * @author maybelence
 * @descrpition 瓜的工厂类
 * @date 2021-05-07
 */
public class MelonFactory extends AbstractFactory {

    @Override
    public FlowerFactory.IFlower getFlower(Enum<FlowerEnum> productEnum) {
        throw new IllegalArgumentException("无法通过本工厂获取该类型对象");
    }

    @Override
    public IMelon getMelon(Enum<MelonEnum> productEnum) {
        if (MelonEnum.WATER == productEnum) return new WaterMelon();
        if (MelonEnum.YELLOW == productEnum) return new YellowMelon();
        if (MelonEnum.SWEET == productEnum) return new SweetMelon();
        return null;
    }


}


