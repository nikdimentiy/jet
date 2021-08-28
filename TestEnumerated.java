/*
   Enumerated types (enum).
   Constructor and methods.
*/

enum Company {
    // Instances
    WEBCAMP(1000), GOOGLE(100), SKYNET(10); 
    int value;

    // The constructor can only be private
    Company(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class TestEnumerated {
    public static void main(String[] args) {
        Company myComp = Company.WEBCAMP;
        System.out.println("I work in a company " + myComp + " and I earn " + myComp.getValue() + "$ per month.");
  
