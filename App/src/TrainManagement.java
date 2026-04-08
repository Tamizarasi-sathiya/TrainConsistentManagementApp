import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;

public class TrainManagement {
    public static void main(String[] args) {
        LinkedHashSet<String> train = new LinkedHashSet<>();
        HashMap<String, Integer> bogieMap = new HashMap<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");
        train.add("Sleeper");
        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 60);
        bogieMap.put("First Class", 24);

        System.out.println("Train Formation:");
        for (String bogie : train) {
            System.out.print(bogie + " -> ");
            System.out.println("Bogie Capacity Details:");
            for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("END");
        }
    }