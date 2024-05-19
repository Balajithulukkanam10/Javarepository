package mainpackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomeWork {

	public static void main(String[] args) {
		int[] ar = new int[4];
		ar[0]= 10;
		ar[1]= 40;
		ar[2]= 30;
		ar[3]= 20;
//		Arrays.sort(ar);
		reverseAnyArray(ar);
//		Scanner();
		
	}
	public static void PrintNormalArray() {
		int[] ar = {10,20,30,40};
		
	
		
//		for(int i = 0; i<ar.length;i++) {
//			System.out.println(ar[i]);
//		}
		for (int i = ar.length - 1; i >= 0; i--) {
            System.out.println(ar[i]);
        }
		
//		System.out.println(ar);
		
//		System.out.println(ar.length);
	}
	public static void Scanner() {
	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter your phone number");
//	int a = scan.nextInt();
//	int b = scan.nextInt();
//	int c = scan.nextInt();
//	if(a>b && a>c) {
//		System.out.println(a + " is big");
//	}
//	else if(b>c) {
//		System.out.println(b + " is bigg");
//	}
//	else 
//		System.out.println(c + " is biggg");
//	
	System.out.println("Enter your username");
	String str = scan.next();
	
	if(str.length() == 8) {
		System.out.println("valid username");
	}
		else
			System.out.println("Invalid username");
	System.out.println("Enter your password");
	String password = scan.next();
	if(password.length() == 10) {
		System.out.println("password is correct and login successful");
	}
	else
		System.out.println("invalid password entered");
	
	System.out.println("Welcome to Homepage");
	
}

//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Please enter how many numbers you want");
//	int size = scanner.nextInt();
//	
////	System.out.println("Please enter "+size+" numbers: ");
////	int userInput = scanner.nextInt();
////	int userInput1 = scanner.nextInt();
////	int userInput2 = scanner.nextInt();
//	
//	for(int i = 1; i<=size; i++) {
//		System.out.println("Please enter number "+i);
//		scanner.nextInt();
//	}
//	scanner.close();	
	public static void reverseAnyArray(int[] array) {
//		int[] ar = {10,20,30,40};
		
	
		
//		for(int i = 0; i<ar.length;i++) {
//			System.out.println(ar[i]);
//		}
		for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

	}
}
