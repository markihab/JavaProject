package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double priceForMinute = 0.25;
    static double taxes = 0.15;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Initialize what we know
        //Get what we don't know
        double baseCost = getBaseCostOfPlan();
        double noOfMinutes = getOverageMinutes();
        double overageFees = calculateOverageFees(noOfMinutes);
        double taxes = calculateTax(baseCost+noOfMinutes);
        double total = getTotal( taxes,  baseCost, overageFees);
        scan.close();
        printPhoneBillStatement( baseCost, overageFees,taxes,total);
    }

    public static double getBaseCostOfPlan(){
        System.out.println("Enter the base cost of the plan");
        double baseCost = scan.nextDouble();
        return baseCost;
    }

    public static double getOverageMinutes(){
        System.out.println("Enter overage minutes");
        double minutes = scan.nextDouble();
        return minutes;
    }

    public static double calculateTax( double totalFees){
        return (totalFees*0.15);
    }

    public static double calculateOverageFees(double noOfMinutes){
        return (noOfMinutes*priceForMinute);
    }

    public static double getTotal(double taxes, double baseCost, double overageFees){
        return (taxes+baseCost+overageFees);
    }

    public static void printPhoneBillStatement(double baseCost,double overageFees,double taxes,double total){
        System.out.println("Plan: $"+baseCost);
        System.out.println("Overage: $"+overageFees);
        System.out.println("Tax: $"+taxes);
        System.out.println("Total: $"+total);
    }
}
