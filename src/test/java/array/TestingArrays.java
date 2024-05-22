package array;

import java.util.Arrays;

//* Arrays is a utility class to manipulate array or arrays
//* Arrays class has only one constructor which is private. So we cant create object for this class.
//* Since Arrays constructor is private, all the methods in this class are created as static
//* Important methods of Arrays Class
//		* sort(arrayName);
//		* sort(arrayName, startIndex, endIndex);
//		* parallelSort();
//		* equals(array1, array2);
//		* compare(array1, array2);
//		* copyOf(arrayName, length);
//		* copyOfRange(arrayName, startIndex, endIndex);
//		* fill(arrayName, valueToBeFilled);
//		* mismatch(array1, array2);

public class TestingArrays {

	public static void main(String[] args) {
		TestingArrays obj = new TestingArrays();
//		Arrays obj = new Arrays();

		int ar[] = { 10, 50, 30, 20, 40 };

//		String
<<<<<<< HEAD

//		PracticeArray obj = new PracticeArray();
//		obj.printIntArrayUsingForEach(ar);

//		Arrays.sort(ar);
//		obj.printIntArrayUsingForEach(ar);

=======
		
		PracticeArray obj = new PracticeArray();
		obj.printIntArrayUsingForEach(ar);
		
//		Arrays.sort(ar);
//		obj.printIntArrayUsingForEach(ar);
		
>>>>>>> 99dc42c94c7541f2e4c336c8b1418403d74521b3
//		Arrays.sort(ar, 1, 4);
//		Arrays.sort(ar, 3, 5);
//		Arrays.sort(ar, 3, 6);
//		obj.printIntArrayUsingForEach(ar);
<<<<<<< HEAD

		int ar1[] = { 10, 50, 30, 20, 40 };
		int ar2[] = { 10, 20, 30, 40, 50 };
		int ar3[] = { 10, 20, 30, 40, 50 };
		int ar4[] = { 30, 20 };
		int ar5[] = { 20, 30, 50 };
		obj.findArraysMismatch();
//		System.out.println("********equals*************");
//		boolean checkTwoArraysAreEqual = Arrays.equals(ar1, ar2);
//		System.out.println(checkTwoArraysAreEqual);
//
//		System.out.println("********compare*************");
//		System.out.println(Arrays.compare(ar3, ar2));
//		System.out.println(Arrays.compare(ar1, ar2));
//		System.out.println(Arrays.compare(ar4, ar5));
//
//		System.out.println("********copyOf*************");
//		int[] copiedArray = Arrays.copyOf(ar1, 3);
//		obj.printIntArrayUsingForEach(copiedArray);
//
//		System.out.println("********copyOfRange*************");
//		int[] copiedArrayWithRange = Arrays.copyOfRange(ar1, 1, 4);
//		obj.printIntArrayUsingForEach(copiedArrayWithRange);
//
//		System.out.println("********fill*************");
//		Arrays.fill(ar1, 100);
//		obj.printIntArrayUsingForEach(ar1);
//
//		System.out.println("********mismatch*************");
//		System.out.println(Arrays.mismatch(ar1, ar2));

	}

	public void reverseAnArray() {

		int ar[] = { 10, 50, 30, 20, 40 };
//		50,  40, 30, 20, 10

		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.println(ar[i]);
		}

	}

	public void printNormalArray(boolean checkTwoArraysAreEqual) {
		int arr[] = { 10, 50, 30, 20, 40 };
		for (int i = arr.length - 1; i >= 0; i++) {
			System.out.println(arr[i]);
		}
	}

	public void printArraysEqual() {
		TestingArrays obj1 = new TestingArrays();
		int ar1[] = { 10, 50, 30, 20, 40 };
		int ar2[] = { 10, 20, 30, 40, 50 };
		int ar3[] = { 10, 20, 30, 40, 50 };
		int ar4[] = { 30, 20 };
		int ar5[] = { 20, 30, 50 };

		System.out.println("********equals*************");
		boolean checkTwoArraysAreEqual = Arrays.equals(ar1, ar2);
		System.out.println(checkTwoArraysAreEqual);
//		obj1.printNormalArray(checkTwoArraysAreEqual);
	}

	public void compareTwoArrays() {
		int ar1[] = { 10, 50, 30, 20, 40 };
		int ar2[] = { 10, 20, 30, 40, 50 };
		int ar3[] = { 10, 20, 30, 40, 50 };
		int ar4[] = { 30, 20 };
		int ar5[] = { 20, 30, 50 };
=======
		
		int ar1[] = {10, 50, 30, 20, 40};
		int ar2[] = {10, 20, 30, 40, 50};
		int ar3[] = {10, 20, 30, 40, 50};
		int ar4[] = {30, 20, 100};//{30, 20};
		int ar5[] = {30, 20, 50};
		
		System.out.println("********equals*************");
		boolean checkTwoArraysAreEqual = Arrays.equals(ar1, ar2);
		System.out.println(checkTwoArraysAreEqual);
		
		System.out.println(Arrays.equals(ar2, ar3));
		
>>>>>>> 99dc42c94c7541f2e4c336c8b1418403d74521b3
		System.out.println("********compare*************");
		System.out.println(Arrays.compare(ar4, ar5));
<<<<<<< HEAD
		System.out.println(Arrays.compare(ar3, ar1));
=======
		System.out.println(Arrays.compare(ar5, ar4));
		
		System.out.println("********copyOf*************");
		int[] copiedArray = Arrays.copyOf(ar1, 3);
		obj.printIntArrayUsingForEach(copiedArray);
		
		
		System.out.println("********copyOfRange*************");
		int[] copiedArrayWithRange = Arrays.copyOfRange(ar1, 1, 4);
		obj.printIntArrayUsingForEach(copiedArrayWithRange);
		
		
		System.out.println("********fill*************");
		Arrays.fill(ar1, 100);
		obj.printIntArrayUsingForEach(ar1);
		
		System.out.println("********mismatch*************");
		System.out.println(Arrays.mismatch(ar1, ar2));
		System.out.println(Arrays.mismatch(ar3, ar2));
		
		
		
>>>>>>> 99dc42c94c7541f2e4c336c8b1418403d74521b3
	}
	public void findArraysMismatch() {
		int ar2[] = { 10, 20, 30, 40, 50 };
		int ar3[] = { 10, 20, 30, 40, 50 };
		int ar4[] = { 30, 20 };
		int ar5[] = { 20, 30, 50 };
		System.out.println("**********mismatch*********");
		System.out.println(Arrays.mismatch(ar4, ar5));
		System.out.println(Arrays.mismatch(ar2, ar3));
	}
}
