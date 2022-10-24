package interview.code;

import java.util.Arrays;

public class SwapWord {
    public static void main(String[] args) {
        String str="wish you a happy pooja";
        String rev="";
        String s[]=str.split(" ");
        System.out.println(Arrays.toString(s));
        String temp=s[0];
        s[0]=s[s.length-1];
        s[s.length-1]=temp;
        for (String s1:s){
            rev+=s1+" ";
        }
        System.out.println(rev);
    }
}
