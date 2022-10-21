package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String args[]){
        int hoursWorked;
        double hourlyPayRate,grossSalary;
        Scanner scan = new Scanner(System.in); // System.in -> Read from the input
        //Get the number of hours worked.
        System.out.println("Enter the number of the hours worked : ");

        hoursWorked = scan.nextInt();
        //Get the hourly pay rate.
        System.out.println("Enter the hourly pay rate : ");
        hourlyPayRate = scan.nextDouble();
        scan.close();
        //Multiply hours & pay rate.
        grossSalary = hoursWorked*hourlyPayRate;
        //Display result.
        System.out.println("Your gross payment is : " + grossSalary + " $ ");

    }
}
