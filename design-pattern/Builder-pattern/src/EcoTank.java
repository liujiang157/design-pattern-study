/**
 * @author maybelence
 * @descrpition 建造者模式
 * @date 2021-05-12
 */

public class EcoTank {

    private Builder.Tank tank;

    private Builder.Filter filter;

    private Builder.Fish fish;

    private Builder.Land land;


    public void setTank(Builder.Tank tank) {
        this.tank = tank;
    }

    public void setFilter(Builder.Filter filter) {
        this.filter = filter;
    }

    public void setFish(Builder.Fish fish) {
        this.fish = fish;
    }

    public void setLand(Builder.Land land) {
        this.land = land;
    }


    @Override
    public String toString() {
        return "EcoTank{" +
                "tank=" + tank +
                ", filter=" + filter +
                ", fish=" + fish +
                ", land=" + land +
                '}';
    }
}
