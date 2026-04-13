import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize consist
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // ==========================
        // UC2 STARTS HERE
        // ==========================

        // Add passenger bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("\nAfter adding bogies:");
        System.out.println(trainConsist);

        // Remove one bogie
        trainConsist.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(trainConsist);

        // Check existence
        boolean exists = trainConsist.contains("Sleeper");

        System.out.println("\nDoes Sleeper exist? " + exists);

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}