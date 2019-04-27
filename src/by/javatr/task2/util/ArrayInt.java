package by.javatr.task2.util;
import java.util.Arrays;


public class ArrayInt {
    private int[] arr;

    public ArrayInt(int[] array) {
            this.arr = array.clone();
    }

    public ArrayInt(int length) {
        if (length >= 0) {
            this.arr = new int[length];
        }
        else if (length < 0) {
            this.arr = new int[Math.abs(length)];
        }
    }

    public ArrayInt() {
    }

    public int[] getArr() {
        return arr.clone();
    }

    public void setArr(int[] array) {
        if(this.arr.length == array.length) {
            this.arr = array;
        }
        else if (this.arr.length > array.length) {
            for (int i = 0 ; i<array.length; i++){
                addElement(i,array[i]);
            }
            for (int i = array.length; i<this.arr.length; i++){
                setZero(i);
            }
        }
        else if (this.arr.length < array.length){
            for (int i = 0 ; i<this.arr.length; i++){
                addElement(i,array[i]);
            }
        }
        else this.arr = null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ArrayInt arrayInt = (ArrayInt) obj;
        if (this.arr.length != arrayInt.arr.length) return false;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] != arrayInt.arr[i]) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 15;
        for (int element : arr) {
            result = 31 * result + element;
        }
        return result;
    }

    @Override
    public String toString() {
        if (arr.length == 0) return "[]";

        StringBuilder res = new StringBuilder();
        res.append('[');

        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            res.append(arr[i]).append(" | ");
        }
        res.append(arr[length - 1]);

        res.append(']');
        return res.toString();
    }

    public boolean checkNumber(int number){
        if ( number < 0 || number > arr.length-1 ){
            return false;
        }
        return true;
    }

    public void addElement(int number, int value){
        if (checkNumber(number)){
            this.arr[number] = value;
        }
    }

    public void setZero(int number){
        if (checkNumber(number)){
            this.arr[number] = 0;
        }
    }

    public int getElement(int number) {
        if (checkNumber(number)) {
            int b = this.arr[number];
            return b;
        }
        else
            return -1;
    }

    public int length(){
        int l  = arr.length;
        return l;
    }
}
