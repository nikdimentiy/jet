package practice;

// Import the necessary classes from the java.time package

import java.time.LocalDate;
import java.time.Period;

// Declare a public class named Test
public class ChangeOfDuty {

    // Declare a static method named change_of_duty that takes three LocalDate objects as arguments
    static void change_of_duty(LocalDate start, LocalDate end, Period period) {
        // Declare a LocalDate variable named date with an initial value of start
        LocalDate date = start;
        // Use a while loop to iterate through the dates between the start and end dates
        while (date.isBefore(end)) {
            // Print out a message indicating that it's time to change duty for the current date
            System.out.println("Time to change the duty: " + date);
            // Increment the date by the specified period
            date = date.plus(period);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.now();
        LocalDate end = LocalDate.of(2023, 12, 31);
        Period period = Period.ofDays(13);
        change_of_duty(start, end, period);
    }
}

