package DesignPatterns.prototypeAndRegistry;

public class Client {
    public static void main(String[] args) {

        Registry registry=new Registry();
        fillRegistry(registry);

        Student st=registry.get("april2024Student").clone();
        st.setName("Santhosh");
        st.setAge(25);
        st.setPsp(90);

        IntelligentStudent intelligentStudent= (IntelligentStudent) registry.get("intelligentapril2024Student").clone();
        intelligentStudent.setName("it's me santhosh");
        intelligentStudent.setPsp(100);
        intelligentStudent.setAge(26);
        intelligentStudent.iq=200;
    }

    public static  void fillRegistry(Registry registry){
        Student aprStudent=new Student();
        aprStudent.setBatchPSP(45);
        aprStudent.setBatchName("april_2024");
        registry.setRegistry("april2024Student",aprStudent);


        IntelligentStudent intaprStudent=new IntelligentStudent();
        intaprStudent.setBatchPSP(85);
        intaprStudent.setBatchName("int_april_2024");
        registry.setRegistry("intelligentapril2024Student",intaprStudent);
    }

}
