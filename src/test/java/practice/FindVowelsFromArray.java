package practice;

import java.util.stream.IntStream;

public class FindVowelsFromArray {
    public static void main(String[] args) {
        String str="aeiouAEIOU";
        long count = str.chars().filter(e -> (char) e == 'a' || (char) e == 'e' || (char) e == 'i' || (char) e == 'o' || (char) e == 'u' || (char) e == 'A' || (char) e == 'E' || (char) e == 'I' || (char) e == 'O' || (char) e == 'U').count();
        System.out.println(count);


        long count1 = str.chars().filter(e -> (char) e == 'a' || (char) e == 'e' || (char) e == 'i' ).count();

    }
}
