package mainpackage;

public class ThisAndSuper {
	static String aa = "10";
	String abc = "231";
	static int c = 30;
	
	ThisAndSuper(){
//		this(abc);
//		this(aa);
		this(c);
	}
	public ThisAndSuper(String abc) {
		
	}
	public ThisAndSuper(int b) {
		
	}
	
//	public ThisAndSuper(String abc2) {
//		
//	}
	public static void main(String[] args) {
		ThisAndSuper obj = new ThisAndSuper();
		obj.method1();
	}
	
	public void method1() {
		System.out.println("test meth 1");
//		method2();
		this.method2();
		
		System.out.println(this.a);
		
	}
	public void method2() {
		
	System.out.println("this is meth 2");
		
	}
	public void method3(int a) {
		this.a = a;
		a = this.a;
		
		
		System.out.println(this.a);
	
	}
	
	public void method4() {
		int a = 100;
		System.out.println(this.a);
	}
	
	public static void meth4() {
//		meth5();
		meth5();
		
		
	}
	public static void meth5() {
		
	}
}
