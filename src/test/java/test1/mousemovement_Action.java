package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousemovement_Action {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement target=driver.findElement(By.xpath("//li[@class='placeholder']"));
		Thread.sleep(2000);
		act.dragAndDrop(src, target).build().perform();
		takeseceenshot.getCapture(driver);
		
		
		

	}

}
