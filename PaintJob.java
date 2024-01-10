/**
 * The PaintJob class provides methods to calculate the number of paint buckets
 * needed for a wall painting job.
 */
public class PaintJob {

    /**
     * Calculates the number of buckets Bob needs to buy based on the wall's width,
     * height, area covered per bucket, and extra buckets at home.
     *
     * @param width          The width of the wall.
     * @param height         The height of the wall.
     * @param areaPerBucket  The area that can be covered with one bucket of paint.
     * @param extraBuckets   The number of extra buckets Bob has at home.
     * @return               The number of buckets Bob needs to buy.
     *                       Returns -1 if any parameter is invalid.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double totalArea = width * height;
        int bucketsNeeded = (int) Math.ceil(totalArea / areaPerBucket);
        return Math.max(0, bucketsNeeded - extraBuckets);
    }

    /**
     * Overloaded method that calculates the number of buckets Bob needs to buy
     * based on the wall's width, height, and area covered per bucket.
     *
     * @param width          The width of the wall.
     * @param height         The height of the wall.
     * @param areaPerBucket  The area that can be covered with one bucket of paint.
     * @return               The number of buckets Bob needs to buy.
     *                       Returns -1 if any parameter is invalid.
     */
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double totalArea = width * height;
        return (int) Math.ceil(totalArea / areaPerBucket);
    }

    /**
     * Overloaded method that calculates the number of buckets Bob needs to buy
     * based on the wall area and area covered per bucket.
     *
     * @param area           The area of the wall.
     * @param areaPerBucket  The area that can be covered with one bucket of paint.
     * @return               The number of buckets Bob needs to buy.
     *                       Returns -1 if any parameter is invalid.
     */
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }

    // Test the methods
    public static void main(String[] args) {
        // Test cases
		System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // Should return -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));  // Should return 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // Should return 3

        System.out.println(getBucketCount(-3.4, 2.1, 1.5));     // Should return -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5));      // Should return 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35));     // Should return 14

        System.out.println(getBucketCount(3.4, 1.5));           // Should return 3
        System.out.println(getBucketCount(6.26, 2.2));          // Should return 3
        System.out.println(getBucketCount(3.26, 0.75));         // Should return 5
    }
}
