package mainpackage;


public class PublicClass {
	int a = 5;
	static int b = 0;
	public static void main(String[] args) {
		PublicClass obj = new PublicClass();
		System.out.println(obj.a);
		int a = 10;
		System.out.println(a);
		
		System.out.println(b);
		
		int c = 20;
	}
	
	public void method1() {
//		System.out.println(c);
	}
	
		
	}

