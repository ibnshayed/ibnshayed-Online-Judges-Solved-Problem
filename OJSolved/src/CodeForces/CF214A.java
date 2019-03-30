package CodeForces;

import java.util.Scanner;

public class CF214A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 2 * (int) Math.floor(Math.sqrt(n));

        if(max < (2 * (int) Math.floor(Math.sqrt(m))))
            max = (2 * (int) Math.floor(Math.sqrt(m)));

        int count = 0;

        for(int i = 0; i<=max; i++){
            for (int j = 0; j<=max; j++){
                if( (Math.pow(i,2) + j) == n && (i+ Math.pow(j,2)) == m)
                    count++;
            }
        }
        System.out.println(count);
    }
}
