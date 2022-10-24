package practice;

public class Codility {
    public static void main(String[] args) {
        String s="50552344457777";
        int big=0;
        for(int i=0;i<s.length()-1;i++){
            big=Math.max(big,Integer.parseInt(s.substring(i,i+2)));

        }
        System.out.println(big);
    }
}
