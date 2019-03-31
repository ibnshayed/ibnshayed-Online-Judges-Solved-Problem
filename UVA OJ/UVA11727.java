/*
Company XYZ have been badly hit by recession and is taking
a lot of cost cutting measures. Some of these measures include
giving up office space, going open source, reducing incentives,
cutting on luxuries and issuing pink slips.
They have got three (3) employees working in the accounts
department and are going to lay-off two (2) of them. After a
series of meetings, they have decided to dislodge the person
who gets the most salary and the one who gets the least. This
is usually the general trend during crisis like this.
You will be given the salaries of these 3 employees working
in the accounts department. You have to nd out the salary
of the person who survives.
Input
The rst line of input is an integer T (T < 20) that indicates the number of test cases. Each case
consists of a line with 3 distinct positive integers. These 3 integers represent the salaries of the three
employees. All these integers will be in the range [1000; 10000].
Output
For each case, output the case number followed by the salary of the person who survives.
Sample Input
3
1000 2000 3000
3000 2500 1500
1500 1200 1800
Sample Output
Case 1: 2000
Case 2: 2500
Case 3: 1500
 */
package UVA;

import java.util.Scanner;

class UVA11727 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i = 1; i<=testCase; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a<b && b<c || c<b && b<a)
            System.out.println("Case " + i + ": " + b);
            else if(b<a && a<c || c<a && a<b)
                System.out.println("Case " + i + ": " + a);
            else if(a<c && c<b || b<c && c<a)
                System.out.println("Case " + i + ": " + c);
        }
    }
}
