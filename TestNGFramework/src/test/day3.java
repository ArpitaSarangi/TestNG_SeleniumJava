package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
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

	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebLoginCarLoan(String urlname,String key) {
		// selenium
		System.out.println("Weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}

	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("I will execute before every test method in day3 class");
	}

	@Test(groups = { "smoke" })
	public void MobileLoginCarLoan() {
		// Appium
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

	@Test(enabled = false)
	public void MobileSigninCarLoan() {
		// Appium
		System.out.println("Mobile SIGNIN");
	}

	@Test(dataProvider="getData")
	public void MobileSignoutCarLoan(String username,String password) {
		// Appium
		System.out.println("MobileSignoutCar");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(dependsOnMethods = { "WebLoginCarLoan", "MobileSignoutCarLoan" })
	public void APICarLoan() {
		// Rest API Automation
		System.out.println("APILoginCar");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - username with password - Good redit history
		//2nd combination - username with password -no credit history
		//3rd combination - fraudelent credit history
		Object[][] data=new Object[3][2];
		
		//1st DataSet
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd DataSet
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd DataSet
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
		
	}
	
}
