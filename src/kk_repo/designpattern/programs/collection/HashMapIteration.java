package kk_repo.designpattern.programs.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(1,"kdk");
        map.put(4,"word");
        map.put(3,"book");
        Iterator itr = map.entrySet().iterator();
        System.out.println("Iterating using While loop");
        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("Key= "+ me.getKey()+ " value= " + me.getValue());
        }
        System.out.println("Iterating using for loop");
        for (Map.Entry me: map.entrySet()) {
            System.out.println("Key "+ me.getKey()+ " value= " + me.getValue());
        }
    }
}
