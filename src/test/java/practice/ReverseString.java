package practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseString {
    public static void main(String[] args) {
        String str="Pppiyaaal";
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}

class RevString {
    public static void main(String[] args) {
        String str = "apple";
        char ch1[] = str.toCharArray();
        String rev="";
        Set<Character> set = new LinkedHashSet<Character>();
        for (char c : ch1) {
            set.add(c);
        }
        System.out.println(set);
    }
}