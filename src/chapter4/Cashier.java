package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {

        // Get the number of items to scan
        System.out.println("Enter the number of items you want to scan");
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();

        double total = 0;
        // Create a loop to iterate through all of the items and accumulate the costs
        for(int i = 0; i < quantity; i++){
            System.out.println("Enter the price of "+ (1+i) + " item");
            int itemPrice = scan.nextInt();
            total = total + itemPrice;
        }
        scan.close();
        System.out.println("The total price = " + total);
    }
}
