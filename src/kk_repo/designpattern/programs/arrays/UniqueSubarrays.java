package kk_repo.designpattern.programs.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*      Find the length of max subarray? //abbcdbefghhii
        sub array:
        ab
        bcd
        befgh
        hi
        i
        output: 5
*/
public class UniqueSubarrays {
    public static void main(String[] args) {
        String str = "abbcdbefghhii";
        StringBuilder resultStr = new StringBuilder();
        List<String> ls = new ArrayList<>();
        for (int i=0; i<str.length(); i++) {
            if (resultStr.toString().contains(String.valueOf(str.charAt(i)))) {
                ls.add(resultStr.toString());
                resultStr = new StringBuilder();
                resultStr.append(str.charAt(i));
            } else {
                resultStr.append(str.charAt(i));
            }
        }
        if (!resultStr.toString().isEmpty()) {
            ls.add(resultStr.toString());
        }
        System.out.println(ls); //[ab, bcd, befgh, hi, i]
        System.out.println(ls.size()); //5
    }
}