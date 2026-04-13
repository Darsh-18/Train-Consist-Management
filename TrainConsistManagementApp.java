import java.util.*;
import java.util.stream.Collectors;
import java.util.regex.*;

// CUSTOM EXCEPTION (UC14)
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// UPDATED Bogie class with validation
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

// UC12 class
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " carrying " + cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ==========================
        // UC14 STARTS HERE
        // ==========================

        List<Bogie> bogies = new ArrayList<>();

        try {
            // VALID bogies
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 60));

            // INVALID bogie (will throw exception)
            bogies.add(new Bogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // SHOW VALID BOGIES
        System.out.println("\nValid Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ==========================
        // OPTIONAL CONTINUATION
        // ==========================

        // Safe program continues
        System.out.println("\nProgram continues safely...");
    }
}