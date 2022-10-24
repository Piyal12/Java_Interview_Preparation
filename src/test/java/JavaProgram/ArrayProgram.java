package JavaProgram;

import java.util.*;

public class ArrayProgram {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 2;
        a[1] = 3;
        a[2] = 4;
        System.out.println(a[2]);
    }
}

class Array1 {
    public static void main(String[] args) {
        int[] a = {32, 54, 12, 12, 32};
        Set<Integer> set = new HashSet<>();

        for (Integer i : a) {
            if (set.add(i) == false) {
                System.out.println(i);

            }
        }
    }
}

class Array2 {
    public static void main(String[] args) {
        String str = "xxxxxxxyyyyyyzzz";
        StringBuilder sb = new StringBuilder(str);
        String s1 = sb.reverse().toString();
        System.out.println(s1);
        char[] s = s1.toCharArray();
        System.out.println(Arrays.toString(s));
        Set<Character> set = new HashSet<>();

        for (Character i : s) {
            if (set.add(i) == true) {
                System.out.print(i);

            }
        }
    }
}
class Array3 {
    public static void main(String[] args) {
        String str = "xxxxxxxyyyyyyzzz";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        Set<Character>set=new HashSet<>();
        for (Character s:rev.toCharArray()){
            if(set.add(s)==true){
                System.out.println(s);
            }
        }

    }
}
