package factory.model;

import factory.MelonFactory;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-07
 */
public class SweetMelon implements MelonFactory.IMelon {
    @Override
    public String getVariety() {
        return "ÎÒÊÇÌð¹Ï";
    }
}
