package AdvancedJava.exceptionHandling;

import org.w3c.dom.events.EventException;

public class Doer {

    public int doWork(){
        return 1/0;
    }

    public Object findStudentByRoll(int roll) throws OddNumberException {

        if(roll<30){
            return new Object();
        }

        if(roll%2==0){
            throw new EvenNumberException();
        }

        throw new OddNumberException();
    }
}
