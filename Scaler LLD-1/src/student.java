public class student {

         String name;
         Batch b;

         student(){

         }

        student(student original ){
            this.name=original.name;
//            this.b=original.b;
            this.b=new Batch(original.b);
        }
}
