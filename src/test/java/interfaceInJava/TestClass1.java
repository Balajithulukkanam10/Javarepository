package interfaceInJava;

public class TestClass1 implements LearnInterface {
	
	int a = 10;
	public String str = "Sathya";
	private int b = 20;
	protected int c = 30;
	
	
	static int a1 = 20;

	public static void main(String[] args) {
		TestClass1 obj = new TestClass1();
		System.out.println(obj.a);
//		obj.rule1();
		obj.method1();
	}

	
	
	public void method1() {
		System.out.println("I am a method from class");
	}



	@Override
	public void rule1() {
		System.out.println("I am a non-static, non parametized method from LeanInterface");
		
	}

	@Override
	public void rule22(int k) {
		System.out.println("I am a non-static, parametized method from LeanInterface");
		
	}



	@Override
	public int method3() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String method4() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void method11() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void method12() {
		// TODO Auto-generated method stub
		
	}


}
