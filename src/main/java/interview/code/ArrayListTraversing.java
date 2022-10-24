package interview.code;

import java.util.ArrayList;

public class ArrayListTraversing {
    public static void main(String[] args) {
        ArrayList<String> languages =new ArrayList<>();
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");

        languages.forEach(e-> System.out.print(e+" ,"));

    }
}