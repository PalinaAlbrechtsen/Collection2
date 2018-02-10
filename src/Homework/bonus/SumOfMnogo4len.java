package Homework.bonus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SumOfMnogo4len {

    public static void main(String[] args) {
        Map<Integer, Integer> firstMnogo4len = new HashMap<>();
        Map<Integer, Integer> secondMnogo4len = new HashMap<>();

        firstMnogo4len.put(6, 1);
        firstMnogo4len.put(4, 2);
        firstMnogo4len.put(3, 3);
        firstMnogo4len.put(1, 5);
        firstMnogo4len.put(0, 4);

        secondMnogo4len.put(6, 5);
        secondMnogo4len.put(4, 2);
        secondMnogo4len.put(3, 3);
        secondMnogo4len.put(2, 1);
        secondMnogo4len.put(0, 4);

        Map<Integer, Integer> sum = getSumOfMnogo4lens(firstMnogo4len, secondMnogo4len);
        print(sum);
        System.out.println();
        System.out.println("sumMnogo4len: " + sum);
    }

    private static Map<Integer, Integer> getSumOfMnogo4lens(Map<Integer, Integer> firstMnogo4len, Map<Integer, Integer> secondMnogo4len) {
        Map<Integer, Integer> sum = new TreeMap<>(Collections.reverseOrder());
        sum.putAll(firstMnogo4len);
        for (Map.Entry<Integer, Integer> entry : secondMnogo4len.entrySet()) {
            sum.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return sum;
    }

    private static void print(Map<Integer, Integer> sum) {
        for (Map.Entry<Integer, Integer> integerIntegerEntry : sum.entrySet()) {
            switch (integerIntegerEntry.getKey()) {
                case 0:
                    System.out.print(integerIntegerEntry.getValue());
                    break;
                case 1:
                    System.out.print(integerIntegerEntry.getValue() + "x + ");
                    break;
                default:
                    System.out.print(integerIntegerEntry.getValue() + "x^" + integerIntegerEntry.getKey() + " + ");
            }
        }
    }
}
