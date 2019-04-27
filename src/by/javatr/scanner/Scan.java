package by.javatr.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import by.javatr.task2.util.ArrayInt;
import java.util.Scanner;

public class Scan {
    private int countElementInFile() throws FileNotFoundException {
        File file = new File("src/Information.txt");
        Scanner inputFile = new Scanner(file);
        int count = 0;
        while (inputFile.hasNextInt()) {
            count++;
            int j = inputFile.nextInt();
        }
        inputFile.close();
        return count;
    }

    public ArrayInt readArrayFromFile() throws FileNotFoundException {
        File file = new File("src/Information.txt");
        Scanner inputFile = new Scanner(file);
        ArrayInt arr = new ArrayInt(countElementInFile());
        for (int i = 0; i < arr.length(); i++){
            arr.addElement(i, inputFile.nextInt());
        }
        inputFile.close();
        return arr;
    }

    public ArrayInt setArrayFromConsole() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        ArrayInt myArray = new ArrayInt(length);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            myArray.addElement(i,s.nextInt());
        }
        return myArray;
    }

    public ArrayInt randomArray(int size){
        ArrayInt arr = new ArrayInt(size);
        for (int i = 0; i < arr.length(); i++){
            int r = (int)(Math.random() * 50 + 1);
            arr.addElement(i,r);
        }
        return arr;
    }
}
