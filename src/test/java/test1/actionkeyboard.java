package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionkeyboard {

	public static void main(String[] args) {
		
        WebElement username= driver.findElement(By.xpath("//input[@name='email']"));
         Actions act=new Actions(driver);
         act.keyDown(username, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
         //passward
         act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
         act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
         driver.findElement(By.xpath("//input[@name='pass']")).click();
         act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
         driver.findElement(By.xpath("//button[@name='login']")).click();
         
         

	

}
}