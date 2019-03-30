package CodeForces;

import java.util.Scanner;

public class CF546A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();

        int totalCost = k * ((w * (w+1))/2);
        if(n > totalCost)
            System.out.println(0);
        else System.out.println(totalCost - n);
    }
}
