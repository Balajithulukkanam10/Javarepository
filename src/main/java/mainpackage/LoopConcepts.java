package mainpackage;

public class LoopConcepts {

	public static void main(String[] args) {
//		simpleStarPattern();
		IncrementProgram();
//	for (i = 0; i<10; i++) {
//			System.out.println("A");
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <=i; j++){
//			System.out.print("* ");
//		}
//		System.out.println();
//		}
	}
	public static void simpleStarPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
			System.out.print("* ");
			}
			System.out.println(" ");
			if(i!=0) {
			System.out.println("Hello");
			}
			else {
				System.out.println("Else printed");
			}
//			break;
		}
	}
	public static void IncrementProgram() {
//		 for(int i = 0; i<5; i++)
//		 {
//		 System.out.println("Hello");
//		 i++;
//		 }
		for(int i = 0; i<5; i+=2)
		 {
		 System.out.println("Hello");
		 i+=2;
		 }
		
	}
	}
