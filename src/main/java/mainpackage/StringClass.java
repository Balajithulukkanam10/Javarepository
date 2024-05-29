package mainpackage;

public class StringClass {

	public static void main(String[] args) {
		StringClass obj = new StringClass();
		obj.stringMethods();
	}
public void stringMethods() {
	String str = "Sathya"; 
	String str1 = "Sathya";
	String str2 = "SATHYA";
	String str3 = "Shiva";
	String str4 ="";
	
//	To check the length of the string
	System.out.println("*****\"length\"********");
	int length = str.length();
	System.out.println(length);
	
//	To check the string is empty or not
	System.out.println("*******Empty*********");
	System.out.println(str4.isEmpty());
	boolean isEmpty = str3.isEmpty();
	System.out.println(isEmpty);
	
//	To Check the Character in String
	
	System.out.println("******character*******");
	System.out.println(str2.charAt(4));
	
//	To Check the two strings are equal
	
	System.out.println("********equals********");
	System.out.println(str.equals(str4));
	boolean equal = str1.equals(str2);
	System.out.println(equal);
	
//	To Check the two strings are equal using ignore 
	System.out.println("*********equalsIgnoreCase*********");
	System.out.println(str1.equalsIgnoreCase(str2));
//	To check the compare to between two strings
	System.out.println("**compareTo**");
	String s1 = "Hi this is Shiva";
	String s2 = "hi this is Shiva";
	String s3 = "Me this is Shiva";
	String s4 = "Hi this is Shiva";
	String s5 = "hi this is Shiva";
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
	System.out.println(s3.compareTo(s1));
	System.out.println(s1.compareTo(s4));
	System.out.println(s2.compareTo(s5));
	System.out.println("*********compareToIgnoreCase*********");
	System.out.println(s1.compareToIgnoreCase(s2));
	System.out.println(s1.compareToIgnoreCase(s3));
	System.out.println(s3.compareToIgnoreCase(s1));
	System.out.println("******startsWith*******");
	String a = "Swift Message";
	System.out.println(a.startsWith("Sw"));
	System.out.println(a.startsWith("Me"));
	System.out.println("*******endsWith*******");
	System.out.println(a.endsWith("ge"));
	System.out.println(a.endsWith("ft"));
}

}
