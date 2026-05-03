package main;

public class Main {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC20 - Exception Handling in Search");
        System.out.println("=====================================\n");

        String[] bogieIds = {};

        String searchId = "BG101";

        // Exception Handling
        if (bogieIds.length == 0) {
            throw new IllegalStateException(
                    "No bogies available for search"
            );
        }

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie Found: " + searchId);

        } else {
            System.out.println("Bogie Not Found");
        }

        System.out.println("UC20 completed...");
    }
}