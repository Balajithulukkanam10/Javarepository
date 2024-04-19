package mainpackage;

public class VariableAsParameter {
	int a = 10;
	String str = "Balaji";
	public static void main(String[] args) { // main method
		VariableAsParameter obj = new VariableAsParameter();
//		obj.buySoap();
//		obj.soapQuantity("Hamam");
//		obj.soapAmount(10);
//		obj.soapAmountAndName(10, "Hamam");
		obj.soapAndShampoo(10, "Hamam", 20, "Dove");
	}
	public void buySoap() { //normal method
		
		System.out.println("Bought Hamam Soap");
	}
	public void soapQuantity(String Soapname) { // Given string as a parameter
//		System.out.println("Bought soapName")
		System.out.println("Bought 2 " +Soapname);
		
	}
	public void soapAmount(int Soapprice) {
		System.out.println("Bought " + Soapprice + "Rs Hamam");
	}
	
	public void soapAmountAndName(int soapAmount, String Soapname) {
		System.out.println("Buy "+ soapAmount + "Rs  " + Soapname);
	}
	public void soapAndShampoo(int soapPrice, String SoapName, int ShampooPrice, String ShampooName) {
		System.out.println("Bought " + soapPrice +"Rs " + SoapName +" " + ShampooPrice +"Rs "+ " "+ ShampooName);
	 }
}
