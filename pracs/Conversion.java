public class Conversion {
    public static double convertc2f(double c) {
        double f = c * (9.0 / 5.0) + 32;
        return f;
    }

    public static double convertf2c(double f) {
        double c = (f - 32) * (5.0 / 9.0);
        return c;
    }

    public static void main(String[] args) {
        double f = convertc2f(38);
        double c = convertf2c(100.4);
        System.out.println(f);
        System.err.println(c);

    }
}
