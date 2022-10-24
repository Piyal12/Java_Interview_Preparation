package interview.code;

public class ReverseStringwithoutDuplicate {
    public static void main(String[] args) {
        String str = "Ppiyaaaaaallll";
        String rev="";
        for (int i=0;i<=str.length()-1;i++){
            if(rev.indexOf(str.charAt(i))==-1){
                rev=str.charAt(i)+rev;
            }
        }
        System.out.println(rev);
    }
}