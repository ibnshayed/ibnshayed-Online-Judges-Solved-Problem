package CodeForces;

import java.util.Scanner;

public class CodeForces71A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i = 1; i<=testCase; i++){
            String s = in.next();
            if(s.length() <= 10)
                System.out.println(s);
            else {
                int subStringLength = s.substring(1,s.length() - 1).length();
                String resultString = s.charAt(0)+""+ subStringLength+""+ s.charAt(s.length() - 1);
                System.out.println(resultString);
            }
        }
    }
}
