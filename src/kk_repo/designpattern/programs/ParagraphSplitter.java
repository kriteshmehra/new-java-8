package kk_repo.designpattern.programs;

import java.util.ArrayList;
import java.util.List;

public class ParagraphSplitter {
    public static List<String> splitParagraph(String paragraph, int maxCharactersPerLine) {
        List<String> lines = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();
        String[] words = paragraph.split(" "); // Split paragraph into words
        for (String word : words) {
            if (currentLine.length() + word.length() <= maxCharactersPerLine) {
                // Add word to the current line if it doesn't exceed the max length
                if (currentLine.length() > 0) {
                    currentLine.append(" ");
                }
                currentLine.append(word);
            } else {
                // Start a new line if adding the word exceeds the max length
                lines.add(currentLine.toString());
                currentLine = new StringBuilder(word);
            }
        }
        // Add the remaining line
        if (currentLine.length() > 0) {
            lines.add(currentLine.toString());
        }
        return lines;
    }
    public static void main(String[] args) {
        String paragraph = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec mi eu justo finibus dignissim. Aenean euismod metus vel purus aliquet, at malesuada lacus ultricies. Quisque quis arcu quis risus iaculis semper. Sed vehicula, sapien nec tincidunt aliquet, magna ipsum fermentum purus, sit amet convallis odio ligula eget nisl. Etiam vel turpis dui.";
        int maxCharactersPerLine = 40;
        List<String> lines = splitParagraph(paragraph, maxCharactersPerLine);
        // Print the lines
        for (String line : lines) {
            System.out.println(line);
        }

        //otherWay(paragraph);
    }
}
