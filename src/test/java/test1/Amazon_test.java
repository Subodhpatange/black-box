package test1;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_test {

	public static void main(String[] args) throws Exception {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.name("email")).sendKeys("9822178818");
        driver.findElement(By.id("continue")).click();
        
        driver.findElement(By.name("password")).sendKeys("Tejas@16");
        driver.findElement(By.id("signInSubmit")).click();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        String prtwindow=driver.getWindowHandle();
        
        driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
        
        Set<String> All_address=driver.getWindowHandles();
        
        Iterator<String> it=All_address.iterator();
        while(it.hasNext()) {
        	String child_window=it.next();
        	
        	if(!prtwindow.equals(child_window)) {
        		driver.switchTo().window(child_window);
        		
        		driver.findElement(By.name("submit.add-to-cart")).click();
        	}
        }
        
        driver.switchTo().window(prtwindow);
        
        driver.findElement(By.id("nav-cart-count-container")).click();
        
        String path="C:\\Users\\TJIN\\eclipse-workspace\\Hello World\\Vikas1_Project\\Screenshot";
        TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File(path + "//","Addedtocart.png");
        FileUtils.copyFile(src, dest);
        
       driver.findElement(By.xpath("//input[@value='Delete']")).click();
       
       String path1="C:\\Users\\TJIN\\eclipse-workspace\\Hello World\\Vikas1_Project\\Screenshot";
       TakesScreenshot ts1=(TakesScreenshot) driver;
       File src1=ts1.getScreenshotAs(OutputType.FILE);
       File dest1=new File(path1 + "//","deletecart.png");
       FileUtils.copyFile(src1, dest1);
	}

}
