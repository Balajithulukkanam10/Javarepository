package mainpackage;

public class InheritanceTrial {
	int a = 10;
	String Str = "Class Variable";
	
	public static void main(String[] args) {
		 InheritanceTrial obj = new InheritanceTrial();
		NewMeth2("Method");
//		obj.method1();
		obj.newMeth1();
	}
	 void method1() {

	} 
	 int newMeth1() {
		 System.out.println("non static method");
		 return 1;
		 
		 	}
	 static String NewMeth2(String abc) {
		
		 System.out.println("Hello");
		 return abc;
	 }
	 void MethodwithoutBody() {
		 
	 }
}
