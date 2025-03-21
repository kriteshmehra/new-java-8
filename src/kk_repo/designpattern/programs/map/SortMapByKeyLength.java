package kk_repo.designpattern.programs.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByKeyLength {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Akshaya",30);
        map1.put("Himanshu",22);
        map1.put("Yash",11);
        map1.put("Rohan",45);

        Map<String, Integer> collect = map1.entrySet().stream()
              .sorted(Comparator.comparing(stringIntegerEntry -> stringIntegerEntry.getKey().length()))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (integer, integer2) -> integer2, LinkedHashMap::new
            ));
/*              .collect(
                    LinkedHashMap::new,
                    (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                    LinkedHashMap::putAll
              );*/
        System.out.println(collect); //{Yash=11, Rohan=45, Akshaya=30, Himanshu=22}
    }
}