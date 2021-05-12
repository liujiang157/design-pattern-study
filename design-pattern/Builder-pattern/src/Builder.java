/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-12
 */
public abstract class Builder {

    protected EcoTank item = new EcoTank();

    abstract Builder buildTank(Tank tank); // Óã¸×

    abstract Builder buildFilter(Filter filter); // ¹ıÂË

    abstract Builder buildFish(Fish fish); // Óã

    abstract Builder buildLand(Land land); // Ôì¾°

    public EcoTank returnEcoTank() {
        return item;
    }


    public enum Tank {
        BIG, //´ó¸×
        SMALL  //Ğ¡¸×
    }


    public enum Filter {
        OXYGEN, //ÑõÆø¹ıÂË
        FALL  //ÆÙ²¼¹ıÂË
    }


    public enum Fish {
        DRAGON, //ÁúÓã
        CARP  //ÀğÓã
    }


    public enum Land {
        GRASS, //²İ¸×
        SEA  //º£¸×
    }

}
