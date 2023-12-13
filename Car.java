/**
 * The Car class represents a basic model of a car, including attributes such as
 * model, maximum speed, manufacturing year, and current speed.
 */
public class Car {
    private String model;    // The model of the car
    private int maxSpeed;    // The maximum speed the car can reach
    private int year;        // The manufacturing year of the car
    private int speed;       // The current speed of the car

    /**
     * Default constructor for creating a Car object with default values.
     */
    public Car() {
    }

    /**
     * Parameterized constructor for creating a Car object with specified values.
     *
     * @param model    The model of the car.
     * @param maxSpeed The maximum speed the car can reach.
     * @param year     The manufacturing year of the car.
     * @param speed    The initial speed of the car.
     */
    public Car(String model, int maxSpeed, int year, int speed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.speed = speed;
    }

    /**
     * Gets the maximum speed of the car.
     *
     * @return The maximum speed of the car.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets the maximum speed of the car.
     *
     * @param maxSpeed The new maximum speed to set for the car.
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
