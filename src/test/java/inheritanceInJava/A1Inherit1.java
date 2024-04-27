package inheritanceInJava;

//public class Inherit1 extends Parent, Unknown {
public class A1Inherit1 extends Parent {

	int a = 10;
	String str = "abc";

	static int b = 20;
	static String val = "123";

	public void method1() {

		System.out.println("");
	}

	public void method2() {

		System.out.println("");
	}

	public static void method3() {

		System.out.println("");
	}

	public static void method4() {

		System.out.println("");
	}
	
	public static void main(String[] args) {
		A1Inherit1 obj = new A1Inherit1();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.method1();
		obj.method2();
		
		obj.method3();
	}
	
	public void executionMethod() {
		A1Inherit1 obj = new A1Inherit1(); //Type1 
		
//		Inherit - reference class
//		Inherit() - Class for which we are creating object
//		new - Java keyword
//		obj - Object name for class Inherit1();
		
		obj.method1();
		obj.method2();
		obj.method5();
		
		
		Parent obj1 = new Parent();//Type 2
		obj1.method5();
		
		
		Parent obj2 = new A1Inherit1(); //Type 3
		obj2.method5();
		
		
//		Inherit1 obj3 = new Parent(); //Type 4
		
		
	}
}

class Parent {
	
	public void method5() {
		System.out.println("I am a non-static method from Parent");
	}
	
	public static void method6() {
		System.out.println("I am a static method from Parent");
	}
	
	public static void main(String[] args) {
		Parent pa = new Parent();
		pa.method5();
		
		A1Inherit1 obj2 = new A1Inherit1();
		obj2.method1();
		
	}
	
}

class Unknown {
	
	public void method7() {
		Parent pa = new Parent();
		pa.method5();
		
		A1Inherit1 obj1 = new A1Inherit1();
		obj1.method1();
		obj1.method5();
		
		Parent obj2 = new A1Inherit1();
		obj1.method5();
		
	}
}























