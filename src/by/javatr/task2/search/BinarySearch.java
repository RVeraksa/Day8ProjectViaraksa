package by.javatr.task2.search;
import by.javatr.task2.util.ArrayInt;

public class BinarySearch {
   private static boolean checkSorted(ArrayInt arr) {
        boolean one = false;
        if (arr.getElement(0) < arr.getElement(1)) {
            for (int i = 1; i < arr.length() - 1; i++) {
                if (arr.getElement(i) <= arr.getElement(i + 1))
                    one = true;
                else
                    one = false;
            }
            return one;
        } else if (arr.getElement(0) > arr.getElement(1)) {
            for (int i = 1; i < arr.length() - 1; i++) {
                if (arr.getElement(i) >= arr.getElement(i + 1))
                    one = true;
                else
                    one = false;
            }
            return one;
        } else
            return one;
    }

    public static int find(int searchkey, ArrayInt arr) {
        int middle = -1;
        if (checkSorted(arr)) {
            int first = 0;
            int last = arr.length() - 1;
            while (first <= last) {
                middle = (first + last)/2;
                if (arr.getElement(middle) == searchkey)
                    return middle;
                else if (arr.getElement(middle) < searchkey)
                    first = middle + 1;
                else if (arr.getElement(middle) > searchkey)
                    last = middle - 1;
            }
        }
        return middle;
    }
}
