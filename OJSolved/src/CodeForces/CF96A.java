package CodeForces;

import java.util.Scanner;

public class CF96A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        if(s.contains("0000000") || s.contains("1111111"))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
