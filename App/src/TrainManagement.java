import java.util.*;

public class TrainManagement {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101");
        bogieIds.add("BG103");
        bogieIds.add("BG102");
        List<String> consist = new ArrayList<>();

        System.out.println("Unique Bogie IDs: " + bogieIds);
        System.out.println("Train consist initialized");
        System.out.println("Initial bogie count: " + consist.size());
    }
}