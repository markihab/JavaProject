package chapter5;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Initialize what we know
        //Get what we don't know
        double salary = getSalaryData();
        int creditScore = getCreditScore();
        scan.close();
        //Check if the user is qualified
        Boolean isQualified = isUserQualified(salary,creditScore);
        //Notify the user
        notifyUser(isQualified);
    }

    public static double getSalaryData(){
        System.out.println("Enter your salary : ");
        double salary = scan.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your credit score : ");
        int creditScore = scan.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore){
        if(salary >= requiredSalary && creditScore >= requiredCreditScore){
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("You have been qualified");
        }
        else {
            System.out.println("Opps, you are not qualified");
        }
    }
}
