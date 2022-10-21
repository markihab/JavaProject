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
        if(salary >= requiredSalary){
            if (yearsOfExperience >= requiredYear){
                System.out.println("Congrats, you are qualified for the loan");
            }
            else {
                System.out.println("Unfortunatly, You need to have at least " + requiredYear + " of experience");
            }
        }
        else {
            System.out.println("Unfortunatly, You need to earn at least " + requiredSalary +" per year to take the loan");
        }
    }
}
