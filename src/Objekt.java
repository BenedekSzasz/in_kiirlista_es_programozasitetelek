import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {
    String name;
    String city;
    int salary;
    public Employee(String name, String city, int salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return name + " " + city + " " + salary;
    }

}

public class Objekt {
    public static void task01(){
        Employee[] empArray = new Employee[3];
        empArray[0] = new Employee("Ernő", "Pécs", 395);
        empArray[1] = new Employee("Lali", "Pécs", 397);
        empArray[2] = new Employee("Dani", "Hatvan", 392);

        List<Employee> emps1 = new ArrayList<>(Arrays.asList(empArray));

        List<Employee> emps2 = new ArrayList<>();
        emps2.add(new Employee("Ernő", "Pécs", 395));
        emps2.add(new Employee("Lali", "Pécs", 397));
        emps2.add(new Employee("Dani", "Hatvan", 392));

        for(Employee emp: emps2){
            System.out.println(emp.toString());
        }
        System.out.println("-----forEach-----");
        for (int i = 0; i < emps2.size(); i++) {
            System.out.println(emps2.get(i).toString());
        }

        System.out.println("-----forEach-----");
        emps2.forEach(System.out::println);

        System.out.println("-----forEach-----");
        emps2.forEach(e -> System.out.println(e));

        emps2.forEach(e -> {System.out.println(e);});
        int kulso = 35;
        emps2.forEach(e -> System.out.println(e.salary * kulso));
    }
}
