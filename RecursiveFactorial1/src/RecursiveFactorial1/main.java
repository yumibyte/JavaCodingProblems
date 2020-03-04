package RecursiveFactorial1;

public class main {

    public static double total = 1;

    public static double calculate(double a) {
        System.out.println("running! " + a);
        double numBelow = a - 1;
        //at last number
        if (numBelow == 0 || a == 0) {
            System.out.println(total);
            return total; // print final answer :)
        }

        else {
            total = total * (a * numBelow);
            return calculate(numBelow - 1);
        }
    }
}

class calculateAnswer {
    public static void main(String[] args) {
        main.calculate(4);
    }
}



