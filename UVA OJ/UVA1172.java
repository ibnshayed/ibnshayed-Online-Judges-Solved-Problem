/*
Some operators checks about the relationship between two values and these operators are called rela-
tional operators. Given two numerical values your job is just to nd out the relationship between them
that is (i) First one is greater than the second (ii) First one is less than the second or (iii) First and
second one is equal.
Input
First line of the input le is an integer t (t < 15) which denotes how many sets of inputs are there.
Each of the next t lines contain two integers a and b (jaj; jbj < 1000000001).
Output
For each line of input produce one line of output. This line contains any one of the relational operators
`>', `<' or `=', which indicates the relation that is appropriate for the given two numbers.
Sample Input
3
10 20
20 10
10 10
Sample Output
<
>
=
 */
package UVA;

import java.util.*;

class UVA1172 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        int numberOne;
        int numberTwo;
        for(int i = 1; i<=testCase; i++){
            numberOne = in.nextInt();
            numberTwo = in.nextInt();
            if(numberOne > numberTwo)
                System.out.println(">");
            else if(numberOne < numberTwo)
                System.out.println("<");
            else System.out.println("=");
        }
    }
}
