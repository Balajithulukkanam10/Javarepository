package mainpackage;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 20, 40, 60, 5 };

	}

	int array1[] = { 10, 40, 20, 60, 5 };
	int array2[] = { 10, 40, 20, 60, 5 };
	int array3[] = { 70, 40, 20, 80, 10 };
	int array4[] = { 10, 50, 30, 20, 40 };
	int array5[] = { 10, 20, 60, 5 };
	
	public void compareTwoArrays() {
		System.out.println(Arrays.compare(array2, array1));
		System.out.println(Arrays.compare(array3, array5));
	}

}
