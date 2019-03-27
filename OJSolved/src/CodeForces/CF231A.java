package CodeForces;

import java.util.Scanner;

public class CF231A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        int sum = 0;
        for(int i = 1; i<= testCase ; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if((a+b+c) >= 2)
                sum += 1;

        }
        System.out.println(sum);
    }
}
