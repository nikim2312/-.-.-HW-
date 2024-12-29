package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Test byte array binary search
        byte[] byteArray = {1, 3, 5, 7, 9};
        System.out.println(Arrays.binarySearch(byteArray, (byte) 5));
        System.out.println(Arrays.binarySearch(byteArray, 0, byteArray.length, (byte) 7));

        // Test char array binary search
        char[] charArray = {'a', 'c', 'e', 'g', 'i'};
        System.out.println(Arrays.binarySearch(charArray, 'e'));
        System.out.println(Arrays.binarySearch(charArray, 0, charArray.length, 'g'));

        // Test double array binary search
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(Arrays.binarySearch(doubleArray, 3.3));
        System.out.println(Arrays.binarySearch(doubleArray, 0, doubleArray.length, 4.4));

        // Test float array binary search
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        System.out.println(Arrays.binarySearch(floatArray, 2.2f));
        System.out.println(Arrays.binarySearch(floatArray, 0, floatArray.length, 5.5f));

        // Test int array binary search
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println(Arrays.binarySearch(intArray, 30));
        System.out.println(Arrays.binarySearch(intArray, 0, intArray.length, 50));

        // Test long array binary search
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        System.out.println(Arrays.binarySearch(longArray, 300L));
        System.out.println(Arrays.binarySearch(longArray, 0, longArray.length, 500L));

        // Test short array binary search
        short[] shortArray = {10, 20, 30, 40, 50};
        System.out.println(Arrays.binarySearch(shortArray, (short) 20));
        System.out.println(Arrays.binarySearch(shortArray, 0, shortArray.length, (short) 40));

        // Test generic array binary search with Comparator
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        System.out.println(Arrays.binarySearch(stringArray, "cherry", String::compareTo));
        System.out.println(Arrays.binarySearch(stringArray, 0, stringArray.length, "date", String::compareTo));

        // Test Collections.binarySearch with natural order
        List<Integer> intList = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        System.out.println(Collections.binarySearch(intList, 30));

        // Test Collections.binarySearch with Comparator
        List<String> stringList = new ArrayList<>(List.of("apple", "banana", "cherry", "date", "fig"));
        System.out.println(Collections.binarySearch(stringList, "banana", String::compareTo));
    }
}
