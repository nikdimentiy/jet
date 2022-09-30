import org.testng.annotations.Test;

public class MainTest {
    @Test
    void testGetSum() {
        if (Main.getSum(10, 10) != 20) {
//			return false;
        }
        if (Main.getSum(0, 0) != 0) {
//			return false;
        }

        if (Main.getSum(-10, -10) != -20) {
//			return false;
        }

        if (Main.getSum(-10, 10) != 0) {
//			return false;
        }

//		return true;

    }

}
