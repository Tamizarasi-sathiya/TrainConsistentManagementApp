import java.util.*;
import java.util.LinkedHashSet;

public class TrainManagement {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        LinkedHashSet<String> train = new LinkedHashSet<>();

        List<String> consist = new ArrayList<>();
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");
        train.add("Sleeper");

        System.out.println("Train consist initialized");
        System.out.println("Initial bogie count: " + consist.size());
        System.out.println("Train Formation:");
        for (String bogie : train) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");
    }
}