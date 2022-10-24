package interview.code;

import java.util.HashMap;

public class IntOccurances {
    public static void main(String[] args) {
        int [] a={1,1,1,1,5,6,2,5,3,4};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(Integer i:a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println(map);
    }
}
class CharOccurances{
    public static void main(String[] args) {
        String str="Mahabharat";
        str=str.toLowerCase();
        char a[]=str.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(Character i:a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println(map);
    }
}
class StringOccurances{
    public static void main(String[] args) {
        String str[]={"java",".net","c#","java","java"};
        HashMap<String,Integer>map=new HashMap<>();
        for(String s:str){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        System.out.println(map);
    }
}
class StringOccuranceswithJava8{
    public static void main(String[] args) {
        String str[]={"java",".net","c#","java","java"};
        //output : {c#=1, java=3, .net=1}
        HashMap<String,Integer>map=new HashMap<>();
        for(String s:str){
            Integer integer = map.containsKey(s) ? map.put(s, map.get(s) + 1) : map.put(s, 1);
        }
        System.out.println(map);
    }
}
