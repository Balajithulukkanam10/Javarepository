package mainpackage;

public class LoopConcepts {

	public static void main(String[] args) {
//		simpleStarPattern();
//	for (i = 0; i<10; i++) {
//			System.out.println("A");
//		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <=i; j++){
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	public static void simpleStarPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
	}
	}
