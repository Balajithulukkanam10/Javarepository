package inheritanceInJava;

//public class Multiple extends ClassA, ClassB {
public class A2MultiLevel extends ClassA {

	public void method3() {

	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		ClassB obj1 = new ClassB();

		A2MultiLevel obj2 = new A2MultiLevel();
		obj2.method1();
		obj2.method2();
		obj2.method3();

	}
}

class ClassA extends ClassB {
	public void method1() {

	}
}

//class ClassB extends Multiple {
class ClassB {
	public void method2() {

	}
}
