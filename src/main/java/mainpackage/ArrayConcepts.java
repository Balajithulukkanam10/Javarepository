package mainpackage;

public class ArrayConcepts {

	public static void main(String[] args) {
		methodArray();

	}
	public static void methodArray() {
//		int arr;
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		System.out.println(arr[3]);
		for (int a =0; a <= arr.length; a++) {
			System.out.print(a);
//			System.out.println();
//			if(a==5) 
//			System.out.println("if printed");
////			break;
		}
//		for (int eachValueOfarr : arr) {
//			System.out.println(eachValueOfarr);
//		}
//		
		
	}
}
