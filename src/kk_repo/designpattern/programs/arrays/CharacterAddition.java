package kk_repo.designpattern.programs.arrays;

public class CharacterAddition {
    public static String addCharacters(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result += c; // Concatenating characters to the result string
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "abcdded";
        String result = addCharacters(str);
        System.out.println("Resulting string: " + result);
    }
}
