package RecursiveFactorial;

public class Main {

    private static double calculate(double a) {
        double total = 0;

        if (a != 1) {
            total = total + (a * a - 1);
            return calculate(a - 1);
        } else {
            System.out.println(total);
            return total;
        }
        calculate(double 3.0E00);
    }
}
