package kk_repo.designpattern.immutable;

import java.util.HashMap;
import java.util.Map;

final class Immutable1 {
    private final String name;
    private final int regNo;
    private final Map<String, String> metaData;

    public Immutable1(String name, int regNo, Map<String, String> metaData) {
        this.name = name;
        this.regNo = regNo;
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String,String> entry : metaData.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metaData = tempMap;
    }

    public String getName() {
        return name;
    }
    public int getRegNo() {
        return regNo;
    }
    public Map<String,String> getMetaData() {
        Map<String,String> tempMap = new HashMap<>();
        for (Map.Entry<String,String> entry : this.metaData.entrySet()) {
            tempMap.put(entry.getKey(),entry.getValue());
        }
        return tempMap;
    }
}
