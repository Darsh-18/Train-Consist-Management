import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ==========================
        // UC1: Initialize Train
        // ==========================
        List<String> trainConsist = new ArrayList<>();

        System.out.println("\nTrain consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // ==========================
        // UC2: ArrayList Operations
        // ==========================
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("\nAfter adding bogies:");
        System.out.println(trainConsist);

        trainConsist.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(trainConsist);

        System.out.println("\nDoes Sleeper exist? " + trainConsist.contains("Sleeper"));

        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        // ==========================
        // UC3: HashSet (Unique IDs)
        // ==========================
        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG103");

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // ==========================
        // UC4: LinkedList (Ordered Train)
        // ==========================
        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Order:");
        System.out.println(train);

        train.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car:");
        System.out.println(train);

        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(train);

        // ==========================
        // UC5: LinkedHashSet (Ordered + Unique)
        // ==========================
        LinkedHashSet<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        formation.add("Sleeper"); // duplicate

        System.out.println("\nTrain Formation (LinkedHashSet):");
        System.out.println(formation);

        // ==========================
        // UC6: HashMap (Bogie Capacity Mapping)
        // ==========================
        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);
        bogieCapacity.put("Cargo", 100);

        System.out.println("\nBogie Capacity Mapping:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}