package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int numberOfSales;
        //Initialize known values
        int paymentPerWeek = 1000;
        int additionalBonus = 250;
        int quota = 10;
        //Get unknown values
        System.out.println("How many sales the employee did this week : ");
        numberOfSales = scan.nextInt();
        //Quick detour for the bonus earner
        if(numberOfSales > quota) {
            System.out.println("Congrats you will get your bonus");
            paymentPerWeek += additionalBonus ;
        }

        System.out.println("The employee payment is = " + paymentPerWeek + " $");

    }
}
