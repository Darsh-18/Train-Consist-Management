import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UNSORTED INPUT (REAL CASE)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // STEP 1: SORT ARRAY (MANDATORY)
        Arrays.sort(bogieIds);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // INPUT
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // ==========================
        // UC19: BINARY SEARCH
        // ==========================
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1; // SEARCH RIGHT
            } else {
                high = mid - 1; // SEARCH LEFT
            }
        }

        // OUTPUT
        if (found) {
            System.out.println("Bogie FOUND using Binary Search.");
        } else {
            System.out.println("Bogie NOT FOUND.");
        }

        sc.close();
    }
}