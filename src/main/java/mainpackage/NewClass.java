package mainpackage;

import java.lang.reflect.Method;

public class NewClass {
	
	int aa = 20;
	static int bb = 30;
	
	public NewClass() {
		int a = 10;
//		static String str = "aa";
		
		System.out.println(bb);
		
		System.out.println(aa);
		
		NewClass NC = new NewClass();
		System.out.println(NC.aa);
		
	}
	
	public static void main(String[] args) {
//		ClassAA obj = new ClassAA();
//		obj.NewMethod1();
		
		NewClass obj1 = new NewClass();
		obj1.method1();
	}
	
	public void method1() {
		System.out.println("abc");
	}

}

class ClassAA {
	
	private ClassAA() {
//		System.out.println(" I am ClassAA Constructor");
	}
	
	public void NewMethod1() {
		System.out.println("ClassAA method");
		
//	By
//	Arrays
	}
	
	

}
