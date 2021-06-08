public class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " in power " + x.e + " is " + x.get_pwr());
        System.out.println(y.b + " in power " + y.e + " is " + y.get_pwr());
        System.out.println(z.b + " in power " + z.e + " is " + z.get_pwr());
    }
}