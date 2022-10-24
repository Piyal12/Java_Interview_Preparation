package interview.code;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {
    public static void main(String[] args) {
        int num[]={1,2,3,5,7};
        OptionalDouble average = Arrays.stream(num).average();
        System.out.println(average);
    }
}
