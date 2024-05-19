package mainpackage;

public class OverloadingPractice {

	public static void jioCinema() {
		System.out.println("Normal method");
	}

//	public String jioCinema() {
//		return null;
//		
//	}
	public static int jioCinema(String ipl) {
		String ipl1 = "IPL";
		System.out.println(ipl1);
		return 10;
	}

	public static void jioCinema(int year) {
		System.out.println("int parameterized method");
	}
	
	public static int jioCinema(String ipl, int year) {
		System.out.println(ipl +" - " + year);
		return 0;
	}
	
	public static void main(String[] args) {
		OverloadingPractice obj = new OverloadingPractice();
		obj.jioCinema("IPL2024");
	
	}
}
