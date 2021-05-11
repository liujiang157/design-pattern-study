package factory.model;

import factory.FlowerFactory;


/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-07
 */
public class Rose implements FlowerFactory.IFlower {
    @Override
    public String getColor() {
        return  "ÎÒÊÇÀ¶É«Ñý¼§";
    }
}
