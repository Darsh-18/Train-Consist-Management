import java.util.*;

// CUSTOM RUNTIME EXCEPTION (UC15)
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// GOODS BOGIE CLASS
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            // VALIDATION
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed for " + type + " bogie.\n");
        }
    }

    @Override
    public String toString() {
        return type + " carrying " + (cargo == null ? "Nothing" : cargo);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // CREATE BOGIES
        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        GoodsBogie g2 = new GoodsBogie("Rectangular");

        // SAFE ASSIGNMENT
        g1.assignCargo("Petroleum");

        // UNSAFE ASSIGNMENT
        g2.assignCargo("Petroleum");

        // SAFE AGAIN
        g2.assignCargo("Coal");

        // FINAL STATE
        System.out.println("Final Bogie States:");
        System.out.println(g1);
        System.out.println(g2);

        System.out.println("\nProgram continues safely...");
    }
}