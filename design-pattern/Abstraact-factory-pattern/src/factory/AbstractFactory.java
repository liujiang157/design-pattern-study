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
     * 商品族瓜的枚举值
     */
    public enum MelonEnum {
        WATER,YELLOW,SWEET
    }

    /**
     * 商品族花的枚举值
     */
    public enum FlowerEnum {
        ROSE,TULIP,LILY
    }
}
