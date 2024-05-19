package mainpackage;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] array = new int[] { 5, 3, 8, 4, 2 };

//		System.out.println("Original array:");
//		printArray(array);

		// Sort the array
//		Arrays.sort(array);
//		sortAnArray();
//		System.out.println("Sorted array:");
//		printArray(array);
//		swappingVariables();
//		printArray(sortAnArray(array));
//		sortAnArray();
//		sortingAnArrayInReverseOrder();
//		findDuplicateValuesInArray();
		duplicateElementsInAnArray();
	}

	// Method to print an array
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void sortAnArray() {
		int[] array = new int[] { 20, 10, 40, 5 };

		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
			for (int j = i + 1; j < array.length; j++) {
//				System.out.print(array[j]+" ");
				if (array[i] > array[j]) {
					int temp = array[i]; // temp = 20;
					array[i] = array[j]; // ar[i] = 10
					array[j] = temp; // ar[j] = 20

				}
//				[10, 20, 40, 5]
//				[5, 20, 40, 10]
//				[5, 10, 40, 20]
//				[5, 10, 20, 40]

			}
//			System.out.println(" ");
//			printArray(array);
		}
		reverseAnyArray(array);

	}

	public static int[] sortAnArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	// Write a method to get values from user
	// store that values in an array
	// This method should retun above array

	public static void sortTheUserGivenArray() {
//		int[] userArray = methodToGetArrayFromUser();

//		sortAnArray(userArray);
	}

	public static void swappingVariables() {
		int a = 10;
		int b = 30;
		System.out.println(a);
		System.out.println(b);

		System.out.println("After swapping");
//		int temp = a;
//		a = b;
////		b = a;
//		b = temp;
		int temp = b;
		b = a;
		a = temp;
		System.out.println(a);
		System.out.println(b);

	}

	public static void reverseAnyArray(int[] array) {
//		int[] ar = {10,20,30,40};

//		for(int i = 0; i<ar.length;i++) {
//			System.out.println(ar[i]);
//		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

	public static void sortingAnArrayInReverseOrder() {
		int[] array = new int[] { 20, 10, 40, 5 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i]; // temp = 20;
					array[i] = array[j]; // ar[i] = 10
					array[j] = temp; // ar[j] = 20

				}

			}
		}
		printArray(array);
	}

	public static void findDuplicateValuesInArray() {
		int[] ar = new int[] { 50, 50, 60, 20, 20};
		sortAnArray(ar);
		printArray(ar);

		// temp variable initiation temp = 0
		// i for loop
		// temp variable check temp ==0
		// j for loop
		// comaring i and j
		// pass - temp = 1
		// break;
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
//			int temp = 0;
			if (temp == 0) {
				for (int j = i + 1; j < ar.length; j++) {
					if (ar[i] == ar[j]) {
						System.out.println(ar[i] + " is duplicate");
						temp = 1;
						break;
					}
				}
			}
		}
	}
	public static void duplicateElementsInAnArray() {
		 //Initialize array   
//        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int[] arr = new int[] { 50, 50, 60, 20, 20};
          sortAnArray(arr);
          printArray(arr);
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[i]);  
            }  
        }  
	}
//	https://www.tutorialgateway.org/java-program-to-count-array-duplicates/
}
