package constructor;

public class ConstructorCalling extends Parent {

	int a;
	final int b;
	final int c = 20;

	public ConstructorCalling() {
		b = 10;
//		this.b = 0;
		// this(10);
//		this("ab");
		System.out.println("I am a default Constructor");
	}
	
	public ConstructorCalling(int a) {
		b = 20;
		System.out.println("I am int parameterized Constructor");
	}
	
	public ConstructorCalling(String b) {
		this.b = 30;
		System.out.println("I am String parameterized Constructor");
	}

	public static void main(String[] args) {
		ConstructorCalling obj = new ConstructorCalling();
	}

}

class Parent {
	public Parent() {
		System.out.println("I am parent class's default Constructor");
	}

}
