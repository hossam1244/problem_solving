package leetcode;

public class LengthOfLastString {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }


    public static int lengthOfLastWord(String s) {
       int lengthOfLastWord = 0;
        int i = s.length() - 1;


        for (int j = i; j >=0; j--) {
            if (s.charAt(j) == ' ') {
                if (lengthOfLastWord != 0) {
                    return lengthOfLastWord;
                }
            } else {
                lengthOfLastWord++;
            }
        }
        return lengthOfLastWord;

    }
    
}
