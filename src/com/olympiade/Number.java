package com.olympiade;

import java.util.ArrayList;

public class Number {
	public static long backwards(long num) {
		Integer[] digits = toDigits(num);

		long out = 0;
		int digit = 1;
		for(int i = digits.length - 1; i >= 0; i--) {
			out += (long) digits[i] * digit;
			digit *= 10;
		}
		return out;
	}

	public static int checksum(long num) {
		Integer[] digits = toDigits(num);
		int sum = 0;
		for(int digit : digits) {
			sum += digit;
		}
		return sum;
	}

	public static long powerOf(int base, int exponent) {
		long res = base;
		for(int i = 1; i < exponent; i++) {
			res *= base;
		}
		return res;
	}

	public static Integer[] toDigits(long num) {
		ArrayList<Integer> arr = new ArrayList<>(1);

		while(num > 0) {
			arr.add((int) num % 10);
			num /= 10;
		}

		return arr.toArray(new Integer[0]);
	}
}
