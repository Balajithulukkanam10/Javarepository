package Dummy;

public class Test {

	public void buySoap() {

	}

	public void buySoap(int soapAmount) {

	}

	public void buySoap(String soapName) {

	}

	public void buySoap(int soapAmount, String soapName) {

	}

	public void buySoap(String soapName, int soapAmount) {

	}

	public static void buyRice() {

	}

	public static void buyRice(int a) {

	}

	public void buyShampoo() {

	}

//	public String buyShampoo() {
//		
//	}

	public String buyShampoo(int a) {
		return null;
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.buySoap();
		obj.buySoap(10);
		obj.buySoap("abc");
		obj.buySoap(0, null);
		obj.buySoap(null, 0);

		buyRice();
		buyRice(10);

		obj.buyShampoo();
	}

}

// Overload
//	* Happens within a class
//	* based on method signature, where
//		* method name should be same
//		* but parameter should be differ, based on
//			* no. of parameter
//			* type of parameter
//			* order of parameter

// Override
