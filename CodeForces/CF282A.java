package CodeForces;

import java.util.Scanner;

public class CF282A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int n = in.nextInt();
        for(int i = 1; i<= n ; i++){
            String s = in.next();
            if(s.equals("X++"))
                x++;
            else if(s.equals("++X"))
                ++x;
            else if(s.equals("X--"))
                x--;
            else if(s.equals("--X"))
                --x;
        }
        System.out.println(x);
    }

}
