package by.javatr.task2.function;
import by.javatr.task2.util.ArrayInt;

public class CheckNumber {

    public static int[] prime(ArrayInt arr){
        int c = 0, l = arr.length() ;
        int[] a = new int[l];
        for(int i=0; i<l; i++) {
            if (isPrime(arr.getElement(i))){
                a[c] = arr.getElement(i);
                c++;
            }
        }
        int[] b = createArray(a,c);
        return b;
    }

    public static int[] fibonacci(ArrayInt arr){
        int c = 0, l = arr.length() ;
        int[] a = new int[l];
        int f = 0, f1 = 1, f2 = 1;
        for(int i=0; i<l; i++) {
            if (isFibonacci(arr.getElement(i))){
                a[c] = arr.getElement(i);
                c++;
            }
        }
        int[] b = createArray(a,c);
        return b;
    }

    public static int[] threeDigitDifNumb(ArrayInt arr){
        int c = 0, l = arr.length() ;
        int[] a = new int[l];
        for(int i=0; i<l; i++) {
            if (isthreeDigitDifNumb(arr.getElement(i))){
                a[c] = arr.getElement(i);
                c++;
            }
        }
        int[] b = createArray(a,c);
        return b;
    }

    /**
    returns true if x is the integer square
     */
    private static  boolean isPerfectSquare(int x){
        int s = (int) Math.sqrt(x);
        boolean b = false;
        if (x == s*s)
            b = true;
        return b;
    }

    /**
    Returns true if a is a Fibonacci Number, else false
    return true is if one of 5*n*n + 4 or 5*n*n - 4 is a integer square
     */
    private static boolean isFibonacci(int a){
        boolean b = false;
        b = (isPerfectSquare(5*a*a + 4) || isPerfectSquare(5*a*a - 4));
        return b;
    }

    private static boolean isthreeDigitDifNumb(int x){
        boolean a = false;
        int hundred = x / 100;
        int decade = (x/ 10) % 10;
        int one = x % 10;
        if ( x < 1000 && x > 99)
            if(hundred != decade && one != hundred && one != decade)
            a = true;
        return a;
    }

    private static boolean isPrime(int x){
        boolean a = true;
        for (int j = 2; j < x; j++) {
            if ((x % j == 0) && x != 1){
                a = false;
            }
        }
        return a;
    }

    private static int[] createArray(int[] arr, int count){
        int[] a = new int[count];
        for(int i = 0; i < count; i++){
            a[i] = arr [i];
        }
        return a;
    }
}
