package com.olympiade;

import java.util.ArrayList;

public class Prime {
	public static Integer[] findPrimes(int max) {
		ArrayList<Integer> primesArr = new ArrayList<>(1);
		for(int i = 2; i <= max; i++) {
			if (isPrime(i)) {
				primesArr.add(i);
			}
		}
		return primesArr.toArray(new Integer[0]);
	}

	public static Integer[] findPrimes(int min, int max) {
		ArrayList<Integer> primesArr = new ArrayList<>(1);
		for(int i = min; i <= max; i++) {
			if (isPrime(i)) {
				primesArr.add(i);
			}
		}
		return primesArr.toArray(new Integer[0]);
	}

	public static boolean isPrime(int n) {
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
