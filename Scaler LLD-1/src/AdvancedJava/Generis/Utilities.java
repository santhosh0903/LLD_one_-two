package AdvancedJava.Generis;

//public class Utilities<K,V> {
//
//    int a, b;
//    public  void doSomething(K key,V value, int a){
//        System.out.println(key +" "+ value+" "+3);
//    }
//}

public class Utilities<K, V> {

    int a, b;
    public  void doSomething(K key,V value, int a, int b){
        System.out.println(key +" "+ value+" "+3+" "+b);
    }

    public static <K, V, W> void doSomething(K key, V value, W ward){
        System.out.println(key +" "+ value+" "+ward);
    }
}
