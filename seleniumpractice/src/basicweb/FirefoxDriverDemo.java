package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {
public static String URL = "http://www.yahoo.com";
public static String userName = "monpacbell";
public static String userPassword = "usendit1";

	public static void main(String[] args) {
		boolean A = false;
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\myles\\Downloads\\Development\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		
		//Clear cookies
		driver.manage().deleteCookieNamed("*yahoo*");
		driver.get(URL);
		driver.findElement(By.id("uh-signin")).click();
		
		//Username
		driver.findElement(By.id("login-username")).sendKeys(userName);
		if (driver.findElement(By.xpath("//*[@id=\"persistent\"]")).isSelected() && A)
		{
			System.out.println("It was selected");
			//driver.findElement(By.id("persistent")).click();
			driver.findElement(By.xpath("//*[@id=\"persistent\"]")).click();
		}
		driver.findElement(By.id("login-signin")).click();
		
		//Password
		driver.findElement(By.id("login-passwd")).sendKeys(userPassword);
		driver.findElement(By.id("login-signin")).click();
	
		//driver.findElement(By.id("yui_3_18_0_3_1520839065750_1010")).click();
		driver.findElement(By.id("uh-signout")).click();
		
		//driver.close();
	}
}
