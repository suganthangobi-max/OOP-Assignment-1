// Main class: shows how Car, Driver and Passenger work together.
public class Main {
    public static void main(String[] args) {

        // Create all three objects using default constructors
        Car car1 = new Car();
        Driver driver1 = new Driver();
        Passenger passenger1 = new Passenger();

        // Use setters to update the default objects
        car1.setBrand("Perodua");
        car1.setModel("Myvi");
        driver1.setName("Sara");
        driver1.setLicenseNumber("D100");
        passenger1.setName("Meena");
        passenger1.setPickup("College");
        passenger1.setDestination("Library");

        System.out.println("=== DEFAULT OBJECTS ===");
        car1.showCar();
        driver1.showDriver();
        passenger1.showPassenger();

        // Create all three objects using parameterized constructors
        Car car2 = new Car("Proton", "Saga", "Silver", 2026, 50, 0, false);
        Driver driver2 = new Driver("Ali", 22, "D200", "0120000000", "Shah Alam", 2, 0);
        Passenger passenger2 = new Passenger("Aina", 20, "0130000000",
                                             "MSU", "Shopping Mall", 30.0, false);

        // Update values with setters and read them with getters
        car2.setColor("Black");
        passenger2.setWalletBalance(40.0);

        System.out.println("\n=== RIDE BOOKING DEMO ===");
        System.out.println(passenger2.getName() + " wants a ride in "
                           + driver2.getName() + "'s " + car2.getColor()
                           + " " + car2.getModel());

        // If statement: check driver, car fuel, and passenger booking
        if (driver2.canDrive() && car2.getFuelLevel() >= 30
                && passenger2.bookRide(12.0)) {
            car2.startEngine();

            // For loop: show the car driving three times
            for (int i = 1; i <= 3; i++) {
                System.out.println("Drive " + i + ":");
                car2.drive();
            }

            car2.stopEngine();
            driver2.completeTrip();
            passenger2.finishRide();
        } else {
            System.out.println("Ride cannot continue.");
        }

        // Display the updated values of all three objects
        System.out.println("\n=== FINAL DETAILS ===");
        car2.showCar();
        driver2.showDriver();
        passenger2.showPassenger();
    }
}
