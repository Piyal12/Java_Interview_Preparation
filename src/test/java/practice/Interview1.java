package practice;

public class Interview1 {
    public static void main(String[] args) {
        String str = "Java has oops concepts";
        String s[] = str.split(" ");
        String res = "";
        for (String s1 : s) {
            char word[] = s1.toCharArray();
            String uniWord="";
            for (int i = 0; i <= word.length - 1; i++) {
                int count = 0;
                for (int j = 0; j <= word.length - 1; j++) {
                    if(word[i]==word[j]){
                        count++;
                    }
                }
                if(count==1){
                    uniWord+=word[i];
                }
            }
            res+=uniWord+" ";
        }
        System.out.println(res);
    }
}