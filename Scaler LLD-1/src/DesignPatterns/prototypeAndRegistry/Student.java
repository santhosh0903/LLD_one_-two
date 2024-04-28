package DesignPatterns.prototypeAndRegistry;

public class Student implements Prototype{

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatchPSP(double batchPSP) {
        this.batchPSP = batchPSP;
    }

    private String name;
    private int age;
    private String batchName;
    private double psp;
    private double batchPSP;

    Student(){

    }

    Student(Student other){
        this.name= other.name;
        this.age= other.age;
        this.psp=other.psp;
        this.batchPSP= other.batchPSP;
        this.batchName= other.batchName;
    }

    @Override
    public Student clone() {

//        Student st=new Student();
//        st.name=this.name;
//        st.age=this.age;
//        st.batchName=this.batchName;
//        st.psp=this.psp;
//        st.batchPSP=this.batchPSP;

        Student st=new Student(this);
        return st;
    }
}
