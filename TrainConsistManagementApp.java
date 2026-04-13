import java.util.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ==========================
        // UC1
        // ==========================
        List<String> trainConsist = new ArrayList<>();
        System.out.println("\nTrain consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // ==========================
        // UC2
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

        // ==========================
        // UC3
        // ==========================
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101");
        bogieIds.add("BG103");

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // ==========================
        // UC4
        // ==========================
        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        train.add(2, "Pantry Car");

        train.removeFirst();
        train.removeLast();

        System.out.println("\nOrdered Train:");
        System.out.println(train);

        // ==========================
        // UC5
        // ==========================
        LinkedHashSet<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println("\nTrain Formation (LinkedHashSet):");
        System.out.println(formation);

        // ==========================
        // UC6
        // ==========================
        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        System.out.println("\nBogie Capacity Mapping:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ==========================
        // UC7 STARTS HERE
        // ==========================
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Sort by capacity
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nSorted Bogies by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}