package mainpackage;

public class FinalKeyword extends ParentNewClass{
	final int b = 20;
	int a = 10;
//	final int c;
//	final int d;

//	public FinalKeyword() {
////		this.d = 0;
////		d = 0;
//
//	}

	public static void main(String[] args) {
		ParentNewClass obj = new FinalKeyword();
		obj.method1();
	}

	void method1() {
		a = 20;
//		b = 30;
		System.out.println("method from child class");
	}

}

class ParentNewClass {

	void method1() {
		System.out.println("method from parent class");
	}
}