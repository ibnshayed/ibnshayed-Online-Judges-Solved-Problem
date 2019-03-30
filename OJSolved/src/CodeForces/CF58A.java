package CodeForces;

import java.util.Scanner;

public class CF58A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String hello = "";
        for (int i = 0; i<s.length(); i++){
            //for 'h'
            if(!hello.contains("h") && s.charAt(i) == 'h'){
                hello += s.charAt(i);
            }
            else if(!hello.contains("h"))
                continue;
            //for 'e'
            else if(!hello.contains("e") && s.charAt(i) == 'e'){
                hello += s.charAt(i);
            }
            else if(!hello.contains("he"))
                continue;
            //for 'l'
            else if(!hello.contains("ll") && s.charAt(i) == 'l'){
                hello += s.charAt(i);
            }
            else if(!hello.contains("hell"))
                continue;
            //for 'o'
            else if(!hello.contains(""+s.charAt(i)) && s.charAt(i) == 'o'){
                hello += s.charAt(i);
            }

        }
        if(hello.contains("hello"))
            System.out.println("YES");
        else System.out.println("NO");

/*
        //Another easy Solution
        Scanner in = new Scanner(System.in);
        String s = in.next();
        final String hello = "hello";
        String output = "NO";
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == hello.charAt(j))
                j++;
            if(j>=hello.length()){
                output = "YES";
                break;
            }
        }
        System.out.println(output);*/
    }
}
