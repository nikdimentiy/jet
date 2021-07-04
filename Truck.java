// two classes in one file...tiny code..checking a truck to weight (normalWeight -> maxWeight)

public class Truck {
    int weight;

    public static void main(String[] args) {
        Truck first = new Truck();
        first.weight = 10000;
        Truck second = new Truck();
        second.weight = 20000;

        BridgeOfficer officer = new BridgeOfficer(15000);
        System.out.println("Truck #1. It's possible to go ahead?");
        boolean canFirstTruckGo = officer.checkTruck(first);
        System.out.println(canFirstTruckGo);

        System.out.println();

        System.out.println("Truck #2. It's possible to go ahead?");
        boolean canSecondTruckGo = officer.checkTruck(second);
        System.out.println(canSecondTruckGo);
    }

}

class BridgeOfficer {
    int maxWeight;

    public BridgeOfficer(int normalWeight) {
        this.maxWeight = normalWeight;
    }

    public boolean checkTruck(Truck truck) {
        return truck.weight <= maxWeight;
    }
}

