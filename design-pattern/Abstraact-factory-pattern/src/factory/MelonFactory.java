package factory;

import factory.model.SweetMelon;
import factory.model.WaterMelon;
import factory.model.YellowMelon;

/**
 * @author maybelence
 * @descrpition �ϵĹ�����
 * @date 2021-05-07
 */
public class MelonFactory extends AbstractFactory {

    @Override
    public FlowerFactory.IFlower getFlower(Enum<FlowerEnum> productEnum) {
        throw new IllegalArgumentException("�޷�ͨ����������ȡ�����Ͷ���");
    }

    @Override
    public IMelon getMelon(Enum<MelonEnum> productEnum) {
        if (MelonEnum.WATER == productEnum) return new WaterMelon();
        if (MelonEnum.YELLOW == productEnum) return new YellowMelon();
        if (MelonEnum.SWEET == productEnum) return new SweetMelon();
        return null;
    }


}


