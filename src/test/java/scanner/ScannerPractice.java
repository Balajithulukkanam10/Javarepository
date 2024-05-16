package scanner;

import java.io.PrintStream;
import java.util.Scanner;


public class ScannerPractice {
	
	static PrintStream obj;

		public static void main(String[] args) {
			ScannerPractice SP = new ScannerPractice();
			SP.findTheGrealearnScannerOfThreeNumbersGivenByTheUser();
		}

		public void getAnIntValueFromUser() {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Please enter a number: ");
			int userInput = scanner.nextInt();

			System.out.println(userInput + 10);
			scanner.close();
		}

		public void getAnStringValueFromUser() {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Please enter a Username: ");
			String userInput = scanner.next();
			scanner.close();
		}
		
		public void getThreeIntValuesFromUser() {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Please enter 3 numbers: ");
//			int userInput = scanner.nextInt();
//			int userInput1 = scanner.nextInt();
//			int userInput2 = scanner.nextInt();
			
			for(int i = 1; i<=3; i++) {
				System.out.println("Please enter number "+i);
				scanner.nextInt();
			}
			scanner.close();
		}
		
		public void getDynamicNumberOfIntValuesFromUser() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter how many numbers you want");
			int size = scanner.nextInt();
			
//			System.out.println("Please enter "+size+" numbers: ");
//			int userInput = scanner.nextInt();
//			int userInput1 = scanner.nextInt();
//			int userInput2 = scanner.nextInt();
			
			for(int i = 1; i<=size; i++) {
				System.out.println("Please enter number "+i);
				scanner.nextInt();
			}
			scanner.close();	
		}
		
		public void findTheGrealearnScannerOfThreeNumbersGivenByTheUser() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter 3 numbers");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
//			if(a>b) {
//				if(a>c) {
			if(a>b && a>c) {
				System.out.println(a + " is big");
			}
			else if(b>c) {
				System.out.println(b + " is bigg");
			}
			else 
				System.out.println(c + " is biggg");
			
			scan.close();
		}


}
