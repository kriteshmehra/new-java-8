package kk_repo.designpattern.programs.string;

public class TestString {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");
        StringBuffer sb3 = sb1;
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
    }
}
