import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainManagement {
    public static void main(String[] args) {
        HashMap<String, Integer> bogieMap = new HashMap<>();
        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));

        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 60);
        bogieMap.put("First Class", 24);
        list.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            System.out.println("Bogies Sorted by Capacity:");
            for (Bogie b : list) {
                System.out.println(b.name + " : " + b.capacity);
            }
        }
    }