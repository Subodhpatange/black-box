package test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popupalert {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("tejas");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.getText();
		alt.accept();
		driver.close();
		
		

}}
