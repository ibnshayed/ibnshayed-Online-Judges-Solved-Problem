package CodeForces;

import java.util.Scanner;

public class CF236A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String temp = "";
        char c;

        //For Disticnt String
        for(int i = 0; i<s.length(); i++){
            c = s.charAt(i);
            if(!temp.contains(""+c)){
                temp += ""+c;
            }
        }
        //System.out.println(temp);
        if(temp.length()%2 == 0)
            System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
