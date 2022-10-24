package interview.code;

import java.util.Arrays;

public class RemoveWhiteSpacesWithoutInbuiltMethod {
    public static void main(String[] args) {
        String s="   This is my java code   ";
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && s.charAt(i)!='\t'){
                res=res+s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
class RemoveWhiteSpacesWithoutInbuiltMethod1{
    public static void main(String[] args) {
        String s="   This is my java code   ";
        String[] newString = s.split("\\s+");
        System.out.println(Arrays.toString(newString));
        StringBuffer res=new StringBuffer();
        for(String e:newString){
            res.append(e);
        }
        System.out.println(res);
    }
}