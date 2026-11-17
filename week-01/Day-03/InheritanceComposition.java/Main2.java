// Component 1: Engine (HAS-A relationship with Car)
class Engine {
    private String type;
    private int horsepower;
    private boolean isRunning;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
        this.isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Engine (" + type + ", " + horsepower + " HP) started with a roar!");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already off.");
        }
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void displaySpecs() {
        System.out.println("   - Type: " + type + ", Horsepower: " + horsepower + " HP, State: " + (isRunning ? "Running" : "Off"));
    }
}

// Component 2: Transmission (HAS-A relationship with Car)
class Transmission {
    private String type; // e.g., "Automatic", "Manual", "Dual-Clutch"
    private int forwardGears;
    private int currentGear;

    public Transmission(String type, int forwardGears) {
        this.type = type;
        this.forwardGears = forwardGears;
        this.currentGear = 0; // 0 = Neutral / Park
    }

    public void shiftGear(int gear) {
        if (gear < 0 || gear > forwardGears) {
            System.out.println("Invalid gear selection: " + gear);
            return;
        }
        this.currentGear = gear;
        if (currentGear == 0) {
            System.out.println("Transmission shifted to Neutral / Park.");
        } else {
            System.out.println("Transmission shifted to Gear " + currentGear + ".");
        }
    }

    public String getType() {
        return type;
    }

    public int getForwardGears() {
        return forwardGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void displaySpecs() {
        System.out.println("   - Type: " + type + ", Forward Gears: " + forwardGears + ", Current Gear: " + (currentGear == 0 ? "Neutral/Park" : currentGear));
    }
}

// Composed Class: Car
// Car HAS-A Engine and HAS-A Transmission (Composition, NOT Inheritance)
class Car {
    private String model;
    private Engine engine;               // Composition
    private Transmission transmission;   // Composition

    // Dependency Injection via constructor
    public Car(String model, Engine engine, Transmission transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    public void startCar() {
        System.out.println("\nStarting " + model + "...");
        engine.start();
        transmission.shiftGear(1); // Shift to 1st gear to get ready
    }

    public void drive(int gear) {
        if (!engine.isRunning()) {
            System.out.println("Cannot drive " + model + "! The engine is turned off.");
            return;
        }
        System.out.println("Driving " + model + "...");
        transmission.shiftGear(gear);
    }

    public void stopCar() {
        System.out.println("\nStopping " + model + "...");
        transmission.shiftGear(0); // Shift back to Park/Neutral
        engine.stop();
    }

    public void displayDetails() {
        System.out.println("==========================================");
        System.out.println("Car Model: " + model);
        System.out.println("Engine Details:");
        engine.displaySpecs();
        System.out.println("Transmission Details:");
        transmission.displaySpecs();
        System.out.println("==========================================");
    }

    // Getters allowing access to components
    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}

// Driver Class
public class Main2 {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("        DAY 03 - TASK 2: COMPOSITION DEMO         ");
        System.out.println("==================================================\n");

        // 1. Create individual components (Engine and Transmission)
        Engine v8Engine = new Engine("4.0L Twin-Turbo V8", 500);
        Transmission autoTransmission = new Transmission("8-Speed Dual-Clutch Automatic", 8);

        // 2. Compose Car using Engine and Transmission (HAS-A relationship)
        Car sportsCar = new Car("Porsche 911", v8Engine, autoTransmission);

        // 3. Display Car Specs (Car delegates to Engine and Transmission)
        sportsCar.displayDetails();

        // 4. Operate the Car
        sportsCar.startCar();
        sportsCar.drive(2);
        sportsCar.drive(4);
        sportsCar.stopCar();

        // 5. Demonstrate flexibility of composition:
        // Creating another Car with different components
        System.out.println("\n--- Creating a second car with an Electric Powertrain ---");
        Engine electricMotor = new Engine("Permanent Magnet Synchronous AC Motor", 450);
        Transmission singleSpeedDirectDrive = new Transmission("Single-Speed Direct Drive", 1);

        Car evCar = new Car("Tesla Model 3 Performance", electricMotor, singleSpeedDirectDrive);
        evCar.displayDetails();
        evCar.startCar();
        evCar.drive(1);
        evCar.stopCar();
    }
}
