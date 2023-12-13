/**
 * The Main class demonstrates the usage of the Car class to set and retrieve
 * the maximum speed of two cars.
 */
public class Main {

    /**
     * The main method is the entry point of the program.
     *
     * @param args The command-line arguments (unused in this example).
     */
    public static void main(String[] args) {
        // Creating two Car objects
        Car car1 = new Car();
        Car car2 = new Car();

        // Setting the maximum speed of car1 to 150
        car1.setMaxSpeed(150);
        // Retrieving the maximum speed of car1
        int speed = car1.getMaxSpeed();
        // Printing the maximum speed of car1
        System.out.println("Maximum speed of car ONE is: " + speed);

        // Setting the maximum speed of car2 to 200
        car2.setMaxSpeed(200);
        // Printing the maximum speed of car2 using separate print statements
        System.out.print("Maximum speed of car TWO is: ");
        System.out.println(car2.getMaxSpeed());
    }
}
