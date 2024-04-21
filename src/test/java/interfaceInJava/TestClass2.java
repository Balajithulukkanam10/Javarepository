package interfaceInJava;

public class TestClass2 implements LearnInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void selfMethod() {
		System.out.println("I am a method from TestClass2");
	}

	@Override
	public void rule1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rule22(int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
	

	public void callingConcreteMethodsOfInterface() {
		LearnInterface.rule2();
		TestClass2 obj = new TestClass2();
		obj.rule3();
		
		LearnInterface obj1 = new TestClass2(); 
//		WebDriver driver = new ChromeDriver();
		obj1.rule3();
//		obj1.test1();
		
		LearnInterface2 obj2 = new TestClass2();
		obj2.test3();
		obj2.test1();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
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
