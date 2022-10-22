package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        // known values
        int payRate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("Enter how many hours did you work this week : ");
        Scanner scan = new Scanner(System.in);
        double hoursWorked = scan.nextDouble();

        //validate input
        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("You entered invalid work hours. Your hours should be between 1 to 40");
            hoursWorked = scan.nextDouble();
        }
        scan.close();

        //calculate gross salary
        double grossSalary = payRate * hoursWorked;
        System.out.println("Your gross salary is : " + grossSalary);
    }
}
