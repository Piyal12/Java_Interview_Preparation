package interview.code;

import java.util.Arrays;

public class ShiftZeroToRight {
    public static void main(String[] args) {
        int [] i={1,0,2,0,3,0,0,0,5,9};
        System.out.println(Arrays.toString(shiftZeroToRight(i)));
    }
    private static int [] shiftZeroToRight(int [] arr){
        int newArray[]=new int[arr.length];
        int count=0;
        for(int a:arr){
            if(a!=0){
                newArray[count++]=a;
            }
        }
        return newArray;
    }
}
class ShiftZero{
    public static void main(String[] args) {
        int [] i={1,0,2,0,3,0,0,0,5,9};
        int newArr[]=new int[i.length];
        int count=0;
        for(int a:i){
            if(a!=0){
                System.out.print(a);
                newArr[count++]=a;

            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}