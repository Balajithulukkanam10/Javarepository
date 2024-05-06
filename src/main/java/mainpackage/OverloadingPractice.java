package mainpackage;

public class OverloadingPractice {

	public void jioCinema() {
		System.out.println("Normal method");
	}

//	public String jioCinema() {
//		return null;
//		
//	}
	public void jioCinema(String ipl) {
		System.out.println("parameterized method");
	}

	public void jioCinema(int year) {
		System.out.println("int parameterized method");
	}
	
	public void jioCinema(String ipl, int year) {
		System.out.println(ipl +" - " + year);
	}
	
	public static void main(String[] args) {
		OverloadingPractice obj = new OverloadingPractice();
		obj.jioCinema("IPL", 2024);
	
	}
}
