package oraange;

import org.openqa.selenium.WebDriver;

public class facebook {
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver;
		String Facebook_login_ApplicationUrlAddress="https://www.facebook.com/login/";
		
		
		System.setProperty("webdriver.chrome.driver","./Library/new_chrome_driverfile/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(Facebook_login_ApplicationUrlAddress);
		

		
		
		
	}

}
