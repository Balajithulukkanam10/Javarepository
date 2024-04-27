package inheritanceInJava;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interactive;
import org.openqa.selenium.virtualauthenticator.HasVirtualAuthenticator;

public class A3Multiple {
//public class Multiple extends ClassAA, ClassAB {

}

class ClassAA {

}

class ClassAB {

}

interface InterA {

}

interface InterB {

}

interface InterC extends InterA, InterB {

}

class ClassBA implements InterA, InterB, InterC {

}

//class ClassCA implements InterA, InterB, InterC extends ClassAA {
//	
//}

class ClassCA extends ClassAA implements InterA, InterB, InterC {

}

//class ClassCA extends ClassAA, ClassAB implements InterA, InterB, InterC  {
//
//}

class Example {
	WebDriver driver = new ChromeDriver();
//	WebDriver - Reference parent interface 
//	ChromeDriver - Class for which we created obj
	
	ChromeDriver driver1 = new ChromeDriver();
//	ChromeDriver - reference Class
//	ChromeDriver - Class for which we created obj
	
	
//	RemoteWebDriver driver2 = new ChromeDriver();
	
//	MultiLevel Inheritance 
//		Exception extends Throwable
//		Throwable implements Serializable
	
//	Multiple Inheritance
//		public class RemoteWebDriver
//    		implements WebDriver,
//        JavascriptExecutor,
//        HasCapabilities,
//        HasVirtualAuthenticator,
//        Interactive,
//        PrintsPage,
//        TakesScreenshot {
	
//	public class ArrayList<E> extends AbstractList<E>
//    implements List<E>, RandomAccess, Cloneable, java.io.Serializable
	
}
