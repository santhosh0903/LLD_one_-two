package DesignPatterns.prototypeAndRegistry;

public class IntelligentStudent extends Student{

    int iq;
    IntelligentStudent(){

    }
    IntelligentStudent(IntelligentStudent other){
        super(other);
        this.iq=other.iq;
    }
    @Override
    public IntelligentStudent clone(){
        IntelligentStudent st=new IntelligentStudent(this);
        return st;
    }
}
