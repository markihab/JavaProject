package chapter4;

import java.util.Scanner;

public class SearchInForLoop {
    public static void main(String[] args) {

        //Given data
        System.out.println("Please enter the string you want to search in :");
        Scanner scan = new Scanner(System.in);
        String word = scan.next().toUpperCase();

        //Unknown value
        char requiredCharToSearchFor = 'A';

        //For loop to search for a character inside this string
        for(int i = 0; i < word.length(); i++){
            char currentCharacter = word.charAt(i);
             if(currentCharacter == 'A'){
                 System.out.println("Letter A is found in index " + (i+1));
             }
        }
    }
}
