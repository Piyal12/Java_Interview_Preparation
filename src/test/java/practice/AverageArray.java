package practice;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {
    public static void main(String[] args) {
        int a[]={1,2,3,5,6};
        OptionalDouble average = Arrays.stream(a).average();
        System.out.println(average);
    }
}
