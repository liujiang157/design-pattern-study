/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-12
 */
public abstract class Builder {

    protected EcoTank item = new EcoTank();

    abstract Builder buildTank(Tank tank); // 鱼缸

    abstract Builder buildFilter(Filter filter); // 过滤

    abstract Builder buildFish(Fish fish); // 小鱼

    abstract Builder buildLand(Land land); // 造景

    public EcoTank returnEcoTank() {
        return item;
    }


    public enum Tank {
        BIG, //大缸
        SMALL  //小缸
    }


    public enum Filter {
        OXYGEN, //氧气过滤
        FALL  //瀑布过滤
    }


    public enum Fish {
        DRAGON, //龙鱼
        CARP  //鲤鱼
    }


    public enum Land {
        GRASS, //草缸
        SEA  //海缸
    }

}
