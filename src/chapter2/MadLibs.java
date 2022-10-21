package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String args[]){
        String seasonOfTheYear, adjective;
        int wholeNumber;
        Scanner scan = new Scanner(System.in);
        // Enter the season of the year
        System.out.println("Enter the season of the year : ");
        seasonOfTheYear = scan.next();
        // Enter a whole number
        System.out.println("Enter the whole number : ");
        wholeNumber = scan.nextInt();
        // Enter an adjective
        System.out.println("Enter an adjective : ");
        adjective = scan.next();
        //The output result Expected
        System.out.println("On a " + adjective + " " + seasonOfTheYear + " day, I drink a minimum of "+ wholeNumber + " cups of coffee" );

    }
}
