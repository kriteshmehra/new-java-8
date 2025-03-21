package kk_repo.designpattern.immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableMain {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","first");
        map.put("2","second");

        Immutable1 immutable = new Immutable1("ABC",101,map);
        System.out.println(immutable.getName());
        System.out.println(immutable.getRegNo());
        System.out.println(immutable.getMetaData());

        map.put("3","third");
        System.out.println(immutable.getMetaData());
        immutable.getMetaData().put("4", "fourth");
        System.out.println(immutable.getMetaData());
    }
}
