/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-12
 */
public class Director {

    /**
     * µÍÅä Ğ¡¸×-ÆÙ²¼¹ıÂË-ÀğÓã-²İÔì¾°
     *
     * @return
     */
    public EcoTank levelOne() {
        return new ConCreteBuilder().buildTank(Builder.Tank.SMALL)
                .buildFilter(Builder.Filter.FALL)
                .buildFish(Builder.Fish.CARP)
                .buildLand(Builder.Land.GRASS)
                .returnEcoTank();
    }


    /**
     * µÍÅä ´ó¸×-ÑõÆø¹ıÂË-ÁúÓã-º£Ôì¾°
     *
     * @return
     */
    public EcoTank levelTwo() {
        return new ConCreteBuilder().buildTank(Builder.Tank.BIG)
                .buildFilter(Builder.Filter.OXYGEN)
                .buildFish(Builder.Fish.DRAGON)
                .buildLand(Builder.Land.SEA)
                .returnEcoTank();
    }
}
