/*
Given a range [a, b], you are to find the summation of all the odd integers in this range. For example,
the summation of all the odd integers in the range [3, 9] is 3 + 5 + 7 + 9 = 24.
Input
There can be at multiple test cases. The first line of input gives you the number of test cases, T
(1 ≤ T ≤ 100). Then T test cases follow. Each test case consists of 2 integers a and b (0 ≤ a ≤ b ≤ 100)
in two separate lines.
Output
For each test case you are to print one line of output – the serial number of the test case followed by
the summation of the odd integers in the range [a, b].
Sample Input
2
1
5
3
5
Sample Output
Case 1: 9
Case 2: 8
 */
package UVA;

import java.util.Scanner;

class UVA100783 {
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int testCase = in.nextInt();
          for (int i = 1; i<=testCase; i++){
              int a = in.nextInt();
              int b = in.nextInt();
              int sum = 0;
              for(int j = a; j<=b; j++){
                  if(j%2 != 0)
                      sum += j;
              }
              System.out.println("Case "+i+": "+sum);
          }
     }
}
