package practice;

public class StringFilter {
    public static void main(String[] args) {
        String str="name123xyz75ABC12";
        String res="";
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='z'){
                res+=str.charAt(i);
            }

        }
        System.out.println(res);
    }
}
