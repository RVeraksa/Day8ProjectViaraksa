package by.javatr.task3.runner;
import by.javatr.task3.function.Max;
import by.javatr.task3.function.SortType;
import by.javatr.task3.util.Bubble;

public class Run {

    /**
     * Метод выводяший массив на экран
     */
    private static void printArr(int[][] arr){
        for (int j=0;j<arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[]{1, 3, 4, 6};
        arr[1] = new int[]{7, 8};
        arr[2] = new int[]{2, 4, 7};
        arr[3] = new int[]{1, 8, 9};
        System.out.println("Неотсортированный массив");
        printArr(arr);
        Bubble bubble = new Bubble();
        bubble.sort(arr, new Max(), SortType.Ascending);
        printArr(arr);


    }
}
