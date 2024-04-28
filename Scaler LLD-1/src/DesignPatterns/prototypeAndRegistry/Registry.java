package DesignPatterns.prototypeAndRegistry;

import java.util.HashMap;

public class Registry {

    HashMap<String,Student> map=new HashMap<>();

    public void setRegistry(String key,Student student){
        map.put(key,student);
    }

    public Student get(String key){
        return  map.get(key);
    }

}
