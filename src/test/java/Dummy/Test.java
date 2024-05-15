package Dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {
	
	private int a = 10;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}


class Test1 {
	int aa = 0;
	public void method1() {
//		System.out.println(a);
		Test test = new Test();
		test.getA();
		
		int c = test.getA();
		aa = test.getA();
	}
	
	public void method2() {
		Test test = new Test();
		test.setA(100);
	}
}


