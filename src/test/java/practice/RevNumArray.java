package practice;

import java.util.Arrays;

public class RevNumArray {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        int revArray[]=new int[a.length];
        int count=0;
        for(int i=a.length-1;i>=0;i--){
            revArray[count++]=a[i];
        }
        System.out.println(Arrays.toString(revArray));
    }
}
