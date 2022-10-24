package interview.code;

public class StringManipulation1 {
    public static void main(String[] args) {
        String s = "Abc@12300xyz$%123mn";
        String str = s.replaceAll("[0-9]", " ").
                            replaceAll("\\W", " ").
                                 replaceAll("[ ]{1,}", " ");
        String[] s1 = str.split(" ");
        for (String s2 : s1) {
            if (s2.equalsIgnoreCase(" ")) {
                System.out.println();
            } else {
                System.out.println(s2);
            }
        }

    }
}
