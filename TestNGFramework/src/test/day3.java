package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
@BeforeClass
public void beforeClass() {
	System.out.println("Before executig any method in day3 class");
}
	

@AfterClass
public void afterClass() {
	System.out.println("after executing all methods in day3 class");
}
	@Test
	public void WebLoginCarLoan() {
		//seleium
		System.out.println("Weblogincar");
	}
	
	
	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("I will execute before every test method in day3 class");
	}
	
	@Test(groups= {"smoke"})
	public void MobileLoginCarLoan() {
		//Appium
		System.out.println("MobileloginCar");
	}
	
	@BeforeSuite
	public void BeforSuite() {
	System.out.println("I am no. 1");	
	}
	
	
	@AfterMethod
	public void aftereveryMethod() {
		System.out.println("I will execute after every method in day3 class.");
	}
	
	@Test(enabled=false)
	public void MobileSigninCarLoan() {
		//Appium
		System.out.println("Mobile SIGNIN");
	}
	@Test(timeOut=4000)
	public void MobileSignoutCarLoan() {
		//Appium
		System.out.println("MobileSignoutCar");
	}
	
	@Test(dependsOnMethods={"WebLoginCarLoan","MobileSignoutCarLoan"})
	public void APICarLoan() {
		//Rest API Automation
		System.out.println("APILoginCar");
	}
}
