package practice;

public class OccuranceofString {
    public static void main(String[] args) {
        String str="Mahabharat";
        str=str.toLowerCase();
        for(int i=0;i<=str.length()-1;i++){
            char ch1=str.charAt(i);
            int count=0;
            for(int j=0;j<=str.length()-1;j++){
                char ch2=str.charAt(j);
                if(ch1==ch2 && i>j){
                    break;
                }if(ch1==ch2){
                    count++;
                }
            }
            if(count>0){
                System.out.println(ch1+":"+count);
            }
        }
    }
}
