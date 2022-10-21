package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        //Get Test score from the user
        System.out.println("Enter your test score : ");
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
        //Determine his Grade
        char grade = ' ';

        if(score < 60){
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else if (score < 100) {
            grade = 'A';
        }

        System.out.println("Your grade is : " + grade);
    }
}
