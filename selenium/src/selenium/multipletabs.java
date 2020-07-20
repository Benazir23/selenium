package selenium;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipletabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html#Tabbed");
		driver.manage().window().maximize();
WebElement a=driver.findElement(By.xpath("//a//button[@class='btn btn-info']" ));
a.click();
String cw=driver.getWindowHandle();
Set<String> aw=driver.getWindowHandles();
List<String> list=new ArrayList<String>();
list.addAll(aw);
driver.switchTo().window(list.get(1));
//driver.close();
driver.switchTo().window(cw);
driver.quit();
System.out.println(driver.getWindowHandles().size());


	}

}
