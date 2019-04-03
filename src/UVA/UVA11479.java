package UVA;

import java.util.Scanner;

class UVA11479 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i = 1; i<= testCase; i++){
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            String output ="";
            if(a <= 0 || b <= 0 || c<= 0){
                output = "Invalid";
            }
            else if(a+b > c && a+c > b && b+c > a){
                if(a == b && b == c){
                    output = "Equilateral";
                }
                else if(a == b || a == c  || b == c){
                    output = "Isosceles";
                }
                else output = "Scalene";
            }
            else output = "Invalid";

            System.out.println("Case "+i+": "+output);
        }
    }
}
