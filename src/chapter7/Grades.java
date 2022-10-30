package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Grades {
    private static int grades[];
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter how many grades you want to enter : ");
        grades = new int[scan.nextInt()];

        getGrades();

        System.out.println("The sum of the grades :" + sumGrades());
        System.out.println("The Average of the grades : "+ calculateAverage());
        System.out.println("The Highest grade is : " + printHighestGrade());
        System.out.println("The lowest grade is : " + printLowestGrade());
    }

    public static void getGrades(){
        for (int i = 0; i < grades.length ; i++) {
                grades[i] = scan.nextInt();
        }
    }

    public static int sumGrades(){
        int sum = 0;
            for(int grade : grades){
                sum = sum + grade ;
            }
            return sum;
    }

    public static double calculateAverage(){
        return sumGrades()/grades.length;
    }

    public static int printHighestGrade(){
      int highest = grades[0];
        for (int grade : grades) {
            if(grade > highest){
                highest = grade ;
            }
        }
        return highest;
    }

    public static int printLowestGrade(){
        int lowest = grades[0];
        for (int grade : grades) {
            if(grade < lowest){
                lowest = grade ;
            }
        }
        return lowest;
    }
}
