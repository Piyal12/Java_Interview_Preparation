package interview.code;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Lis ten", "Silent "));
        System.out.println(isAnagram("rat","aRT"));
        System.out.println(isAnagram("  oa t ","AC T   "));
    }
    public static boolean isAnagram(String s1, String s2) {
        char[] ch1 = s1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] ch2 = s2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        if (ch1.length == ch2.length) {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            System.out.println(Arrays.toString(ch1)+"=="+Arrays.toString(ch2));
            return Arrays.equals(ch1, ch2);
        } else {
          return false;
        }
    }
}
