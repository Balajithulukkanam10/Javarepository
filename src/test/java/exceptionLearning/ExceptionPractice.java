package exceptionLearning;

public class ExceptionPractice {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		String str = null;
		
//		if(str.equals("Hello"))
//			System.out.println("1111");
		
		try {
//		int c = a/b;
//		System.out.println(c);
			
			if(str.equals("Hello"))
				System.out.println("1111");
		}
		
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		catch(ArithmeticException AE) {
			System.out.println(AE.getMessage());
//			System.out.println("Your divider is zero");
		}
		
		catch(NullPointerException NPE) {
			System.out.println("I caught your \"NullPointException\", now rest of your code will run");
		}
//		
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
		finally {
			System.out.println("I always run");
		}
		
		System.out.println("hello");
	}
	
	
	public void method1() {

		int a = 10;
		int b = 0; 
		
		try {
		System.out.println(a/b);
		}
		
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("Hello");
//		}
		
		catch(NullPointerException e ) {
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
			System.out.println("Hiiiii");
			System.out.println(e.getLocalizedMessage());
		}
		
		finally {
			System.out.println("I always run");
		}
		
		System.out.println("The division operation worked fine");
	
	}


}
