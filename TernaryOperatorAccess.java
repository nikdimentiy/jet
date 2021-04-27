// Ternary operator in JAVA program
import java.util.Scanner;

public class TernaryOperatorAccess{
    public static void main(String[] args){
        String str = "Hello ";

        System.out.println("Enter your login: ");
        Scanner network = new Scanner(System.in);

        String login = network.next();

        str += login.equals("Admin") ? "Administrator" : "User";

        System.out.println(str);
    }
}
