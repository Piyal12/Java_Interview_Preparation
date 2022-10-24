package JavaProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "pppppiiiiiiyyyyyallll";
        char ch[] = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        Set<Character> ch1 = new HashSet<>();
        for (char ch2 : ch) {
            if(ch1.add(ch2)==true)
                System.out.print(ch2);

        }
    }
}