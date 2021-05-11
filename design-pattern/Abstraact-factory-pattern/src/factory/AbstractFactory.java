package factory;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-07
 */
public abstract class AbstractFactory {

    public abstract IFlower getFlower(Enum<FlowerEnum> productEnum);

    public abstract IMelon getMelon(Enum<MelonEnum> productEnum);



    public interface IFlower {
        String getColor();
    }




    public interface IMelon {
        String getVariety();
    }

    /**
     * ��Ʒ��ϵ�ö��ֵ
     */
    public enum MelonEnum {
        WATER,YELLOW,SWEET
    }

    /**
     * ��Ʒ�廨��ö��ֵ
     */
    public enum FlowerEnum {
        ROSE,TULIP,LILY
    }
}
