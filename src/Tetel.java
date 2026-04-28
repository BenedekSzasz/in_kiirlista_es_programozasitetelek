import java.util.ArrayList;
import java.util.List;

public class Tetel {
    static int[] nums = {3,8,2,4,7};
    static List<Employee> emps = new ArrayList<>();
    static {
        emps.add(new Employee("Ernő", "Pécs", 395));
        emps.add(new Employee("Lali", "Pécs", 397));
        emps.add(new Employee("Dani", "Hatvan", 392));

    }

    public static void osszegzes() {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Osszeg: " + sum);
    }

    public static void fizetesekOsszege() {
        int sum = 0;
        for (int i = 0; i < emps.size(); i++) {
            sum += emps.get(i).salary;
        }
        System.out.println("\nFizetések: " + sum);    
    }

    public static void megszamolas() {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]>5) {
                count++;
            }
        }
        System.out.println("\nDarab: " + count);
    }
    public static void magasFizetesKereses() {
        int magas = 393;
        int count = 0;
        for (Employee emp : emps) {
            if (emp.salary > magas) {
                count++;
                
            }
        }
        System.out.println("\nNagy Fizetések: " + count);
    }

    public static void eldontes() {
        int ker = 5;
        int n = nums.length;
        int i = 0;
        while (i < n && nums[i] != ker) {
            i++;
        }
        if (i<n) {
            System.out.println("\nvan ilyen: " + ker);
        } else {
            System.out.println("\nnincs ilyen elem");
        }
    }
    public static void vanSzegedi(){
        String city = "Pécs";
        int n = emps.size();
        int i = 0;
        while (i < n && !emps.get(i).city.equals(city)) {
            i++;
        }
        if (i<n) {
            System.out.println("\nvan: " + city);
        } else {
            System.out.println("\nnincs Szegedi");
        }

    }
    public static void kivalasztasTetel() {
        
    }
}
