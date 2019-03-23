/*
Some of us called Anik a master of Java. Anik also agree on this . But once a stranger challenged Anik, if anik could solve a problem he(stngr.) also will be agreed with them. As you Anik is so much busy with his new project, he will accept the challenge if you can help him.

The challenge is to take input two lines and find the multiplication of these numbers.

Anik need help of a programmer to prove himself a master of a language(!). ;)

Input Format

There are N tescase, each test case contains two lines always start with character '0' followed by '.', then unknown number x and next line contains y, each line will always terminated by three dots '...' .

Constraints

x<2^31-1; y<2^31-1;

Output Format

Output the multiplication of x,y result = x*y;

Sample Input 0

1
0.1227...
0.517611738...
Sample Output 0

635109602526

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i = 1; i<=testCase; i++){
            String s1 = in.next();
            String s2 = in.next();
            s1 = s1.replace(".","");
            s2 = s2.replace(".","");
            long a = Long.parseLong(s1);
            long b = Long.parseLong(s2);
            System.out.println(a*b);

        }

    }
}
