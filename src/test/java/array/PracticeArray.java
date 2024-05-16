package array;

import java.util.Scanner;

public class PracticeArray {
	
	public static void main(String[] args) {
		PracticeArray PA = new PracticeArray();
		PA.getIntArrayFromUser();
	}

	public void main() {
		int a = 10;
		int b = 20;
		int c = 30;
		
//		syntax 
//		dataType[] arrayName = new dataType[3];
		
		int[] arr = new int[3];
//		int arr[] = new int[3];//declaration
		
		arr[0] = 10;
		arr[1] = 20;
//		arr[2] = -30;
//		arr[2] = "30";
//		arr[3] = 40;
		
		System.out.println(arr);
		
		
		int[] arr1 = new int[] {100, 200, 300};
		
		System.out.println(arr1);
		
		System.out.println(arr[0]);
//		System.out.println(arr[3]);
		System.out.println(arr[2]);
		
		System.out.println(arr.length);
		
		int[] clonedArray = arr.clone();
		System.out.println(clonedArray);
		System.out.println(clonedArray.length);
		System.out.println(clonedArray[2]);
		System.out.println(clonedArray[2]>0);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println("Printing all array values one by one");
//		for(int i = 0; i<=arr.length-1; i++) {
		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
			int aa = arr[i];
			System.out.println(aa);
		}
		
//		for(int i = 0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//		
//		for(int i = 0; i<clonedArray.length; i++) {
//			System.out.println(clonedArray[i]);
//		}
		
		PracticeArray obj = new PracticeArray();
		obj.printIntArrayUsingBasicForLoop(arr1);
		
		obj.printIntArrayUsingForEach(arr1);
	}
	
	public void printIntArrayUsingBasicForLoop(int[] myArray) {
		for(int i = 0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public void printIntArrayUsingForEach(int[] arrName) {
		for(int each: arrName) {
			System.out.println(arrName);
		}
	}
	
	public void printStringArray(String[] myArray) {
		for(int i = 0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
	public void printStringArrayUsingForEach(String[] arrName) {
		for(String each: arrName) {
			System.out.println(arrName);
		}
	}
	
	public int intArrayLength(int[] arr) {
//		System.out.println(arr.length);
//		return arr.length;
		int len = arr.length;
		System.out.println(len);
		return len;
	}

	public void cloneIntArray(int arr[]) {
		int ar2[] = arr.clone();
		System.out.println("Cloned array");
		printIntArrayUsingBasicForLoop(ar2);
	}

	public int[] returnAnIntArray() {
		int len[] = { 1, 2, 3, 4, 5 };
		System.out.println(len.length);
		return len;
	}
	
	public int[] cloneAnAnIntArray(int[] arr) {
		int[] ca = arr.clone();
		return ca;
	}

	
	public void checkValuesInTheArrayArePositive() {
		
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = -30;

//		int temp = 0;
		boolean flag = false;
		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//			int aa = arr[i];
//			System.out.println(aa);
			if(arr[i]<0) {
				System.out.println("Atleast one of the values in the given array is negative");
//				temp = 1;
				flag = true;
				break;
			}
		}
//		if(temp ==0)
		if(flag == false)
		System.out.println("all values in the array are positives");
	}

	public void getIntArrayFromUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter int array size: ");

		int arrayS = scan.nextInt();
		
		int arr[] = new int[arrayS];

		System.out.println("Please enter " + arrayS + " numbers");

		for (int i = 0; i < arrayS; i++) {
			arr[i] = scan.nextInt();
		} 

		printIntArrayUsingBasicForLoop(arr);
	}
	
//	HOME WORK
	
	public int[] getIntArrayFromUser(int arrayLength) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter " + arrayLength + " numbers");

		int arr[] = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			arr[i] = scan.nextInt();
		}

		printIntArrayUsingBasicForLoop(arr);

		return arr;
	}

	public int returnSingleValueFromAnIntArray(int[] ar, int index) {
//		int ar[] = new int[3];
//		ar[0] = 10;
//		ar[1] = 20;
//		ar[2] = 30;

		System.out.println(ar[index]);

		return ar[index];

	}

	public int getIntArrayFromUserAndReturnAnIndexValue(int arrayLength, int index) {
		int[] testArray = getIntArrayFromUser(arrayLength);

		try {
//			System.out.println(testArray[index]);
			return testArray[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error message: " + e.getMessage());
			System.out.println("index should be anything less than length " + arrayLength);
			return 0;
		}
//		return testArray[index];
	}
	

	
}
