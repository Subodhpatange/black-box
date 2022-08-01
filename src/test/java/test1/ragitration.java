package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ragitration {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
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

}
