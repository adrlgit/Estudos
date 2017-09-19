package com.andre.array;

public class MaximumTest {

	public static void main(String[] args) {
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // supoe que x � inicialmente maior

		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0) 
			max = z;

		return max;
	}
}
