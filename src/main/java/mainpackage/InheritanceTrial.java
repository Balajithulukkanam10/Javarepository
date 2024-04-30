package mainpackage;

public class InheritanceTrial extends Test{
	int b = 10;
	String Str = "Class Variable";
	
	public static void main(String[] args) {
		 InheritanceTrial obj = new InheritanceTrial();
//		NewMeth2("Method");
//		super.method1();
		obj.newMeth1();
//		super.meth4();
		
	}
	 public void method1() {
		 System.out.println("this is child class method");
	} 
	 public void newMeth1() {
		 Test obj1 = new InheritanceTrial();
//			NewMeth2("Method");
		 	this.method1();
		 	obj1.method1();
			super.method1();
			System.out.println(this.b);
			System.out.println(super.b);
			
//			obj.newMeth1();
//			super.meth4();
			
		 	}
	 static String NewMeth2(String abc) {
		
		 System.out.println("Hello");
		 return abc;
	 }
	 void MethodwithoutBody() {
		 
	 }
}

 class Test{
	 int b = 20;
	 public void method1() {
		 System.out.println("this is parent class method");
		 
	 }
	public void meth6() {
		
	}
	
}
