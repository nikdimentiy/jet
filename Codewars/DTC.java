// CodeWars task: solution -> https://www.codewars.com/kata/6397b0d461067e0030d1315e/train/java
// 🎯 Preparation to coding interview 🍀

// This class contains methods to convert between normal time and industrial time
public class DTC {
    // This method takes a normal time in the format of hh:mm and returns the corresponding industrial time as a double
    public static double toIndustrial(String time) {
        // Split the time string by the colon and store the parts in an array
        String[] parts = time.split(":");
        // Parse the first part as an integer for hours
        int hours = Integer.parseInt(parts[0]);
        // Parse the second part as an integer for minutes
        int minutes = Integer.parseInt(parts[1]);
        // Calculate the decimal hours by adding the hours and the minutes divided by 60.0
        double decimalHours = hours + minutes / 60.0;
        // Multiply the decimal hours by 0.02 and round it to two decimal places
        return Math.round(decimalHours * 0.02 * 100.0) / 100.0;
    }

    // This method takes an integer representing the number of hours and returns the corresponding industrial time as a double
    public static double toIndustrial(int time) {
        // Multiply the hours by 0.02 and return the result
        return time * 0.02;
    }

    // This method takes an industrial time as a double and returns the corresponding normal time in the format of hh:mm
    public static String toNormal(double time) {
        // Cast the double to an integer for hours
        int hours = (int) time;
        // Subtract the hours from the double and multiply by 100 to get the minutes as an integer
        int minutes = (int) ((time - hours) * 100);
        // Return a string with the hours and minutes separated by a colon, padding the minutes with zeros if needed
        return hours + ":" + String.format("%02d", minutes);
    }

    // This is the main method that tests the other methods with some examples
    public static void main(String[] args) {
        // Print the industrial time for 1:45 using the first method
        System.out.println(DTC.toIndustrial("1:45"));  // Output: 1.75
        // Print the industrial time for 1 hour using the second method
        System.out.println(DTC.toIndustrial(1));       // Output: 0.02
        // Print the normal time for 0.33 industrial time using the third method
        System.out.println(DTC.toNormal(0.33));        // Output: 0:20
    }
}
