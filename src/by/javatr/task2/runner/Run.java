package by.javatr.task2.runner;
import by.javatr.scanner.Scan;
import by.javatr.task2.exception.ArrayNotFound;
import by.javatr.task2.search.BinarySearch;
import by.javatr.task2.search.SearchExtremeValues;
import by.javatr.task2.sorting.Sort;
import by.javatr.task2.util.ArrayInt;
import by.javatr.task2.function.CheckNumber;


import java.io.FileNotFoundException;


public class Run {
    public void array(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)  {
        Scan scan1 = new Scan();
        ArrayInt arr_from_console = scan1.setArrayFromConsole();
        System.out.println(arr_from_console);
        try {
            Sort.bubbleSort(arr_from_console);                      //Метод пузырьковой сортировки
        } catch (ArrayNotFound arrayNotFound) {
            arrayNotFound.printStackTrace();
        }
        System.out.println(arr_from_console);
        int[] prime = CheckNumber.prime(arr_from_console);
        int[] fibonachi = CheckNumber.fibonacci(arr_from_console);
        int[] thr = CheckNumber.threeDigitDifNumb(arr_from_console);

        /**
         * Вывод найденных простых чисел, чисел Фибоначи и
         * трехзначныч чисел, в десятичной записи которых нет одинаковых цифр
         */

        for (int i = 0; i < prime.length; i++)
                System.out.print(prime[i] + " ");
        System.out.println();
        for (int i = 0; i < fibonachi.length; i++)
            System.out.print(prime[i] + " ");
        System.out.println();
        for (int i = 0; i < thr.length; i++)
            System.out.print(prime[i] + " ");
        System.out.println();

        ArrayInt arr_from_file = null;
        try {
            arr_from_file = scan1.readArrayFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(arr_from_file);
        int position_8 = BinarySearch.find(8,arr_from_file);

        /**
         * С помощью бинарного поиска выводим на
         * экран позицию 8  в массиве, но поскольку
         * массив неотсортирован программа должна
         * вывести значение -1
         */
        System.out.println("позиция 8 "+position_8);
        try {
            Sort.selectionSort(arr_from_file);
        } catch (ArrayNotFound arrayNotFound) {
            arrayNotFound.printStackTrace();
        }
        System.out.println(arr_from_file);
        position_8 = BinarySearch.find(8,arr_from_file);
        System.out.println("позиция 8 "+position_8);

        ArrayInt arr_random = scan1.randomArray(4);
        System.out.println(arr_random);
        try {
            Sort.insertSort(arr_random);
        } catch (ArrayNotFound arrayNotFound) {
            arrayNotFound.printStackTrace();
        }
        System.out.println(arr_random);
        /**
         * Создаём массив длиной 4 и выводим
         * на экран max и min эдементы содержащиеся
         * в массиве
         */
        System.out.println("max: "+ SearchExtremeValues.maximum(arr_random)+
                " min: "+SearchExtremeValues.minimum(arr_random));

    }
}

