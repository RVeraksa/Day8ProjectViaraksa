package by.javatr.task3.function;

public class Min implements Procedure {
    @Override
    public int calculate(int line, int[][] a) {
        int[] b = a[line];
        int min = b[0];
        for (int i = 0 ; i < b.length-1; i++){
            if (b[i] > b[i+1])
                min = b[i+1];
        }
        return min;
    }
}
