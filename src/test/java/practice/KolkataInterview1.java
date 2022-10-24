package practice;

public class KolkataInterview1 {
    public static void main(String[] args) {

        String str="TODAY IS FRIDAY AND ALSO IT IS NOT A HOLIDAY";
        String s[]=str.split(" ");
        String res="";
        String temp;

           temp =s[0];
           s[0]=s[s.length-8];
           s[s.length-8]=temp;
            for(String s1:s){
                res=res+s1+" ";

            }
        System.out.println(res);
          }


    }

