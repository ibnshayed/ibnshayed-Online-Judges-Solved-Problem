package CodeForces;

import java.util.*;

public class CF266B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfChildren = in.nextInt();
        int time = in.nextInt();
        String s = in.next();
        char[] c = s.toCharArray();
        while (time != 0)
        {
            for (int i = 1; i < numOfChildren; ++i)
            {
                if (c[i] == 'G' && c[i-1] == 'B')
                {
                    c[i] = 'B';
                    c[i-1]= 'G';
                    ++i;
                }
            }
            time--;
        }
        System.out.println(c);


    }

}
