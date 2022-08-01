package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class instalogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")). sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("name=\"password\"")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log In']")).click();

	}

}
