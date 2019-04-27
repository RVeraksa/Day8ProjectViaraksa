package by.javatr.task2.search;

import by.javatr.task2.util.ArrayInt;

public class SearchExtremeValues {
    public static int minimum(ArrayInt arr){
        int min = arr.getElement(0);
        for (int i = 1 ; i < arr.length(); i++){
            if(arr.getElement(i) < min)
                min = arr.getElement(i);
        }
        return min;
    }
    public static int maximum(ArrayInt arr){
        int max = arr.getElement(0);
        for (int i = 1 ; i < arr.length(); i++){
            if(arr.getElement(i) > max)
                max = arr.getElement(i);
        }
        return max;
    }
}
