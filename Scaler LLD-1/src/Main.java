//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        student s=new student();
        s.name="santhosh";
        s.b=new Batch();
        s.b.id=10;

        student sCopy=new student(s);
        sCopy.b.id=20;
        System.out.println(s.b.id);




    }
}