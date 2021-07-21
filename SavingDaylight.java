// Kattis, Saving Daylight
// https://open.kattis.com/problems/savingdaylight

import java.util.Scanner;

public class SavingDaylight{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String month = sc.next();
            String day = sc.next();
            String year = sc.next();
            String[] begin = sc.next().split(":");
            String[] end = sc.next().split(":");
            int daytime = ((Integer.parseInt(end[0]) * 60) + Integer.parseInt(end[1])) - ((Integer.parseInt(begin[0]) * 60) + Integer.parseInt(begin[1]));
            int hours = daytime / 60;
            int minutes = daytime % 60;
            System.out.println(month + " " + day + " " + year + " " + hours + " hours " + minutes + " minutes");
        }
        sc.close();
    }
}