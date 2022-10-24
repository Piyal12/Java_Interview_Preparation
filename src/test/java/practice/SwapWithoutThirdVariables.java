package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapWithoutThirdVariables {
    public static void main(String[] args) {
        String str="My name is Piyal";
        //Output : Piyal name is My
        String s[]=str.split(" ");
        List<String>list= Arrays.asList(s);
        Collections.swap(list,1,3);
        System.out.println(Arrays.toString(s));

    }
}

class SwapWithoutThirdVariables1 {
    public static void main(String[] args) {
        String str="My name is Piyal";
        String s[]=str.split(" ");
        String a=s[0];//My
        String b=s[s.length-1];//Piyal
        a=a+b;//MyPiyal
        b=a.substring(0,a.length()-b.length());//My
        a=a.substring(b.length());//Piyal
        System.out.println(a+" "+s[1]+" "+s[2]+" "+b);
    }
}
class  SwapWithoutThirdVariables2{
    public static void main(String[] args) {
        int a[]={2,4,5,6,7};
        int x= a[0];
        int y=a[a.length-1];
        System.out.println(x+" "+y);
        x=x+y;//9
        y=x-y;//2
        x=x-y;//7
        System.out.println(x+" "+y);
    }
}