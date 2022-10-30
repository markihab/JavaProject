package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static Scanner scan = new Scanner(System.in);
    private static String [] daysOfTheWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public static void main(String[] args) {

        System.out.println("Enter the number corresponding to the week assuming that Monday is the starting of the week !");
        int index = scan.nextInt();
        System.out.println("The day is : " + returnDay(index));

    }

    public static String returnDay(int index){
        return daysOfTheWeek[index-1];
    }


}
