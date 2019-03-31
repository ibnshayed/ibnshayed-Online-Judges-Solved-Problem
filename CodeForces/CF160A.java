package CodeForces;

import java.util.*;

public class CF160A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfCoin = in.nextInt();
        Integer[] x = new Integer[numOfCoin];
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i<numOfCoin; i++){
            x[i] = in.nextInt();
        }

        Arrays.sort(x);
        int sum = Arrays.stream(x).reduce(0,(a,b) -> a + b);
        double mid = sum / 2.0;
        int temp = 0;

        for(int i = 0; i<numOfCoin; i++){
            temp += x[i];
            count1++;
            if(temp > mid) {
                break;
            }
        }

        Arrays.sort(x,Collections.reverseOrder());
        temp = 0;
        for(int i = 0; i<numOfCoin; i++){
            temp += x[i];
            count2++;
            if(temp > mid) {
                break;
            }
        }

        if(count1 <= count2)
            System.out.println(count1);
        else System.out.println(count2);


    }

}
