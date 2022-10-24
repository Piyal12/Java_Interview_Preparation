package practice;

public class ReverseSentence1 {
    public static void main(String[] args) {
        String str="happy holi to all of you";
        String s[]=str.split(" ");
        String rev="";
        for (int i=s.length-1;i>=0;i--){
            String word=s[i];
            for(int j=word.length()-1;j>=0;j--){
                rev+=word.charAt(j);
            }
                rev+=" ";
        }
        System.out.println(rev);
    }
}
