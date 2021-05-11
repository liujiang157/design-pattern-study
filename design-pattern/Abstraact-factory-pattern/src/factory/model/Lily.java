package factory.model;

import factory.FlowerFactory;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-07
 */
public class Lily implements FlowerFactory.IFlower {
    @Override
    public String getColor() {
        return "我是纯白百合";
    }
}
