package interview.code;

public class SCP {
    public static void main(String[] args) {
        String s1="mallinath";
        String s2="mallinath";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println("===========");
        String s3=new String("Hello");
        String s4=new String("Hello");
        String concat1 = s3.concat(s4);
        System.out.println("Contat : "+concat1);
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
    }
}
