package practice;

import java.util.*;

public class DuplicateWord {
    public static void main(String[] args) {
        String infra[]={"Amazon","GCP","Azure","Amazon","Sauce Labs","GCP"};
        for(int i=0;i<infra.length;i++){
            for(int j=i+1;j<infra.length;j++){
                if(infra[i].equals(infra[j])){
                    System.out.println(infra[i]);
                }
            }
        }
    }
}

class DuplicateWord1{
    public static void main(String[] args) {
        String infra[]={"Amazon","GCP","Azure","Amazon","Sauce Labs","GCP"};
        for(int i=0;i<infra.length;i++){
            for(int j=i+1;j<infra.length;j++){
                if(infra[i].length()>infra[j].length()){
                    String temp=infra[i];
                    infra[i]=infra[j];
                    infra[j]=temp;
                }
            }
            System.out.println(infra[i]);//sorting
        }

    }
}
class JCL1{
    public static void main(String[] args) {
        String [] str={"Java",".Net","C#","Java"};

        //Brute Force Method
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                    System.out.println(str[i]);
                }
            }
        }
        //Using Collection concept
        List<String> duplicateWords=new ArrayList<>();
        HashSet<String> uniqueWords=new HashSet<>();
        for(String s:str){
            if(!uniqueWords.add(s)){
                duplicateWords.add(s);
            }
        }
        System.out.println(duplicateWords);
    }
}
class RemoveDuplicateChar{
    public static void main(String[] args) {
        String str="piiyaall";
        char [] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
//        ArrayList<Character>dup=new ArrayList<>();
        Set<Character> uni=new HashSet<>();
        for(char c:ch){
//            if(!uni.add(c))
//                dup.add(c);
            uni.add(c);
        }
        System.out.println(uni);
//        System.out.println(dup);
    }
}
class JCL2{
    public static void main(String[] args) {
        String [] str={"Java",".Net","C#","Java"};
        Set<String> set=new HashSet<>();
        for(String s1:str){
          if(set.add(s1)==false){
              System.out.println(s1);
          }
        }
    }
}
class JCL3{
    public static void main(String[] args) {
        String s="ppiyal";
        char [] ch=s.toCharArray();
        Set<Character> set=new HashSet<>();
        for(char s1:ch){
            if(set.add(s1)==false){
                System.out.println(s1);
            }
        }
    }
}