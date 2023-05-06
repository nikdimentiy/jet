// CodeWars task: solution -> https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

public class HumanReadableTime {
    /**
     * Converts a given number of seconds into a human-readable time format of HH:MM:SS.
     * @param seconds the number of seconds to convert
     * @return a string representing the input time in the format of HH:MM:SS
     */
    public static String makeReadable(int seconds) {
        // Calculate the number of hours, minutes, and remaining seconds
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        // Format each value as a two-digit string with leading zeros
        String hoursStr = String.format("%02d", hours);
        String minutesStr = String.format("%02d", minutes);
        String secondsStr = String.format("%02d", remainingSeconds);

        // Concatenate the formatted strings with colons to produce the human-readable time string
        return hoursStr + ":" + minutesStr + ":" + secondsStr;
    }
}
