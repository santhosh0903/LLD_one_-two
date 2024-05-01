package DesignPatterns.DecoratorDesign;

import DesignPatterns.DecoratorDesign.AddonsAndBase.ChocoChips;
import DesignPatterns.DecoratorDesign.AddonsAndBase.ChocolateCone;
import DesignPatterns.DecoratorDesign.AddonsAndBase.VanillaScoop;
import DesignPatterns.DecoratorDesign.BaseFeatures.OrangeCone;

public class Client {
    public static void main(String[] args) {

        IceCreamConeConstituents iceCreamConeConstituents = new VanillaScoop(
                                                                new ChocoChips(
                                                                    new VanillaScoop(
                                                                        new ChocolateCone(
                                                                            new OrangeCone()
                                                                        )
                                                                    )
                                                                )
        );

        System.out.println(iceCreamConeConstituents.getCost());
        System.out.println(iceCreamConeConstituents.getDescription());

    }
}
