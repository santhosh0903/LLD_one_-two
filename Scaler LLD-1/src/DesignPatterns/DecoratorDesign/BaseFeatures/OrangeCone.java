package DesignPatterns.DecoratorDesign.BaseFeatures;

import DesignPatterns.DecoratorDesign.IceCreamConeConstituents;

public class OrangeCone implements IceCreamConeConstituents {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
