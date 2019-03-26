package CodeForces;

import java.util.Scanner;

public class CF158B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfGroups = in.nextInt();
        int[] groups = new int[numOfGroups];
        int four = 0;
        int three = 0;
        int two = 0;
        int one = 0;
        int result = 0;
        for (int i = 0; i <numOfGroups; i++) {
            groups[i] = in.nextInt();
        }
        for (int x : groups){
                if(x == 4)
                   four += 1;
                else if(x == 3)
                    three += 1;
                else if(x == 2)
                    two += 1;
                else one += 1;
        }
        while(four != 0 || three !=0 || two != 0 || one != 0){
            //Four relates nothing
            if(four >=1){
                result += four;
                four = 0;
            }
            //Three relates to One
            else if(three >=1){
                if(one >= 1){
                    result +=1;
                    three -= 1;
                    one -= 1;
                }
                else {
                    result += 1;
                    three -= 1;
                }
            }
            //Two relates to Two and One
            else if(two >= 1){
                if(two >= 2){
                    result += two/2;
                    two = two % 2;
                }
                else if(one >=1){
                     if(one >= 2){
                         result +=1;
                         two -= 1;
                         one -= 2;
                     }
                     else {
                         result += 1;
                         two -= 1;
                         one -= 1;
                     }
                }
                else{
                    result += 1;
                    two -= 1;
                }
            }
            //At last One relates nothing
            else if(one >=1){
                if(one >=4){
                    result += 1;
                    one -= 4;
                }
                else if(one == 3){
                    result += 1;
                    one -= 3;
                }
                else if(one == 2){
                    result += 1;
                    one -= 2;
                }
                else {
                    result += 1;
                    one -= 1;
                }
            }

        }
        System.out.println(result);

    }
}
