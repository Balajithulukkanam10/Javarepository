package gettersAndSetters;

public class GettersAndSetters {
	
	private int a = 10;
	private int anotherInput;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getAnotherInput() {
		return anotherInput;
	}

	public void setAnotherInput(int anotherInput) {
//		anotherInput = anotherInput;
		this.anotherInput = anotherInput;
	}
	
	public int methodGetter() {
		return a;
	}
	
	public void methodSetter(int any) {
//		this.a = any;
		a = any;
		int c = any;
	}

	public static void main(String[] args) {
		GettersAndSetters obj = new GettersAndSetters();
		System.out.println(obj.a);
		obj.method1();
	}
	
	public void method1() {
		GettersAndSetters obj = new GettersAndSetters();
		System.out.println(obj.a);
	}

}

