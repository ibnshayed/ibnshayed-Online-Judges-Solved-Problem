package UVA;

import java.util.Scanner;

public class UVA11936 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i = 1; i<=testCase; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if((a+b) > c)
                System.out.println("OK");
            else System.out.println("Wrong!!");
        }
    }
}
