package cracking_the_coding_interview.array_and_strings;

public class OneWay {
    public static void main(String[] args) {
        /**
         *
         * There are three types of edits that can be performed on strings:
         * insert a character, remove a character, or replace a character.
         * Given two strings, write a function to check if they are one edit (or zero edits) away.
         *
         */
        String x = "pale";
        String y = "ple";
        oneEditAway(x, y);

    }

    static boolean oneEditAway(String x, String y) {
        if (x.length() == y.length()) {
            return oneEditReplacement(x, y);
        } else if (x.length() + 1 == y.length()) {
            return onEditInsert(x, y);
        } else if (x.length() - 1 == y.length()) {
            return onEditInsert(y, x);
        }

        return false;
    }

    static boolean oneEditReplacement(String x, String y) {
        boolean foundDifference = false;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != y.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return false;
    }

    /* Check if you can insert a character into x to make y. */
    /* aple and apple */
    static boolean onEditInsert(String x, String y) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < y.length() && index1 < x.length()) {
            if (x.charAt(index1) != y.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return false;
    }

}

