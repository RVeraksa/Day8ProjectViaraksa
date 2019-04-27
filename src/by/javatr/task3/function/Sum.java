package by.javatr.task3.function;

public class Sum implements Procedure {
    @Override
    public int calculate(int line, int[][] a) {
        int[] b = a[line];
        int sum = 0;
        for (int i = 0 ; i < b.length; i++){
            sum += b[i];
        }
        return sum;
    }
}
