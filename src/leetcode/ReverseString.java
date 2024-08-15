package leetcode;

public class ReverseString {


    public static void main(String[] args) {
        char[] s = new char[] {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }

    public static String reverseString(char[] s) {
        
        int first = 0;
        int last = s.length - 1;

        for (int i=0; i<s.length/2; i++) {
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }

        return "";
    }
    
}
