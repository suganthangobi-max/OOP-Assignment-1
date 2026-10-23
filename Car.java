// Suganthan: This class stores car information and performs car actions.
public class Car {
    // 7 private attributes (encapsulation)
    private String brand;
    private String model;
    private String color;
    private int year;
    private int fuelLevel;
    private int speed;
    private boolean engineOn;

    // Default constructor
    public Car() {
        brand = "Unknown";
        model = "Unknown";
        color = "White";
        year = 2020;
        fuelLevel = 30;
        speed = 0;
        engineOn = false;
    }

    // Parameterized constructor
    public Car(String brand, String model, String color, int year,
               int fuelLevel, int speed, boolean engineOn) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.fuelLevel = fuelLevel;
        this.speed = speed;
        this.engineOn = engineOn;
    }

    // Getter methods: return the attribute values
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public int getYear() { return year; }
    public int getFuelLevel() { return fuelLevel; }
    public int getSpeed() { return speed; }
    public boolean getEngineOn() { return engineOn; }

    // Setter methods: change the private attributes
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setColor(String color) { this.color = color; }
    public void setYear(int year) { if (year > 0) this.year = year; }
    public void setFuelLevel(int fuelLevel) {
        if (fuelLevel >= 0 && fuelLevel <= 100) this.fuelLevel = fuelLevel;
    }
    public void setSpeed(int speed) { if (speed >= 0) this.speed = speed; }
    public void setEngineOn(boolean engineOn) { this.engineOn = engineOn; }

    // Method 1: start the engine when the car has fuel
    public void startEngine() {
        if (fuelLevel > 0) {
            engineOn = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Cannot start: No fuel.");
        }
    }

    // Method 2: move the car and use 10 fuel units
    public void drive() {
        if (engineOn && fuelLevel >= 10) {
            speed = speed + 20;
            fuelLevel = fuelLevel - 10;
            System.out.println("Driving at " + speed + " km/h. Fuel left: " + fuelLevel);
        } else {
            System.out.println("Cannot drive. Check engine and fuel.");
        }
    }

    // Method 3: stop the car
    public void stopEngine() {
        engineOn = false;
        speed = 0;
        System.out.println("Engine stopped.");
    }

    // Method 4: display car details
    public void showCar() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Color: " + color + ", Year: " + year);
        System.out.println("Fuel: " + fuelLevel + ", Speed: " + speed);
        System.out.println("Engine on: " + engineOn);
    }
}
