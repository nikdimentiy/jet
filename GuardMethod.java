// Using the guard of the operator (word) to protect the nominal option

public class GuardMethod {

    static String function(String name) {
        // Performing a check. When errors are detected, we shut down the work

        if (name == "fool") {  // Guard operator
            return "You used an invalid word";
        }

        // Nominal version code

        String sentence = "Hello " + name + "!";

        return sentence;
    }

    public static void main(String[] args) {
        String sentence = function("fool");

        System.out.println(sentence);
    }
}

