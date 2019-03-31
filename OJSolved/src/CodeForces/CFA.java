package CodeForces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CFA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int k = 1 ; k<=testCase; k++){
            String s = in.next();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            s = String.valueOf(c);

            int ascii = (int) s.charAt(0);
            int flag = 0;
            for(int i = 1; i<s.length(); i++){
                if(s.charAt(i) != (ascii + i)){
                    flag++;
                }
            }

            if(flag > 0 )
                System.out.println("No");
            else System.out.println("Yes");
        }



    }
}
