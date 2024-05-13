package forLoopsInJava;

public class ForLoop {

	public static void main(String[] args) {
		method2(5);

	}

	public static void forLoopPractice() {

//		method1();
//		method1();
//		method1();
//		method1();
//		method1();
//		method1();
//		method1();
//		method1();

//		For loop syntax
//		for(initiation; condition; incremenet/decrement) {
//			
//		}

//		******************************************************************************

//		for(int i = 0; i<10; i++) {
//			method1();
//		}

//		********************************************************************************

//		for(int i = 0; i<10; i++) {
//			System.out.println("AAA");
//			System.out.println(i);
//			int b =20;
//			System.out.println(b);
//		}
////		System.out.println(i);
////		System.out.println(b);
//		System.out.println("we are out of for loop");

//		******************************************************************************

//		int i;
//		int b = 0;
//		int temp = 0;
//		boolean flag = false;
//		for( i = 0; i<10; i++) {
////			System.out.println("AAA");
////			System.out.println(i);
//			b = 20;
////			System.out.println(b);
//		}
//		System.out.println(i);
//		System.out.println(b);
//		System.out.println("we are out of for loop");

//	****************************************************************************
		int value = 10;
		for (int i = 0; i < value; i++) {
			method1();
		}

//	****************************************************************************

		for (int i = 0; i < methodB(); i++) {
			method1();
		}

		int count = methodB();
		for (int i = 0; i < count; i++) {
			method1();
		}

		ForLoop loop = new ForLoop();
		int times = loop.methodA();
		for (int i = 0; i < times; i++) {
			method1();
		}

//	****************************************************************************

	}

	public static void method1() {
		System.out.println("Hello");
	}

	public int methodA() {

		return 10;
	}

	static public int methodB() {
		System.out.println("aaa");
		return 10;
	}

	public static void forLoopToPrintEvenNumbers() {
		for (int i = 0; i < 10; i++) {
//		System.out.println(i);
//		if(i==0) {
//			System.out.println("Hello");
//		}
//		if(i%2 == 0) {
//			System.out.println(i);
//		}

//			if (i != 0 && i % 2 == 0) {
//				System.out.println(i);
//			}

			if (i % 2 == 0) {
				if (i != 0)
					System.out.println(i);
			}
		}

	}

	public static void printlnAndPrint() {

		for (int i = 0; i < 10; i++) {
//			System.out.println("a");
			System.out.print("a");
		}

	}

	public static void nestedForLoop() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
//				System.out.println(j);
				System.out.print(j);
			}
//			System.out.println(i);
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
	
	public static void starLadderPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void forWithContinueKeyword() {
//		for (int i = 1; i <= 10; i++) {
//			if(i != 5)
//			System.out.println(i);
//		}
		
		for (int i = 1; i <= 10; i++) {
			if(i == 5) 
				continue;
			System.out.println(i);
		}
	}
	
	public static void forWithBreakContinueKeyword() {
		
		for (int i = 1; i <= 10; i++) {
			if(i == 5) 
				break;
			System.out.println(i);
		}
	}
	
	public static void method2(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(i);
		}
	}
	

}
