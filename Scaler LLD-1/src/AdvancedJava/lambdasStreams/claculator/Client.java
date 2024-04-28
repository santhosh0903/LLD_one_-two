package AdvancedJava.lambdasStreams.claculator;

public class Client {

    public static void main(String[] args) {

        MathOperator addtion=(a,b)->{
            return a+b;
        };

        MathOperator subtraction=(a,b)->a-b;

        MathOperator multiply=(a,b)->{
            return a*b;
        };

        MathOperator division=(a,b)->a/b;

        System.out.println(addtion.operate(1,2));
        System.out.println(subtraction.operate(2,1));
        System.out.println(multiply.operate(1,2));
        System.out.println(division.operate(8,2));

    }

}
