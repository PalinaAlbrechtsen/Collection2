package Homework.first;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsOfText {

    public static void getOverReps(List<String> list) {
        List<String> listForSet = list;
        Set<String> set = new HashSet(listForSet);
        for (String word : set) {
            System.out.println("\"" + word + "\"" + " повторяется в тексте "
                    + countRepsOfWord(word, listForSet) + " раз");
        }
    }

    public static int countRepsOfWord(String object, List<String> list) {
        int count = 0;
        for (String word : list) {
            if (word.equals(object)) {
                count++;
            }
        }

        return count;
    }
}
