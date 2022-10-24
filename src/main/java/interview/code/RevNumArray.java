package interview.code;

import java.util.Arrays;
import java.util.OptionalDouble;

public class RevNumArray {
    public static void main(String[] args) {
        int a[]={2,5,7,3,9,3};
        int revarray[]=new int[a.length];
        int count=0;
        for (int i=a.length-1;i>=0;i--){
            revarray[count++]=a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(revarray));

        int [] b={2,5,7};
        int rev[]=new int[b.length];
        int count1=0;
        for(int i=b.length-1;i>=0;i--){
            rev[count1++]=b[i];
        }
        System.out.println(Arrays.toString(rev));
    }



}
