package practice;

public class SwapWordWithThirdVariable {
    public static void main(String[] args) {
        String str="wish you a happy pooja";
        String res="";
        String s[]=str.split(" ");
        String temp=s[0];
        s[0]=s[s.length-1];
        s[s.length-1]=temp;
        for (String s1:s){
            res+=s1+" ";
        }
        System.out.println(res);
    }
}
