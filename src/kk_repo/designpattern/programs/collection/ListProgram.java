package kk_repo.designpattern.programs.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListProgram {
    public static void main(String[] args) {
        removeAndAddElementsInList();
    }

    private static void removeAndAddElementsInList() {
        String[] arr1 = {"ABC" ,"DEF" ,"GHI" , "JKL" ,"MNO"};
        List<String> ls = Arrays.asList(arr1);
        System.out.println("initial = " +ls);

        for (String str: ls) {
            ls.add("str");
        }
/*        for (String str: ls) {
            //ls.remove(str);
            ls.add("kritesh");
        }
        System.out.println("final = " +ls);*/
    }
}
