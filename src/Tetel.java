import java.util.ArrayList;
import java.util.List;

public class Tetel {
    public static void osszegzes(){
        int[] nums = {3,8,2,4,7};

        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        System.out.println("Osszeg: " + sum);
    }
    public static void fizetesekOsszege(){
        List<Employee> emps = new ArrayList<>();
            emps.add(new Employee("Ernő", "Pécs", 395));
            emps.add(new Employee("Lali", "Pécs", 397));
            emps.add(new Employee("Dani", "Hatvan", 392));
        int sum = 0;
        for(int i = 0; i<emps.size(); i++){
            sum += emps.get(i).salary;
        }
        System.out.println("Fizetések: " + sum);    
    }
    public static void megszamolas(){}
}
