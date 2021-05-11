package factory.impl;

import factory.IFlower;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-07
 */
public class Tulip implements IFlower {
    @Override
    public String getColor() {
        return  "我是金黄郁金香";
    }
}
