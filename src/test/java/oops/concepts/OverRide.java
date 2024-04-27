package oops.concepts;

public class OverRide extends Parent {

	public static void main(String[] args) {
		
		OverRide ride = new OverRide();
		ride.buySoap();
		ride.buyShampoo();
		
		Parent obj = new Parent();
		obj.buySoap();
		
		Parent obj2 = new OverRide();
		obj2.buySoap();
		obj2.buyRice(10);
	}
	
	public void buySoap() {
		System.out.println("Hamam");
	}
	
	public void buyRice() {
		
	}

}

class Parent {
	
	public void buySoap() {
		System.out.println("Lux");
	}
	
	public void buyShampoo() {
		
	}
	
	public void buyRice(int a) {
		
	}
}
