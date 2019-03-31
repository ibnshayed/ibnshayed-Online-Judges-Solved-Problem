package CodeForces;

import java.util.Scanner;

public class CF1A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double m = in.nextDouble();
        double a = in.nextDouble();
        long result;
        result = (long) (Math.ceil(n/a) * Math.ceil(m/a));
        System.out.println(result);
    }
}
