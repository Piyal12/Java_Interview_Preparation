package JavaProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {
    public static void main(String[] args) {
        String infra[] = {"Amazon", "GCP", "Azure", "Amazon", "Sauce Labs", "GCP"};
        Set<String> set=new HashSet<>();
        for(String s:infra){
            if(set.add(s)==false)
                System.out.println(s);
        }
    }
}