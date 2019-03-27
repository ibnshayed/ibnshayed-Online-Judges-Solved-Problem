package CodeForces;

import java.util.Scanner;

public class CF266A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int count = 0;
        char last = s.charAt(0);

        for (int i = 1; i < n; i++) {
            if(s.charAt(i) == last)
                count++;
            else last = s.charAt(i);
        }
        System.out.println(count);

    }
}
