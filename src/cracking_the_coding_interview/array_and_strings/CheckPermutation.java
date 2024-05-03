package cracking_the_coding_interview.array_and_strings;

import java.util.Arrays;

public class CheckPermutation {

    public static void main(String[] args) {
        /**
         * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
         * It is a combination problem because you don't care the order the people are selected
         * . A committee of ABCDE is the same as one of EBADC
         */
        String first = "abcd";
        String second = "badc";

        System.out.println(checkPermutationSecondSolution(first, second));
    }


    static String sort(String x) {
        char[] chars = x.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    static boolean checkPermutation(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        return sort(first).equals(sort(second));
    }

    static boolean checkPermutationSecondSolution(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        int[] letters = new int[128];

        char[] firstStringCharArray = first.toCharArray();

        for (char character : firstStringCharArray) {
            letters[character]++;
        }

        for (int i = 0; i < second.length(); i++) {
            int c = second.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }

        }
        return true;
    }
}
