public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setMaxSpeed(150);
        int speed = car1.getMaxSpeed();
        System.out.println("Maximus speed of car ONE is: " + speed);

        car2.setMaxSpeed(200);
        System.out.print("Maximus speed of car TWO is: ");
        System.out.println(car2.getMaxSpeed());
    }
}
