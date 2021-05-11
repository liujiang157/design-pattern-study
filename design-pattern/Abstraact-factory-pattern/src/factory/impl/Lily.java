package factory.impl;

import factory.IFlower;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-07
 */
public class Lily implements IFlower {
    @Override
    public String getColor() {
        return "我是纯白百合";
    }
}
