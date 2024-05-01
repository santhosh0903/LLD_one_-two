package DesignPatterns.DecoratorDesign.BaseFeatures;

import DesignPatterns.DecoratorDesign.IceCreamConeConstituents;

public class CrustCone implements IceCreamConeConstituents {
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Crust Cone";
    }
}
