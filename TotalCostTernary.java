/**
 * TotalCostTernary class calculates the total cost of a product based on quantity, price, and discount.
 */
public class TotalCostTernary {

    /**
     * The main method calculates the total cost using a ternary operator based on quantity and applies a discount if applicable.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Number of product units
        double quantity = 12;
        // Price per unit of product
        double price = 100;
        // Discount on the total cost - 25%
        double discount = 0.75;
        // Total cost
        double cost;

        // Ternary operator: If quantity is 10 or more, apply a 25% discount, otherwise, no discount.
        cost = quantity >= 10 ? quantity * price * discount : quantity * price;

        // Display the total cost of the product
        System.out.println("The total cost of the product is: $" + cost);
    }
}
