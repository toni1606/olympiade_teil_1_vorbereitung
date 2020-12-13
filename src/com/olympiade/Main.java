package com.olympiade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        primeExample();
        sortExample();

        int[] arr = new int[8];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        selectionSortExample(arr);
        mergeSortExample(arr);
        quickSortExample(arr);
        numbersExample();

    }

    public static void primeExample() {
        System.out.println(Arrays.toString(Prime.findPrimes(50)));
        System.out.println(Arrays.toString(Prime.findPrimes(13, 50)));
    }

    public static void numbersExample() {
        System.out.println(Number.backwards(4581567));
        System.out.println(Number.checksum(123456));
        System.out.println(Number.powerOf(2, 5));
    }

    public static void sortExample() {
        int[] arr = {3, 10, 2, 5903, 1, 24};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> intList = new ArrayList<>(1);
        intList.add(50);
        intList.add(1);
        intList.add(23);
        intList.sort(Collections.reverseOrder());
        System.out.println(intList);

        List<String> stringList = new ArrayList<>(3);
        stringList.add("toni");
        stringList.add("ana");
        stringList.add("tea");
        stringList.add("edri");
        stringList.add("elgi");
        stringList.add("irsa");
        stringList.add("gimi");

        Collections.sort(stringList);
        System.out.println(stringList);

        List<Car> carArr = new ArrayList<>(3);
        carArr.add(new Car((short) 245));
        carArr.add(new Car((short) 5252));
        carArr.add(new Car((short) 2));

        carArr.sort(Car.compareHorsePower);
        System.out.println(carArr);
    }

    public static void selectionSortExample(int[] arr) {
        long start = System.nanoTime();
        System.out.println(Arrays.toString(Sort.selectionSort(arr)));
        System.out.println(System.nanoTime() - start);
    }

    public static void mergeSortExample(int[] arr) {
        long start = System.nanoTime();
        System.out.println(Arrays.toString(Sort.mergeSort(arr)));
        System.out.println(System.nanoTime() - start);
    }

    public static void quickSortExample(int[] arr) {
        long start = System.nanoTime();
        System.out.println(Arrays.toString(Sort.quickSort(arr)));
        System.out.println(System.nanoTime() - start);
    }
}
