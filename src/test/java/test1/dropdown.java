package test1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
RemoteWebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();
webdriverdropdown=driver.findElement()
	}

}
