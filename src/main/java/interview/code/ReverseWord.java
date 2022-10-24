package interview.code;

public class ReverseWord {
    public static void main(String[] args) {
        String str="wish you all happy pooja";
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}
