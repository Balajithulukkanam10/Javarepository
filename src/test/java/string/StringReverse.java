package string;

public class StringReverse {

	String str = "Balaji";
	static String sentense = "The String class represents character strings. Allstring literals in Java programs, such as \"abc\", are implemented as instances of this class.";

	public static void main(String[] args) {
		StringReverse SR = new StringReverse();
//		SR.reverseAString1(SR.str);

//		SR.reverseAString2(SR.str);

//		String reversedString = SR.reverseAString3(SR.str);
//		System.out.println(reversedString);

//		System.out.println(SR.getLengthOfGivenString(SR.str));
		
//		SR.printEachWordInTheGivenSentence();
		
//		SR.printEachWordInTheGivenSentence(sentense, " ");
		
//		String val = SR.convertGivenStringToLowerCase(SR.str);
//		System.out.println(val);
		
		
		String val1 = SR.convertGivenStringToLowerCase(SR.str).replace("a", "s");
		System.out.println(val1);
	}

	public void reverseAString1(String originalString) {
		originalString.charAt(0);
		originalString.charAt(1);
		originalString.charAt(2);

//		for(int i = 0; i<originalString.length(); i++) {
//			char eachChar  = originalString.charAt(i);
//			System.out.println(eachChar);
//		}
		System.out.println("String reverse method1");
		for (int i = originalString.length() - 1; i >= 0; i--) {
			char eachChar = originalString.charAt(i);
			System.out.println(eachChar);
		}
	}

	public void reverseAString2(String originalString) {
		System.out.println("String reverse method2");

		char[] charArray = originalString.toCharArray();

//		charArray[0];
//		charArray[1];
		String temp = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
//			System.out.println( charArray[i]);
//			System.out.print( charArray[i]);
			temp = temp + charArray[i];
		}
		System.out.println("My reversed String is: " + temp);

	}

	public String reverseAString3(String originalString) {
//		System.out.println("String reverse method3");
//		System.out.println("Sathiyamoorthi Murugesan");

		String[] allLetters = originalString.split("");

		String temp = "";
		for (int i = allLetters.length - 1; i >= 0; i--) {
//				System.out.println(allLetters[i]);
			temp = temp + allLetters[i];
		}
		return temp;
	}

	public int getLengthOfGivenString(String str) {
		return str.length();
	}

	public void printEachWordInTheGivenSentence() {
		String str = "The String class represents character strings. Allstring literals in Java programs, such as \"abc\", are implemented as instances of this class.";
		
		String[] abc = str.split(" ");
		
		for(String eachWord: abc) {
			System.out.println(eachWord);
		}
		
	}
	
	public void printEachWordInTheGivenSentence(String givenString, String criteria) {
		
//		givenString = givenString.replace(".", "");
//		givenString = givenString.replace(",", "");
		
		givenString = givenString.replace(".", "").replace(",", "").toLowerCase();
		
//		System.out.println(givenString.length());
		String[] abc = givenString.split(criteria);
		
		for(String eachWord: abc) {
			System.out.println(eachWord);
		}
	}
	
	public String convertGivenStringToLowerCase(String str) { 
		return str.toLowerCase();
	}
}
