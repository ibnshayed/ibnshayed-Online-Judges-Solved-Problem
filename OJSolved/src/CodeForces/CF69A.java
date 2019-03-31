package CodeForces;

import java.util.Scanner;

public class CF69A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        int[] x = new int[testCase];
        int[] y = new int[testCase];
        int[] z = new int[testCase];

        for (int i = 0; i< testCase; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            x[i] = a;
            y[i] = b;
            z[i] = c;
        }

        int sumx = 0;
        int sumy = 0;
        int sumz = 0;

        for(int i = 0; i<testCase; i++){
            sumx += x[i];
            sumy += y[i];
            sumz += z[i];
        }

        if(sumx == 0 && sumy == 0 && sumz == 0)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
