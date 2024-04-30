package mainpackage;

public class ConstructorDemo extends ContsructorExtends {
	int a = 10;
	String str = "Hello";
	static int b = 20;
	
	
//	public ConstructorDemo() { //constructor creation
//		
//	}
	ConstructorDemo() { //constructor creation
		System.out.println("constructor from  child class");
	}
	ConstructorDemo(int a){
		System.out.println("Paramaterized constructor from child class");
		
	}
	
	
	public static void main(String[] args) {
		
		ConstructorDemo obj = new ConstructorDemo(0);
		
		ConstructorDemo obj1 = new ConstructorDemo();
		System.out.println("ConstructorDemo");
		method();
		ContsructorExtends obj2 = new ConstructorDemo();
//		obj2.method();
		ContsructorExtends.method();

	}

}
	class ContsructorExtends{
		
		public ContsructorExtends() {
			System.out.println("Constructor from parent class");
		}
		public ContsructorExtends(int a) {
			
		}
		
		 static void method() {
			 System.out.println("method from parent class");
		}
	}
