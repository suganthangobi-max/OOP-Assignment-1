// Vegneswaran: This class stores driver details and keeps track of trips.
public class Driver {
    // 7 private attributes
    private String name;
    private int age;
    private String licenseNumber;
    private String phone;
    private String city;
    private int yearsExperience;
    private int tripsCompleted;

    // Default constructor
    public Driver() {
        name = "Unknown";
        age = 18;
        licenseNumber = "None";
        phone = "Not set";
        city = "Unknown";
        yearsExperience = 0;
        tripsCompleted = 0;
    }

    // Parameterized constructor
    public Driver(String name, int age, String licenseNumber, String phone,
                  String city, int yearsExperience, int tripsCompleted) {
        this.name = name;
        this.age = age;
        this.licenseNumber = licenseNumber;
        this.phone = phone;
        this.city = city;
        this.yearsExperience = yearsExperience;
        this.tripsCompleted = tripsCompleted;
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getLicenseNumber() { return licenseNumber; }
    public String getPhone() { return phone; }
    public String getCity() { return city; }
    public int getYearsExperience() { return yearsExperience; }
    public int getTripsCompleted() { return tripsCompleted; }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { if (age >= 0) this.age = age; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setCity(String city) { this.city = city; }
    public void setYearsExperience(int yearsExperience) {
        if (yearsExperience >= 0) this.yearsExperience = yearsExperience;
    }
    public void setTripsCompleted(int tripsCompleted) {
        if (tripsCompleted >= 0) this.tripsCompleted = tripsCompleted;
    }

    // Method 1: check the driver's age and licence
    public boolean canDrive() {
        return age >= 18 && !licenseNumber.equals("None");
    }

    // Method 2: add one completed trip
    public void completeTrip() {
        tripsCompleted++;
        System.out.println(name + " completed a trip.");
    }

    // Method 3: display driver details
    public void showDriver() {
        System.out.println("Driver: " + name + ", Age: " + age);
        System.out.println("License: " + licenseNumber + ", Phone: " + phone);
        System.out.println("City: " + city + ", Experience: " + yearsExperience + " years");
        System.out.println("Trips completed: " + tripsCompleted);
    }
}
