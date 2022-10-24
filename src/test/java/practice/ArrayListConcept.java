package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args) {
        Employee e1=new Employee("abc",12,"QA");
        Employee e2=new Employee("bcd",21,"QA");
        Employee e3=new Employee("efg",34,"QA");

        ArrayList<Employee> ar4=new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        Iterator<Employee> it = ar4.iterator();
        while (it.hasNext()){
            Employee emp=it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }
    }
}
