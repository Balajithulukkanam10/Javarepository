package mainpackage;

public class PublicClass extends ReturnType {
	
	int a = 5;
	static int b = 50;
	public static void main(String[] args) {
		PublicClass obj = new PublicClass();
//		System.out.println(obj.a);
//		int a = 10;
//		int b = 20;
//		System.out.println(a);
//		System.out.println(b);
//		obj.method1();
//		int c = 20;
		obj.ExtendedMethod();
	}

	public void method1() {
		int c = 9;
		System.out.println(c);
		System.out.println(b);
	}
	public void method() {
		int c =10;
		System.out.println(c);
		// TODO Auto-generated method stub

	}
	
	public static void ExtendedMethod() {
		PublicClass obj1 = new PublicClass();
		System.out.println(obj1.zz);
		System.out.println(abc);
	}
		
	}
