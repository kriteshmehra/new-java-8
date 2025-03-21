package kk_repo.designpattern.programs.string;

public class ReverseString1 {
    public static void main(String[] args) {
        String str1 = "Kritesh Mehra";
        usingStringBuilder(str1);
        usingForLoop(str1);

    }
    private static void usingStringBuilder(String str) {
        StringBuilder strBuilder = new StringBuilder();
        StringBuilder appended = strBuilder.append(str);
        System.out.println(appended.reverse());
    }
    private static void usingForLoop(String str) {
        char[] ch=str.toCharArray();
        for (int i = ch.length-1; i>=0; i--) {
            System.out.print(ch[i]);
        }
    }

}
