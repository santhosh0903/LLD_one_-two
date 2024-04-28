package AdvancedJava.concurrency.synchronisedmethod;

public class Count {
    private int val;

    synchronized public void offSet(int val){
        this.val=this.val+val;
    }

    public int getVal(){
        return this.val;
    }
}
