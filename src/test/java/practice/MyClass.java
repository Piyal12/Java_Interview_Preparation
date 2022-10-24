package practice;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
    public static void main(String[] args) {
        int []arrKey={2,3,4,5,6,7,8,9,10};
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<arrKey.length;i++){
            map.put(arrKey[i],arrKey[i]*2);
        }
        for(Map.Entry entry:map.entrySet()){
            System.out.println("["+entry.getKey()+","+entry.getValue()+"]\t");
        }
        System.out.println(map);
    }
}
