package practice;

import java.util.Arrays;

public class SortingOfNumber {
    public static void main(String[] args) {
        int a[]= new int[]{3,2,7,4,3,-3,-5};
        for(int i=0;i<=a.length-1;i++){
            for(int j=i+1;j<=a.length-1;j++){
                int temp=0;
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
