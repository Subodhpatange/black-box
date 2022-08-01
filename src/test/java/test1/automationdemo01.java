package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ThreadGuard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationdemo01 {




	

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/user/Desktop/demotest.html");
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("tejas");
	driver.findElement(By.name("pw")).sendKeys("12345");
	Thread.sleep(2000);
	
	

	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().forward();

		
		
		
	}
}