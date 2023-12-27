package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL2"})
	@Test
	public void WebLoginHomeLoan(String urlname) {
		// selenium
		System.out.println("WebloginHome");
		System.out.println(urlname);
	}

	@Test(groups= {"smoke"})
	public void MobileLoginHomeLoan() {
		// Appium
		System.out.println("MobileloginHome");
	}

	@Test
	public void LoginAPIHomeLoan() {
		// Rest API Automation
		System.out.println("APILoginHome");
	}
}
