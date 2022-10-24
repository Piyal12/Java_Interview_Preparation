package practice;

public class SwapWords {
    public static void main(String[] args) {
        String str="TODAY IS FRIDAY";
        String s[]=str.split(" ");
        String rev="";
        String temp=s[0];
        s[0]=s[s.length-1];
        s[s.length-1]=temp;
        for (String s1:s){
            rev+=s1+" ";
        }
        System.out.println(rev);
    }
}
