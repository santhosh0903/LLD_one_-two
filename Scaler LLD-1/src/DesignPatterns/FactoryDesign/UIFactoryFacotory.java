package DesignPatterns.FactoryDesign;

public class UIFactoryFacotory { // practical factory

        public static UIFactory createUiFacory(String platform){

        if(platform.equals("android")){

            return new AndroidUIFactory();

        }else if(platform.equals("ios")){
            return new IosUIFactory();
        }
        return null;
    }
}
