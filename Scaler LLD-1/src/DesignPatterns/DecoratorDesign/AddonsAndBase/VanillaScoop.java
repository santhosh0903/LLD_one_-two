package DesignPatterns.DecoratorDesign.AddonsAndBase;

import DesignPatterns.DecoratorDesign.IceCreamConeConstituents;

public class VanillaScoop implements IceCreamConeConstituents {


    IceCreamConeConstituents iceCreamConeConstituents;

    public VanillaScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents=iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost()+60;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription()+" + VanillaScoop";
    }
}
