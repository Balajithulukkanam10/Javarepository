package Dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test extends Parent {

	public Test(int a) {
		super(a);
		System.out.println("I am int parameterzied constructor from Test class");
	}

	public Test() {
//		super(); //superOf
		System.out.println("I am default constructor from Test Class");
//		super();
	}

	public Test(String str) {
//		super();
		super(0d);
		System.out.println("I am String parameterzied constructor from Test class");
	}

	public void method1() {
		System.out.println("I am a non static method");
	}

	public void method2(int a) {
		System.out.println("I am int parameterized method");
	}

	public static void main(String[] args) {
//		Test test = new Test();
//		Test test1 = new Test(10);
		Test test2 = new Test("abc");
//		test.method1();
//		
//		test.method2(0);
	}
}

class Parent {

	public Parent() {
		System.out.println("I am parent class default constructor");
	}

	public Parent(int a) {
		System.out.println("I am int parameterized constructor from parent class");
	}

	public Parent(double d) {
		System.out.println("I am double parameterized constructor from parent class");
	}

	public void methodA() {
		System.out.println("I am parent class non-static method");
	}
}

