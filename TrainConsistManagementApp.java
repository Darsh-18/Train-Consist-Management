import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // CHANGE THIS ARRAY TO TEST
        String[] bogieIds = {};   // try {} OR {"BG101","BG205","BG309"}

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // ==========================
        // UC20: FAIL-FAST CHECK
        // ==========================
        if (bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in train.");
        }

        // ==========================
        // BINARY SEARCH (UC19)
        // ==========================
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;
            int cmp = bogieIds[mid].compareTo(key);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // OUTPUT
        if (found) {
            System.out.println("Bogie FOUND.");
        } else {
            System.out.println("Bogie NOT FOUND.");
        }

        sc.close();
    }
}