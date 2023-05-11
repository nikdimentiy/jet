// CodeWars task: solution -> https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java

public class TenMinWalk {
    /**
     * Determines whether a given walk will take exactly 10 minutes and return to the starting point.
     * 
     * @param walk A char array representing the walk. Each character in the array represents a single block and
     *             can be one of 'n' (north), 's' (south), 'e' (east), or 'w' (west).
     * @return true if the walk will take exactly 10 minutes and return to the starting point, false otherwise.
     */
    public static boolean isValid(char[] walk) {
        // Check if the walk has exactly 10 steps
        if (walk.length != 10) {
            return false;
        }
        
        // Initialize counters for the number of steps taken in the north-south and east-west directions
        int northSouth = 0;
        int eastWest = 0;
        
        // Loop over each direction in the walk and increment or decrement the appropriate counter
        for (char direction : walk) {
            switch (direction) {
                case 'n':
                    northSouth++;
                    break;
                case 's':
                    northSouth--;
                    break;
                case 'e':
                    eastWest++;
                    break;
                case 'w':
                    eastWest--;
                    break;
                default:
                    return false; // invalid direction
            }
        }
        
        // Check if the number of steps taken in each direction is balanced
        return northSouth == 0 && eastWest == 0;
    }
}
