package array;

public class PracticeArray {

	public static void main(String[] args) {
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
		obj.printIntArray(arr1);
		
		obj.printIntArrayUsingForEach(arr1);
	}
	
	public void printIntArray(int[] myArray) {
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

}
