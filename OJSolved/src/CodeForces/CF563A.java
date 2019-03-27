package CodeForces;

import java.util.Scanner;

public class CF563A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[5+1][5+1];
        int indexOfMidRow = 3;
        int indexOfMidColumn = 3;
        int indexOfOneRow = 0;
        int indexOfOneColumn = 0;
        int result;
        for(int i = 1; i<=5; i++){
            for (int j = 1; j <= 5; j++) {
                array[i][j] = in.nextInt();
            }
        }
        for(int i = 1; i<=5; i++){
            for (int j = 1; j <= 5; j++) {
                if(array[i][j] == 1){
                    indexOfOneRow = i;
                    indexOfOneColumn = j;
                    break;
                }
            }
        }
        result = Math.abs(indexOfMidRow - indexOfOneRow) + Math.abs(indexOfMidColumn - indexOfOneColumn);
        System.out.println(result);
    }
}
