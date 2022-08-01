package testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_1 { 
	WebDriver driver;
	
@BeforeSuite 

public void BS() {
	System.out.println("BS");
}
@BeforeTest
public void BT() {
	System.out.println("BT");
}
@BeforeClass
public void BC () {
	System.out.println("BC");
}
@BeforeMethod
public void BM() {
	WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
     driver.get("https://www.facebook.com/login/");
     driver.manage().window().maximize();
}
@Test
public void test() {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tejas@11");

	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
@Test
public void test2() throws Exception {
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	String ParentwindAdd=driver.getWindowHandle();
	System.out.println(ParentwindAdd);
	driver.findElement(By.xpath("//a[@target='_blank']")).click();
	Set<String>allAddress=driver.getWindowHandles();
	System.out.print(allAddress);
	Iterator<String>it=allAddress.iterator();
	
	while(it.hasNext()) {
		String childwindowadress=it.next();
		driver.switchTo().window(childwindowadress);
		
		if(!ParentwindAdd.equals(childwindowadress)) {
			driver.switchTo().window(childwindowadress);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("tejas@123");
			driver.quit();
}
		}
	}
@Test
public void test3() {
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("tejas");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("patange");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9846413303");
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tejas@123.gmail.com");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Aurangabad");
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("maharashtra");
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("431001");

	WebElement drop_country=driver.findElement(By.xpath("//input[@name='country']"));
	Select sel=new Select(drop_country);
	sel.selectByValue("INDIA");
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tejas@123");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
	
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("12345");
	 
	
	
	
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	
	
	driver.close();

}
@AfterMethod
public void AM() {
	System.out.println("Am");
	driver.quit();
}
@AfterClass
public void AC() {
	System.out.println("AC");
}
@AfterTest
public void AT() {
	System.out.println("AT");
}
@AfterSuite
public void As() {
	System.out.println("as");
}
}
