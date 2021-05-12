/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-12
 */
public class ConCreteBuilder extends Builder {

    @Override
    Builder buildTank(Tank tank) {
        item.setTank(tank);
        return this;
    }

    @Override
    Builder buildFilter(Filter filter) {
        item.setFilter(filter);
        return this;
    }

    @Override
    Builder buildFish(Fish fish) {
        item.setFish(fish);
        return this;
    }

    @Override
    Builder buildLand(Land land) {
        item.setLand(land);
        return this;
    }
}

