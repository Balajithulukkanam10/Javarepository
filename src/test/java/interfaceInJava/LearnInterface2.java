package interfaceInJava;

public interface LearnInterface2 extends LearnInterface {
	
	int s = 100;
	
	public void test1(); 
	
	public void test2();
	
	default public void test3() {
		System.out.println("hello");
	}

}
