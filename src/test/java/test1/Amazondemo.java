package test1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazondemo {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/ref=nav_logo");
driver.manage().window().maximize();

driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]")).click();

driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys("9822178818");
driver.findElement(By.xpath("//input[@type='submit']")).click();

driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tejas@16");
driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobile");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();


	}


