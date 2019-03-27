package CodeForces;

import java.util.*;

public class CF339A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                arrayList.add(Integer.parseInt(""+s.charAt(i)));
            }
        }
        Collections.sort(arrayList);
        for(int i = 0; i<arrayList.size(); i++){
             if(i == arrayList.size() - 1)
                 System.out.print(arrayList.get(i));
             else System.out.print(arrayList.get(i) + "+");
        }
        System.out.println();
    }
}
