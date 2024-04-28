package AdvancedJava.collections;

import java.util.*;
import java.util.Collections;

public class Client {

    public static void main(String[] args) {

        ArrayList<Student> list=new ArrayList<>();

        list.add(new Student("me",22,12));
        list.add(new Student("u",19,13));
        list.add(new Student("them",12,14));



        Collections.sort(list,new StudentAgeComparator()); //custom order
        Collections.sort(list); // natural order

        System.out.println(list);
    }
}
