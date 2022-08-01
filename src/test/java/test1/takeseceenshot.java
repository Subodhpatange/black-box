package test1;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class takeseceenshot {

	public static void main(String[] args) throws Exception {
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.instagram.com/accounts/login/");
  driver.manage().window().maximize();
  String path="C:\\Users\\user\\eclipse-workspace\\test1\\screenshot";
  TakesScreenshot ts=(TakesScreenshot)driver;
  File src=ts.getScreenshotAs(OutputType.FILE);
  String rm=RandomString.make(3);
  File destn=new File(path+"\\"+rm+".png");
  FileUtils.copyFile(src, destn);
  driver.close();    
  
	}
public static void getCapture(WebDriver driver) throws Exception{
	String path="C:\\Users\\user\\eclipse-workspace\\test1\\screenshot";
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File src=ts.getScreenshotAs(OutputType.FILE);
	  String rm=RandomString.make(3);
	  File destn=new File(path+"\\"+rm+".png");
	  FileUtils.copyFile(src, destn);
	  driver.close();    
	  
  
	
}
}
