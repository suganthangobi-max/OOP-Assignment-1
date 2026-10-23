// RISHINDRAN: This class stores passenger details and handles a ride booking.
public class Passenger {
    // 7 private attributes
    private String name;
    private int age;
    private String phone;
    private String pickup;
    private String destination;
    private double walletBalance;
    private boolean booked;

    // Default constructor
    public Passenger() {
        name = "Unknown";
        age = 18;
        phone = "Not set";
        pickup = "Unknown";
        destination = "Unknown";
        walletBalance = 0.0;
        booked = false;
    }

    // Parameterized constructor
    public Passenger(String name, int age, String phone, String pickup,
                     String destination, double walletBalance, boolean booked) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.pickup = pickup;
        this.destination = destination;
        this.walletBalance = walletBalance;
        this.booked = booked;
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getPickup() { return pickup; }
    public String getDestination() { return destination; }
    public double getWalletBalance() { return walletBalance; }
    public boolean getBooked() { return booked; }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { if (age >= 0) this.age = age; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setPickup(String pickup) { this.pickup = pickup; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setWalletBalance(double walletBalance) {
        if (walletBalance >= 0) this.walletBalance = walletBalance;
    }
    public void setBooked(boolean booked) { this.booked = booked; }

    // Method 1: book a ride if there is enough money
    public boolean bookRide(double fare) {
        if (!booked && fare > 0 && walletBalance >= fare) {
            walletBalance = walletBalance - fare;
            booked = true;
            System.out.println(name + " booked a ride for RM" + fare);
            return true;
        } else {
            System.out.println("Cannot book ride. Check booking or wallet balance.");
            return false;
        }
    }

    // Method 2: finish the passenger's booked ride
    public void finishRide() {
        if (booked) {
            booked = false;
            System.out.println(name + " reached " + destination + ".");
        }
    }

    // Method 3: display passenger details
    public void showPassenger() {
        System.out.println("Passenger: " + name + ", Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("From: " + pickup + " To: " + destination);
        System.out.println("Wallet: RM" + walletBalance + ", Ride booked: " + booked);
    }
}
