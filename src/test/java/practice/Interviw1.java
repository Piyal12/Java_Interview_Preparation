package practice;

import java.util.Arrays;

public class Interviw1 {
    public static void main(String[] args) {
        String str = "Java has oops concepts";
        String s[]=str.split(" ");
        String rev="";
        System.out.println(Arrays.toString(s));
       for(int i=0;i<=s.length-1;i++){
           String word=s[i];
           String res="";
           int count=0;
           for(int j=0;j<word.length();j++){
               if(res.indexOf(word.charAt(j))==-1 ){
                   res+=word.charAt(j);
               }
           }
           rev+=res+" ";
       }
        System.out.println(rev);
    }
}
