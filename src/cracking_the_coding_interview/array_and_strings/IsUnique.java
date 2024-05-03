package cracking_the_coding_interview.array_and_strings;

public class IsUnique {
    public static void main(String[] args) {
        /**
         * Implement an algorithm to determine if a string has all unique characters.
         * What if you cannot use additional data structures?
         */
        String x = "abc";
        System.out.println(IsUnique2(x));

    }

    static boolean isUnique(String x) {
        int leftPointer = 0;
        int rightPointer = x.length() - 1;
        while (leftPointer != rightPointer) {
            if (x.charAt(leftPointer) == x.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    static boolean IsUnique2(String x) {
        if (x.length() > 128) return false;

        Boolean[] char_set = new Boolean[128];
        for (int i = 0; i < x.length(); i++) {
            int value = x.charAt(i);
            System.out.println(value);
            if (char_set[value] != null) {
                return false;
            }
            char_set[value] = true;
        }

        return true;
    }
}
