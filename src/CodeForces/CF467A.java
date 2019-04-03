package CodeForces;

import java.util.Scanner;

public class CF467A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numofRooms = in.nextInt();
        int count = 0;
        for(int i = 1; i<= numofRooms; i++){
            int p = in.nextInt();
            int q = in.nextInt();
            if(q - p >=2)
                count++;
        }
        System.out.println(count);
    }
}
