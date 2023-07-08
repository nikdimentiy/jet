// CodeWars task: solution -> https://www.codewars.com/kata/6397b0d461067e0030d1315e/train/java
// 🎯 Preparation to coding interview 🍀


public class DTS2 {

    /**
     * Converts a string representing normal time to industrial time.
     *
     * @param time A string representing normal time in the format HH:MM.
     * @return The industrial time equivalent to the input time.
     */
    public static double toIndustrial(String time) {
        String[] ar = time.split(":");
        int hour = Integer.parseInt(ar[0]);
        int minute = Integer.parseInt(ar[1]);
        double min = ((double) minute / 60);
        double result = (double) hour + min;
        return Math.round(result * 100.0) / 100.0;
    }

    /**
     * Converts an integer representing normal time to industrial time.
     *
     * @param time An integer representing normal time in the format HHMM.
     * @return The industrial time equivalent to the input time.
     */
    public static double toIndustrial(int time) {
        double result = ((double) time / 60);
        return Math.round(result * 100.0) / 100.0;
    }

    /**
     * Converts an industrial time to normal time.
     *
     * @param time An industrial time in the format HHMM.
     * @return The normal time equivalent to the input time.
     */
    public static String toNormal(double time) {
        int intPart = (int) time;
        double decimalPart = time - (double) intPart;
        double minute = decimalPart;
        int min = (int) (minute * 60);
        int done = min;
        if (minute < 10) {
            return intPart + ":" + "0" + done;
        }
        return intPart + ":" + done;
    }
}
