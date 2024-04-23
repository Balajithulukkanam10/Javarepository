package mainpackage;

public interface InterfaceLearning {

	public interface NewMethod{}

	interface NextMethod{}
	
//	private interface NoBody{}
//	
//	protected interface NoMessage{}
	
	 static void Method() {
		
		int a =10;
		
		String str = "balaji";
		
		char Ani = 'A';
		
				
	}

char[] a = null;
	public void method1(); // method with no return type 
	
	public String Method2(); //method with return type
	
	public void method3(String str, int a);//parameterized method
	
	public String Method4(String str1, int b);// method with return type and parameters
	
	
    public static void method5() {} // method with no return type 
	
	public static String Method6() {
		
		String next = "Test";
		
		return next;
	} //method with return type
	
	public static void method6(String str, int a){}//parameterized method
	
	public static String Method7(String str1, int b) {
		return str1;
		
	}// method with return type and parameters
	
	
}

  interface NewInterface extends InterfaceLearning {
	  
	  
	 public static void TestMethod() {
		 System.out.println();
		 
	 }
 }
