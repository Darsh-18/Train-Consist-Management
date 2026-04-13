import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // BOGIE TYPE NAMES
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // BEFORE SORT
        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // ==========================
        // UC17: Arrays.sort()
        // ==========================
        Arrays.sort(bogieNames);

        // AFTER SORT
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}