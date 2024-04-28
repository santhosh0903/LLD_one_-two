package AdvancedJava.collections;

import java.util.Comparator;

public class Student implements Comparable<Student>{

    String name;
    int age;
    int rollNumber;

    Student(String name, int age, int rollNumber){

        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
    }

    @Override
    public int compareTo(Student other) {

        if(this.rollNumber==other.rollNumber){
            return 0;
        }else if(this.rollNumber> other.rollNumber){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.name+" "+this.age+" "+this.rollNumber;
    }
}
