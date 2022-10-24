package practice;

public class ReverseSentence {
    public static void main(String[] args) {
        String str="TODAY IS FRIDAY";
        String s[]=str.split(" ");
        String rev="";
        for(int i=s.length-1;i>=0;i--){
            rev+=s[i]+" ";
        }
        System.out.println(rev);
    }
}
// output FRIDAY IS TODAY