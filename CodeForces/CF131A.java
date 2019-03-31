package CodeForces;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CF131A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String output = "";
     /*   System.out.println(s.toUpperCase());
        System.out.println(""+s.substring(0,1).toLowerCase() + "" + s.substring(1,s.length()).toUpperCase());*/
        if(s.equals(s.toUpperCase()))
            output += s.toLowerCase();
        else if(s.equals( ""+s.substring(0,1).toLowerCase() + s.substring(1,s.length()).toUpperCase())){
            output += s.substring(0,1).toUpperCase() + s.substring(1,s.length()).toLowerCase();
        }
        else output += s;
        System.out.println(output);

    }
}
