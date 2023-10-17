public class Truck {
    int weight;  // Declare an integer variable to store the weight of the truck.

    public static void main(String[] args) {
        // Create two instances of the Truck class.
        Truck first = new Truck();
        first.weight = 10000;  // Set the weight of the first truck to 10,000 units.
        Truck second = new Truck();
        second.weight = 20000;  // Set the weight of the second truck to 20,000 units.

        // Create an instance of the BridgeOfficer class and specify a maximum weight (normalWeight).
        BridgeOfficer officer = new BridgeOfficer(15000);

        // Check if the first truck can go ahead and display the result.
        System.out.println("Truck #1. It's possible to go ahead?");
        boolean canFirstTruckGo = officer.checkTruck(first);
        System.out.println(canFirstTruckGo);

        System.out.println();

        // Check if the second truck can go ahead and display the result.
        System.out.println("Truck #2. It's possible to go ahead?");
        boolean canSecondTruckGo = officer.checkTruck(second);
        System.out.println(canSecondTruckGo);
    }
}

class BridgeOfficer {
    int maxWeight;  // Declare an integer variable to store the maximum weight allowed.

    // Constructor that initializes the maximum weight with a provided normal weight.
    public BridgeOfficer(int normalWeight) {
        this.maxWeight = normalWeight;
    }

    // Method to check if a truck's weight does not exceed the maximum allowed weight.
    public boolean checkTruck(Truck truck) {
        return truck.weight <= maxWeight;  // Return true if the truck's weight is within the limit.
    }
}
