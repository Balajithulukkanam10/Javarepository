package mainpackage;

public class ExceptionDemo {

	public static void main(String[] args) {
		ExceptionDemo obj = new ExceptionDemo();
//		int a = 10;
//		int b = 0;
//		int c = 30;
//		String bal = "balaji";
//		try {
//			int d = a/b;
//		
//		}
		obj.divide();
		
	}
	public void divide() {
		
		int a = 10;
		int b = 0;
		
		System.out.println(a/b);
		try {
			int c = a/b;
		}
		catch(NullPointerException e ) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Hiiiii");
			System.out.println(e.getLocalizedMessage());
		}
	}
}
