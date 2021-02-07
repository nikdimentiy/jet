// Java code: ternary operator in a statement conditions

public class TotalCostTernary {

    public static void main(String[] args) {
        double quantity = 12;    // Number of product units
        double price = 100;      // Price per unit of product
        double discount = 0.75;  // Discount on the total cost - 25%.
        double cost;             // Total cost

        // IF: We bought 10 items or more. TO: provide a 25% discount. OTHERWISE: Do not provide a discount

        cost = quantity >= 10 ? quantity * price * discount : quantity * price;

        System.out.println("The total cost of the product is: " + cost + "$");
    }
}
