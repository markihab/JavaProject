package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        // Values we have
        int target = 1;
        double result;
        double pennies = 0.1;
        double nickles = 0.5;
        double dimes = 0.15;
        double quarters = 0.25;
        // Input needed from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of pennies : ");
        int penniesCount = scan.nextInt();
        System.out.println("Enter the amount of nickles : ");
        int nicklesCount = scan.nextInt();
        System.out.println("Enter the amount of dimes : ");
        int dimesCount = scan.nextInt();
        System.out.println("Enter the amount of quarters : ");
        int quartersCount = scan.nextInt();

        result = (pennies*penniesCount) + (nickles*nicklesCount) + (dimes*dimesCount) + (quarters*quartersCount) ;
        // conditions
        if(result == 1){
            System.out.println("Congratulations, you won");  
        } else if (result > 1) {
            System.out.println("You exceed the target by "+ (result-target) + " $");
        } else if (result < 1) {
            System.out.println("You are under the target by "+ (target-result) + " $");
        }
    }
}
