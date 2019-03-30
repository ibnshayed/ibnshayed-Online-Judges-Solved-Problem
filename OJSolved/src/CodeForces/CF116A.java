package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CF116A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberofStops = in.nextInt();
        int arrive;
        int exit;
        ArrayList<Integer> total= new ArrayList<>();
        int remain = 0;
        for(int i = 1; i<= numberofStops; i++){
            exit = in.nextInt();
            arrive = in.nextInt();
            remain += arrive - exit;
            total.add(remain);
        }
        Collections.sort(total,Collections.reverseOrder());
        System.out.println(total.get(0));
    }
}
