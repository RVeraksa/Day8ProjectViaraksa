package by.javatr.task3.function;

public class Max implements Procedure {
    @Override
    public int calculate(int line, int[][] a) {
        int[] b = a[line];
        int max = b[0];
        for (int i = 0 ; i < b.length-1; i++){
            if (b[i] < b[i+1])
                max = b[i+1];
        }
        return max;
    }
}
