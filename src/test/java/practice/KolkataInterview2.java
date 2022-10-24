package practice;

public class KolkataInterview2 {
    public static void main(String[] args) {
        String str="TODAY IS FRIDAY";
        String s[]=str.split(" ");
        String res="";
        String res1="";
        for(int i=s.length-1;i>=0;i--){
            res+=s[i]+" ";
        }
        String temp=s[0];
        s[0]=s[s.length-1];
        s[s.length-1]=temp;
        for(String s2:s){
            res1+=s2+" ";
        }

        System.out.println(res);
        System.out.println("=================");
        System.out.println(res1);
    }
}
