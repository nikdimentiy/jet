// CodeWars task: solution -> https://www.codewars.com/kata/52685f7382004e774f0001f7/java

public class HumanReadableTime2 {
    /**
     * Converts a given number of seconds into a human-readable time format of HH:MM:SS.
     * @param seconds the number of seconds to convert
     * @return a string representing the input time in the format of HH:MM:SS
     */
    public static String makeReadable(int seconds) {
        /*
         * The input time is first divided into hours, minutes, and seconds,
         * using integer division and modulus arithmetic to calculate the
         * appropriate values for each.
         */
        int hours = seconds / 3600;
        int minutes = (seconds / 60) % 60;
        int remainingSeconds = seconds % 60;

        /*
         * The formatted time string is created using the formatted string syntax,
         * with placeholders for the hours, minutes, and seconds values, each formatted
         * with leading zeros as necessary to make them two digits wide.
         */
        String timeString = String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
        return timeString;
    }
}
