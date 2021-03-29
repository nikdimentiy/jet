import javax.swing.JOptionPane;

public class ModulWindows {

    public static void main(String[] args) {
        // declare integer variables
        int yearNow, yearBorn, userAge;
        // declare string variable
        String userData;

        // ask a user about today date
        userData = JOptionPane.showInputDialog("What is the current year?");

        // convert a string to a number explicitly
        yearNow = Integer.parseInt(userData);

        // request the year of birth of the user
        userData = JOptionPane.showInputDialog("What year were you born?");

        // convert a string to a number explicitly
        yearBorn = Integer.parseInt(userData);

        // calculate an age of user
        userAge = yearNow - yearBorn;

        // output a message window with the result
        JOptionPane.showMessageDialog(null, "Your age is around: " + userAge);
    }

}

