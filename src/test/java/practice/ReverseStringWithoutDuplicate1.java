package practice;

import java.util.LinkedHashSet;

public class ReverseStringWithoutDuplicate1 {
    public static void main(String[] args) {
        String str="pppiiiyaal";
        String rev="";
        for(int i=str.length()-1;i>=0;i--) {
            if (rev.indexOf(str.charAt(i))==-1){
                rev=rev+str.charAt(i);
            }
        }
        System.out.println(rev);
    }
}
