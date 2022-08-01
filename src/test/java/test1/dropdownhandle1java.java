package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownhandle {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	
	WebElement dropcountry=driver.findElement(By.xpath("//select[@name='country']"));
	Select sel =new Select(dropcountry);
	
	sel.selectByValue("ANDORRA");
	Thread.sleep(5000);
	sel.selectByIndex(10);
	Thread.sleep(5000);
	sel.selectByVisibleText("ANGOLA");
	System.out.println(sel.getFirstSelectedOption().getText());
	
	List<WebElement>list=sel.getOptions();
	for(int a=0;a<list.size();a++) {
	String value=list.get(a).getText();
	System.out.println(value);

	
	if(value.equals("LAOS")) {
	sel.selectByVisibleText("LAOS");
		break;
	}
	}
	custom_handleDropdown(dropcountry,"INDIA");

}

	private static void custom_handleDropdown(WebElement dropcountry, String string) {
		// TODO Auto-generated method stub
		Select sel=new Select(dropcountry);
		sel.selectByVisibleText(string);
		
		
		
	
	}
	
}