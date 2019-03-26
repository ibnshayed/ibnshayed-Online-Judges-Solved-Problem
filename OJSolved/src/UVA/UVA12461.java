package UVA;

import java.util.Scanner;

public class UVA12461 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        while (in.hasNext()){
            n = in.nextInt();
            if(n > 0){
                System.out.println("1/2");
            }
            else break;
        }
    }
}
