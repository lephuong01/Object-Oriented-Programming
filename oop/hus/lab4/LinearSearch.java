package oop.hus.lab4;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println(linearSearch(array, 10));
        System.out.println(linearSearch(array, 0));
        System.out.println(linearSearchIndex(array, 10));
        System.out.println(linearSearchIndex(array, 0));
    }
    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (linearSearch(array, key)) {
                return i;
            }
        }
        return -1;
    }
}
