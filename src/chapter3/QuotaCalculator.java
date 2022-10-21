package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Initialize values we know
        int quota = 10;
        // Get unknown values
        System.out.println("Enter the number of sales you got this week : ");
        int sales = scan.nextInt();
        scan.close();
        //Make decision for the path to take
        if(sales >= quota){
            System.out.println("Congrats, You have met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("Unfortunatly, You didn't met the quota");
            System.out.println("Your sales short is : " + salesShort );
        }
    }
}
