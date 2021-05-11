package factory.model;

import factory.MelonFactory;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-07
 */
public class YellowMelon implements MelonFactory.IMelon {
    @Override
    public String getVariety() {
        return "Œ“ «ª∆πœ";
    }
}
