import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // PASSENGER BOGIE CAPACITIES
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(capacities));

        // ==========================
        // UC16: BUBBLE SORT
        // ==========================
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // SWAP
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // OUTPUT
        System.out.println("\nAfter Bubble Sort:");
        System.out.println(Arrays.toString(capacities));
    }
}