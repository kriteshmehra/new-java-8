package kk_repo.designpattern.programs.string;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        String str5 = str3;

        if (str1 == str2) {
            System.out.println("str1 == str2"); //str1 == str2
        }
        if (str1.equals(str2)){
            System.out.println("str1.equals(str2)"); //str1.equals(str2)
        }
        if (str3 == str4) {
            System.out.println("str3 == str4"); // False
        }
        if (str3.equals(str4)) {
            System.out.println("str3.equals(str4)"); //str3.equals(str4)
        }
        if (str5 == str3){
            System.out.println("str5 == str3"); //str5 == str3
        }

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");
        if (sb1.equals(sb2)) {
            System.out.println("true-sb1.equals(sb2)");
        }else {
            System.out.println("false - sb1.equals(sb2)");
        }
        if (sb1 == sb2) {
            System.out.println("true - sb1 == sb2");
        }else {
            System.out.println("false - sb1 == sb2");
        }

        StringBuilder builder1 = new StringBuilder("abc");
        StringBuilder builder2 = new StringBuilder("abc");
        if (builder1.equals(builder2)) {
            System.out.println("true-builder1.equals(builder2)");
        }else {
            System.out.println("false - builder1.equals(builder2)");
        }
        if (builder1 == builder2) {
            System.out.println("true - builder1 == builder2");
        }else {
            System.out.println("false - builder1 == builder2");
        }


    }
}
