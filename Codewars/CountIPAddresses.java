// CodeWars task: solution -> https://www.codewars.com/kata/526989a41034285187000de4/java

public class CountIPAddresses {

    /**
     * Calculates the number of IPv4 addresses between two given IP addresses.
     *
     * @param start the starting IP address as a string in dotted decimal format
     * @param end the ending IP address as a string in dotted decimal format
     * @return the number of IPv4 addresses between the two IP addresses (excluding the last one)
     */
    public static long ipsBetween(String start, String end) {
        // Split the IP addresses into their four octets
        String[] startOctets = start.split("\\.");
        String[] endOctets = end.split("\\.");

        // Initialize a count variable
        long count = 0;

        // Iterate over the four octets
        for (int i = 0; i < 4; i++) {
            // Convert the octet strings to long values
            long startValue = Long.parseLong(startOctets[i]);
            long endValue = Long.parseLong(endOctets[i]);

            // Calculate the difference between the corresponding octets
            long diff = endValue - startValue;

            // Multiply the difference by the appropriate power of 256 based on the position of the octet
            count += diff * (long) Math.pow(256, (3 - i));
        }

        // Return the count of addresses between the two IP addresses
        return count;
    }
}
