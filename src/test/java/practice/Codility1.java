package practice;

public class Codility1 {
    public static void main(String[] args) {
        String str="23455";
        int big=0;
        for(int i=0;i<str.length()-1;i++){
            big=Math.max(big,Integer.parseInt(str.substring(i,i+2)));
        }
        System.out.println(big);
    }
}
