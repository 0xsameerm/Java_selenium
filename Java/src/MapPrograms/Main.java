package MapPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee{
    String name;
    int age;

    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name+" - "+age;
    }

}
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of entries: ");
        int n = sc.nextInt();

        Map<Integer,Employee> map = new HashMap<>();
//        map.put(1,new Employee("Messi",38));
//        map.put(2,new Employee("Stokes",34));
//        map.put(3,new Employee("Dhoni",44));

        for(int i=1; i<=n; i++) {
            System.out.println("Enter the name: ");
            String name = sc.next();
            System.out.println("Enter the age: ");
            int age = sc.nextInt();
            map.put(i, new Employee(name, age));
        }

        for(Map.Entry<Integer,Employee> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}
