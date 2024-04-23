package abstractLearning;

public abstract class ABS {
	
	public int a;
	private int b;
	protected int c;
	int d;
	
	static public int aa;
	static private int bv;
	static protected int cd;
	static int dd;

	public abstract void meth1();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class ABS2 implements inter1 {
	public abstract void meth2();

	public abstract void meth3();

}

abstract class ABS3 implements inter1 {
	public void meth2() {

	}

	public void meth3() {
	}
}

interface inter1 {
	public void meth2();

	public void meth3();
	
	default void meth4() {
		
	}
	
	public static void method6() {
		
	}
	
	public void meth5();
}

class Class1 implements inter1 {

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meth3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meth5() {
		// TODO Auto-generated method stub
		
	}
	
}
