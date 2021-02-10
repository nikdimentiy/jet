// Transformations of logical variables according to De Morgan's theorems

public class DeMorganTheoremes {

    // To apply the De Morgan theorems to a logical operator AND OR and a pair of operands,
    // you need to invert both operands, replace (AND with OR) or (OR with AND),
    // and invert the entire expression completely

    //  Original expression                           Equivalent expression
    //     !A & !B                       =                  !(A | B)
    //     !A & B                        =                  !(A | !B)
    //     A & !B                        =                  !(!A | B)
    //     A & B                         =                  !(!A | !B)
    //     !A | !B                       =                  !(A & B)
    //     !A | B                        =                  !(A & !B)
    //     A | !B                        =                  !(!A & B)
    //     A | B                         =                  !(!A & !B)

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        // Condition before applying De Morgan's theorem
        if (!a || !b)
            System.out.println("!A || !B = " + (!a || !b));
        else
            System.out.println("!A || !B = " + (!a || !b));

        // Condition after applying De Morgan's theorem
        if (!(a && b))
            System.out.println("!(A && B) = " + !(a && b));
        else
            System.out.println("!(A && B) = " + !(a && b));
    }
}
 
