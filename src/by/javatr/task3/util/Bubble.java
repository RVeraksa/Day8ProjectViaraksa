package by.javatr.task3.util;
import by.javatr.task3.function.Procedure;
import by.javatr.task3.function.SortType;

public class Bubble {

    public void sort(int[][] arr, Procedure p, SortType type) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (SortType.Ascending == type) {
                    if (p.calculate(j, arr) > p.calculate(j + 1, arr)) {
                        swap(j, (j + 1), arr);
                    }
                }
                else if(SortType.Ascending == type) {
                    if (p.calculate(j, arr) < p.calculate(j + 1, arr)) {
                        swap(j, (j + 1), arr);
                    }
                }
            }
        }
    }

    private void swap(int j, int i, int[][] arr) {
        Object buf = arr[j];
        arr[j] = arr[i];
        arr[i] = (int[]) buf;
    }
}
