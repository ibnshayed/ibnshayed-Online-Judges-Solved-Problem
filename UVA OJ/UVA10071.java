package UVA;

import java.util.Scanner;

public class UVA10071 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int velocity = in.nextInt();
            int time = in.nextInt();
            int displacement =  2 * velocity * time;
            System.out.println(displacement);
        }

    }
}
