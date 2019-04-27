package by.javatr.task2.sorting;

import by.javatr.task2.exception.ArrayNotFound;
import by.javatr.task2.util.ArrayInt;

public class Sort {

    private static boolean checkNullArray(ArrayInt arr){
        boolean a;
        if (arr == null){
            a = false;
        }
        else a = true;
        return a;
    }

    private static void swap(int one, int two, ArrayInt arr){
        int buf = arr.getElement(one);
        arr.addElement(one, arr.getElement(two));
        arr.addElement(two, buf);
    }

    public static void selectionSort(ArrayInt arr) throws ArrayNotFound {
        if(checkNullArray(arr)){
            for(int i = 0; i < arr.length()-1; i++){
                int min = i;
                for(int j = i+1; j < arr.length(); j++) {
                    if (arr.getElement(j) < arr.getElement(min)) {
                        min = j;
                    }
                }
                swap(min, i, arr);
            }
        }
        else throw new ArrayNotFound("Задайте массив");
    }

    public static void bubbleSort(ArrayInt arr) throws ArrayNotFound {
        if (checkNullArray(arr)) {
            for (int i = 1; i < arr.length(); i++) {
                for (int j = 0; j < arr.length() - i; j++) {
                    if (arr.getElement(j) > arr.getElement(j+1)) {
                        swap(j,(j+1), arr);
                    }
                }
            }
        }
        else throw new ArrayNotFound("Задайте массив");
    }

    public static void insertSort(ArrayInt arr) throws ArrayNotFound {
        if (checkNullArray(arr)) {
            for (int i = 1; i < arr.length(); i++) {
                int key = arr.getElement(i);
                int j = i-1;
                while ((j >= 0) && (arr.getElement(j) > key)) {
                    arr.addElement(j+1, arr.getElement(j));
                    --j;
                }
                arr.addElement(j+1, key);
            }
        }
        else throw new ArrayNotFound("Задайте массив");
    }
}
