package DesignPatterns.BuilderDesign;

public class Client {
    public static void main(String[] args) throws Exception {

//        Builder builder=new Builder();
//        builder.setName("Santhosh");
//        builder.setAge(18);
//        builder.setPsp(90);
//        builder.setUniversityName("Scaler");


        Student student=Student.getBuilder()
                .setName("Santhosh")
                .setAge(20)
                .setPsp(90)
                .setUniversityName("Scaler")
                .build();

        System.out.println(student.getName()+" "+student.getAge()+" "+student.getPsp()+" "+student.getUniversityName());
        
    }
}
