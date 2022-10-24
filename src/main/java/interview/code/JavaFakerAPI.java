package interview.code;

import com.github.javafaker.Faker;

public class JavaFakerAPI {
    public static void main(String[] args) {
        Faker faker=new Faker();
        String s = faker.internet().emailAddress();
        String s1=faker.address().fullAddress();
        String s2 = faker.address().secondaryAddress();
        String s3 = faker.address().buildingNumber();
        String city = faker.address().city();
        String name = faker.animal().name();
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(city);
        System.out.println(name);
        System.out.println(s);
    }
}
