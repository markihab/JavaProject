package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your Grade : ");
        Scanner scan = new Scanner(System.in);
        String grade = scan.next().toUpperCase();
        String message = switch (grade) {
            case "A" -> "Excellent";
            case "B" -> "Great";
            case "C" -> "Good";
            case "D" -> "Bad";
            case "F" -> " Very Bad";
            default -> "Error, You entered invalid grade";
        };

        System.out.println(message);
    }
}
