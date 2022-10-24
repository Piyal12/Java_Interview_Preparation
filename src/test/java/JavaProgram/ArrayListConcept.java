package JavaProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<String> languages=new ArrayList<>();
        languages.add("Java");
        languages.add("C#");
        languages.add(".net");
        languages.forEach(e-> System.out.print(e));

       Employee e1=new Employee("piyal",21,"mech");
       Employee e2=new Employee("sayan",34,"ped");
       Employee e3=new Employee("det",54,"ewfe");
       ArrayList<Employee> arr=new ArrayList<>();
       arr.add(e1);
       arr.add(e2);
       arr.add(e3);

        Iterator<Employee> it = arr.iterator();
        while (it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }

    }

}
