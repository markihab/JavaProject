package chapter4;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {

        // Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scan = new Scanner(System.in);

        //Process all students
        for(int i = 0; i < numberOfStudents; i++){
            double total = 0;
            for(int j = 0; j < numberOfTests; j++){
                System.out.println("Enter the score for test # " +(j+1));
                double score = scan.nextDouble();
                total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("The Average score for student # "+ (i+1) + " " + average);
        }
        scan.close();
    }
}
