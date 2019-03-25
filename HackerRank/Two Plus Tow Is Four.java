/*
You know that two plus two is four. You also know that four minus one that's three. Pretty easy, right? Your task is to write a big (!) program that will do quick maths for you!

image

Input Format

Input consists of a single line containing the equation. There will be no space, just operands and operators. The operators will be + (addition) and - (subtraction). And the operands would be integers and there will be no brackets. See the sample for clarification.

Constraints

The equation may contain upto 100 characters. All the integers would be less than 10.

Output Format

Print the result of the equation, the value could be positive or negative.

Sample Input 0

2+2-1
Sample Output 0

3

*/

import java.io.*;
import java.util.*;



import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String anotherEquation = in.next();
        int another = computeAnother(anotherEquation);
        System.out.println(another);
    }

    static int  computeAnother(String equation) {
        int result = 0;
        String noMinus = equation.replace("-", "+-");
        String[] byPluses = noMinus.split("\\+");

        for (String multipl : byPluses) {
            String[] byMultipl = multipl.split("\\*");
            double multiplResult = 1.0;
            for (String operand : byMultipl) {
                if (operand.contains("/")) {
                    String[] division = operand.split("\\/");
                    double divident = Double.parseDouble(division[0]);
                    for (int i = 1; i < division.length; i++) {
                        divident /= Double.parseDouble(division[i]);
                    }
                    multiplResult *= divident;
                } else {
                    multiplResult *= Double.parseDouble(operand);
                }
            }
            result += multiplResult;
        }

        return result;
    }
}
