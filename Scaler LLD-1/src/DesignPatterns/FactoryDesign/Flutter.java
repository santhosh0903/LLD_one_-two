package DesignPatterns.FactoryDesign;

public class Flutter {

    String platform;

    Flutter(String platform){
        this.platform=platform;
    }
    public void setTheme(){
        System.out.println("Setting the theme for flutter");
    }

    public void  setRefreshRate(){
        System.out.println("Setting the refresh rate for flutter");
    }

    //below code is violation SRP principal and we will call below code as practical factory because it returns the object based on the requirement
//    public UIFactory createUiFacory(String platform){
//
//        if(platform.equals("android")){
//
//            return new AndroidUIFactory();
//
//        }else if(platform.equals("ios")){
//            return new IosUIFactory();
//        }
//        return null;
//    }


    public UIFactory createUIFactory(){
        return UIFactoryFacotory.createUiFacory(platform);
    }
}
