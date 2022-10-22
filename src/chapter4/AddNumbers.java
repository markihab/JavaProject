package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        boolean again ;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter the first number : ");
            double firstNum = scan.nextInt();
            System.out.println("Enter the second number : ");
            double secondNum = scan.nextInt();

            double sum = firstNum +secondNum;
            System.out.println("The sum is : " + sum);

            System.out.println("Whould you like to run again ?");
            again = scan.nextBoolean();

        }while (again);
    }
}
