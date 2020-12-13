package com.olympiade;

import java.util.ArrayList;
import java.util.List;

public class Sort {

	public static int[] selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tem = arr[j];
					arr[j] = arr[i];
					arr[i] = tem;
				}
			}
		}
		return arr;
	}

	public static int[] mergeSort(int[] arr) {
		int[] arr1 = new int[arr.length / 2];
		int[] arr2 = new int[arr.length - arr.length / 2];

		System.arraycopy(arr, 0, arr1, 0, arr1.length);
		System.arraycopy(arr, arr1.length, arr2, 0, arr2.length);

		if(arr1.length == 2) {
			selectionSort(arr1);
		} else if(arr1.length > 2){
			mergeSort(arr1);
		}

		if(arr2.length == 2) {
			selectionSort(arr2);
		} else if(arr1.length > 2){
			mergeSort(arr2);
		}

		System.arraycopy(arr1, 0, arr, 0, arr1.length);
		System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);

		return selectionSort(arr);
	}

	public static int[] quickSort(int[] arr) {
		if(arr.length == 0) {
			return new int[]{};
		}
		int pivot = arr[arr.length - 1];

		ArrayList<Integer> gtArr = new ArrayList<>(0);
		ArrayList<Integer> ltArr = new ArrayList<>(0);

		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > pivot) {
				gtArr.add(arr[i]);
			} else {
				ltArr.add(arr[i]);
			}
		}

		int[] gtArrR = quickSort(convertIntegers(gtArr));
		if(gtArrR != null) {
			gtArr.clear();
			for (int j : gtArrR) {
				gtArr.add(j);
			}
		}

		int[] ltArrR = quickSort(convertIntegers(ltArr));
		if(ltArrR != null) {
			ltArr.clear();
			for(int j : ltArrR) {
				ltArr.add(j);
			}
		}

		ltArr.add(pivot);
		ltArr.addAll(gtArr);
		return convertIntegers(ltArr);
	}

	public static int[] convertIntegers(List<Integer> integers) {
		int[] ret = new int[integers.size()];
		for (int i=0; i < ret.length; i++)
		{
			ret[i] = integers.get(i);
		}
		return ret;
	}
}
