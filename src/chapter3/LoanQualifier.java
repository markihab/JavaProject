package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        //Initialize what we know
        Scanner scan = new Scanner(System.in);
        int requiredSalary = 30000;
        int requiredYear = 2;
        //Get what we don't know
        System.out.println("Please enter your salary : ");
        double salary = scan.nextDouble();
        System.out.println("please enter number of years experience : ");
        double yearsOfExperience = scan.nextDouble();
        //Make Decision
    }
}
