package DesignPatterns.DecoratorDesign.AddonsAndBase;

import DesignPatterns.DecoratorDesign.IceCreamConeConstituents;

public class StrawberryScoop implements IceCreamConeConstituents {

    IceCreamConeConstituents iceCreamConeConstituents;

    public StrawberryScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents=iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost()+50;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription()+" + StrawberryScoop";
    }
}
