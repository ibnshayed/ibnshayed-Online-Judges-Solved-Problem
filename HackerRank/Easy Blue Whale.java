/*
In the Blue Whale world, blue is considered great color! There are three prime colors in Blue Whale world. Every color has an ID number. White is 1000, Purple is 2000 and Blue is 3000. Other colors are shades of those prime colors! Now given a color in it's Binary form, you have to determine if it's Blue, Almost Blue or 'Eh!'. Because Blue for the win!

Blue : If the color ID exactly matches Blue color's ID
Almost blue : If the absolute difference from the color and Blue is less then or equal to 500 and the color ID is a prime number.
Eh! : If it's not even close.

Input Format

The only line of input will contain a binary string b.

Constraints

The binary string will be less then or equal to 14 bits.

Output Format

Print "Blue" (without quotes) or "Almost Blue" (without quotes) or "Eh!" according to the data you analyzed.

Sample Input 0

10001
Sample Output 0

Eh!
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int whhite = 1000;
        int purple = 2000;
        int blue  = 3000;

        String s = in.next();

        long a = Long.parseLong(s,2);
        long absdiff = Math.abs(blue - a);
        if(a == blue)
            System.out.println("Blue");
        else if(absdiff <= 500 && isPrime(a))
            System.out.println("Almost Blue");

            else System.out.println("Eh!");
    }
    public static boolean isPrime(long n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
