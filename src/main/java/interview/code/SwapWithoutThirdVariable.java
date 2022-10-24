package interview.code;

import java.util.Arrays;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        String str = "wish you a happy pooja";
        String rev = "";
        String s[] = str.split(" ");
        String temp = s[0];
        s[0] = s[s.length - 1];
        s[s.length - 1] = temp;
        for (String s1 : s) {
            rev = rev + s1 + " ";
        }
        System.out.println(Arrays.toString(s));
        System.out.println(rev);
    }
}