import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void task01(){
          ArrayList<String> nevek = new ArrayList<>();
        List<String> nevek2 = new ArrayList<>();

        String[] nevTomb = new String[3];
        nevTomb[0] = "Aladár";
        nevTomb[1] = "Elemér";
        nevTomb[2] = "Tibor";

        List<String> nevek3 = new ArrayList<>(Arrays.asList(nevTomb));
        List<String> nevek4 = List.of("Barna", "Kati", "Lajos");

        for(int i=0; i<nevek4.size(); i++){
            System.out.println(nevek4.get(i));
        }
        
        for(String nev:nevek4){
            System.out.println(nev);
        }
        System.out.println("-----forEach-----");
        nevek4.forEach(e -> System.out.println(e));

        nevek4.forEach(e -> {System.out.println(e);});
        System.out.println("-----forEach-----");
        nevek4.forEach(System.out::println);

        System.out.println("-----forEach-----");
        List<Integer> numbers = List.of(3, 8, 9);
        numbers.forEach(System.out::println);
    }
}
