import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
     /*   Date now = new Date();

        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        System.out.println(simpleDateformat.format(now));

        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(now));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format
        System.out.println(Math.ceil(9.5));
        System.out.println(Math.floor(9.5));*/
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
        System.out.println(output);

    }
}
