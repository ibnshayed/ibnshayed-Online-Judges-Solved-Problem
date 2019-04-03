package UVA;

import java.util.Scanner;

class UVA11854 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a==0&&b==0&&c==0)break;
            if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)
                    || Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2)
                    || Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2))
                System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
