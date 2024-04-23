package mainpackage;


public class ReturnType {
	
//	static String str;
//	static String str1 = "new";
//	public static void main(String[] args) {
//		System.out.println(str);
//		ReturnType obj = new ReturnType();
//		obj.NewMethod();
//		String val = obj.NewMethod();
//		
//	}
//	public String NewMethod() {
//		
//		String test = "Balaji";
////		System.out.println(test);
//		return test;
//	}
	 String zz = "30";
	static String abc = "20";

	public static void main(String[] args) throws InterruptedException {
//		System.out.println(zz);
		ReturnType test = new ReturnType();
//		String val = "200";
//		String val = test.methodWithReturnType();
//		zz = test.methodWithReturnType();
//		System.out.println(zz);
		test.method1("end of the line");
//		test.method2();
//		
//		int aa = test.method3(100);
//		System.out.println(aa);
//		
//		int bb = test.method4(100);
//		System.out.println(bb);
//		
//		System.out.println(test.method4(100));

	}

	public String methodWithReturnType() {
		String test = "Balaji";
		System.out.println("####"+test);
		
//		return null;
//		return "";
//		return "  ";
//		return abc;
//		return "Balaji";
		return test;
//		return "Hello";
//		System.out.println("Abc");
	}
	public String method1(String test) {
		String xx = methodWithReturnType();
		System.out.println("***"+methodWithReturnType());
		System.out.println(xx);
		System.out.println(test);
		return abc;
	}
}
