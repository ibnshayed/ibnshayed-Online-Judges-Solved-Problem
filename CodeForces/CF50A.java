package CodeForces;

import java.util.Scanner;

public class CF50A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int recBoard = m * n;
        int domino = 2 * 1;
        int result = recBoard / domino;
        System.out.println(result);
    }
}
