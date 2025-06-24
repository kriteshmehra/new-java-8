package kk_repo.designpattern.string;

public class StringCount {
    public static void main(String[] args) {
        String input = "aabbbccaa";
        String output = compressString(input);
        System.out.println(output); // Output: a2b2c2a2
    }

    public static String compressString(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                sb.append(chars[i - 1]).append(count);
                count = 1;
            }
        }
        sb.append(chars[chars.length - 1]).append(count);
        return sb.toString();
    }

}
