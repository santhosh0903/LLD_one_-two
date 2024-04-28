package DesignPatterns.BuilderDesign;

public class Student {

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPsp() {
        return psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    private String name;
    private int age;
    private int psp;
    private String universityName;

    public static Builder getBuilder(){
        return new Builder();
    }


    public static class Builder {

        private String name;
        private int age;
        private int psp;
        private String universityName;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getPsp() {
            return psp;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Student build() throws Exception {

            if(getAge()<19){
                throw new Exception();
            }
            return new Student(this);
        }


    }

   private Student(Builder builder) throws Exception {

        this.name= builder.getName();
        this.age=builder.getAge();
        this.psp=builder.getPsp();
        this.universityName=builder.getUniversityName();

    }
}
