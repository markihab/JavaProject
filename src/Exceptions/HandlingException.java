package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingException {
    public static void main(String[] args) {
        createFile();
        numbersExceptionHandling();
    }

    private static void numbersExceptionHandling() {
        File file  = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }finally {
            fileReader.close();
        }
    }

    public static void createFile(){
        File file = new File("resources/non-exist.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Path not found");
            e.printStackTrace();
        }
    }
}

