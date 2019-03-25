/*
Mr. Hundred CommentMan was quite busy with his new company. They are building a new product named J.A.R.V.I.S kit. The pre-order calculation days are over. Now, they need to deliver the promised J.A.R.V.I.S kit as soon as possible. In order to deliver the products within the deadline, they need enough intelligent minds. So, CommentMan called me and asked me to initiate a interview. So here I am.

You need to answer only one question in order to pass the first round. Do you have what it takes to be the part of our company?

Just raise number 6 to the power of n and get last digit of the number. Yes, of course, n can be rather big, and one cannot find the power using a calculator, but we need people who are able to think, not just follow the instructions.

Input Format

The only line of the input contains a single integer — the power in which you need to raise number 6.

Constraints

2 ≤ n ≤ 2·10^18

Output Format

Output the last digit of 6^n.

Sample Input 0

4
Sample Output 0

6
Explanation 0

6^4 = 1296. So, the last digit is 6.
*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

     public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        BigInteger bigInteger = BigInteger.valueOf((long)Math.pow(6,2));
        String s = bigInteger.toString();
        char[] c = s.toCharArray();
        System.out.println(c[s.length() - 1]);
    }
}
