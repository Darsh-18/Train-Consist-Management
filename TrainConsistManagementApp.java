import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // BOGIE ID ARRAY (UNSORTED)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // INPUT
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // ==========================
        // UC18: LINEAR SEARCH
        // ==========================
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break; // EARLY STOP
            }
        }

        // OUTPUT
        if (found) {
            System.out.println("Bogie FOUND in the train.");
        } else {
            System.out.println("Bogie NOT FOUND.");
        }

        sc.close();
    }
}