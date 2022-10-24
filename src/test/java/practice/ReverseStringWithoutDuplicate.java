package practice;

public class ReverseStringWithoutDuplicate {
    public static void main(String[] args) {
        String str="pppiyaaal";
        String rev="";
        String rev1="";
        for (int i=str.length()-1;i>=0;i--){
            if (rev.indexOf(str.charAt(i))==-1){
                rev+=str.charAt(i);
            }
            rev1+=str.charAt(i);
        }
        System.out.println(rev);
        System.out.println(rev1);
    }
}
