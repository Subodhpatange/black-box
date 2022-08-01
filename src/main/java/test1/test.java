package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ThreadGuard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		Thread.sleep(2000);
		driver.findElement(By.name("		driver.findElement(By.name(\"//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '][1]\")).click();")).click();
		driver.findElement(By.name("//input[@aria-label='Phone number, username, or email']")).sendKeys("tejas");
		Thread.sleep(2000);
		driver.findElement(By.name("//input[@aria-label='Pa6+ssword']")).sendKeys("6464");
		Thread.sleep(2000);
		
		
	}

}
