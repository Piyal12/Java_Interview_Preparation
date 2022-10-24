package interview.code;

import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        String s="aaabbccaa";
        char [] ch = s.toCharArray();
        Map<Character,Integer>map=new LinkedHashMap<>();
        for(Character c:ch){
            if(  map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}
