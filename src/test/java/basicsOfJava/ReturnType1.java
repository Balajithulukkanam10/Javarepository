package basicsOfJava;

public class ReturnType1 {
	
	public static void main(String[] args) {
		ReturnType1 obj = new ReturnType1();
		obj.buyRice();
		
		obj.buySoapp(20);
		
		String soapName = obj.buySoap(10);
		System.out.println(soapName);
		
		System.out.println(obj.buySoap("Hamam"));
//		System.out.println("Hamam");
		
		obj.buy10RupeesSoap(100);
		System.out.println(obj.buySoapAndGiveBalanceAmount(100, 10));
		System.out.println(obj.buySoapAndGiveSoapBack(100, 10));
		
	}
	
	public void buyRice() {
		System.out.println("Bought rice");
	}
	
	
	public void buySoapp(int soapAmount) {
		System.out.println("Buy "+soapAmount+" rupees soaps");
	}
	
	
	public String buySoap(int soapAmount)  {
		
		String soapName = "Lux";
//		return "Lux";
//		return "null";
//		return null;
//		return "";
//		return "    ";
		return soapName;
	}
	
	public String buySoap(String soapName) {
		return soapName;
	}
	
	public int buy10RupeesSoap(int givenAmount) {
		System.out.println("Bought 10 rupees soap");
		int balance = givenAmount - 10;
		System.out.println("Balance amount is "+balance);
		return balance;
	}
	
	public int buySoapAndGiveBalanceAmount(int givenAmount, int soapAmount) {
		int balance = givenAmount - soapAmount;
		System.out.println("Balance amount is "+balance);
		return balance;
	}
	
	public String buySoapAndGiveSoapBack(int givenAmount, int soapAmount) {
//		int balance = givenAmount - soapAmount;
//		System.out.println("Balance amount is "+balance);
//		return balance;
		
		String soapName = "Lux"; //bought soap in shop
		return soapName;
	}
	
	
	
}
