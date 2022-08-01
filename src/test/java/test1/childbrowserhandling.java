package test1;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childbrowserhandling {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
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
				Thread.sleep(2000);
				driver.close();
			}
		}
		
	
		
				

	}

}
