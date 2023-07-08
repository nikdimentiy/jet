// CodeWars task: solution -> https://www.codewars.com/kata/6397b0d461067e0030d1315e/train/java
// 🎯 Preparation to coding interview 🍀

import java.text.DecimalFormat;

/**
 * This class provides functions for converting between standard time and decimal time.
 */
public class DTC {

  /**
   * The decimal format used to format minutes.
   */
  public static final DecimalFormat MINUTES = new DecimalFormat("00");

  /**
   * Converts a string representing standard time to decimal time.
   *
   * @param time The string representing standard time in the format "h:mm".
   * @return The decimal time.
   */
  public static double toIndustrial(String time) {
    // Split the string into hours and minutes.
    String[] arr = time.split(":");

    // Convert the hours and minutes to decimal time.
    double hours = Double.parseDouble(arr[0]);
    double minutes = Double.parseDouble(arr[1]) / 60.0;

    // Return the decimal time.
    return hours + minutes;
  }

  /**
   * Converts an integer representing standard time to decimal time.
   *
   * @param time The integer representing standard time in minutes.
   * @return The decimal time.
   */
  public static double toIndustrial(int time) {
    // Convert the time to decimal time.
    double decimalTime = time / 60.0;

    // Round the decimal time to two decimal places.
    decimalTime = Math.round(decimalTime * 100) / 100.0;

    // Return the decimal time.
    return decimalTime;
  }

  /**
   * Converts a decimal time to a string representing standard time.
   *
   * @param time The decimal time.
   * @return The string representing standard time in the format "h:mm".
   */
  public static String toNormal(double time) {
    // Get the hours and minutes from the decimal time.
    int hours = (int) time;
    double minutes = time - hours;

    // Format the minutes.
    String minutesStr = MINUTES.format(Math.round(minutes * 60));

    // Return the string representing standard time.
    return String.format("%d:%s", hours, minutesStr);
  }
}

