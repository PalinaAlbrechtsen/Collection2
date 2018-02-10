package Homework.first;

import java.util.Arrays;
import java.util.List;

public class TextFormatting {

    public static String deletePunctuationMarks(String text) {
        String formattedText = text;
        formattedText = formattedText.replaceAll("[,?.!)(:;\"\\-]", " ");
        formattedText = formattedText.replaceAll("\\s+", " ");

        return formattedText;
    }

    public static List createListFromStringLine(String text) {
        return Arrays.asList(text.split(" "));
    }
}
