package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cursormovements {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver test=new ChromeDriver();
test.navigate().to("http://automationpractice.com/index.php");
test.manage().window().maximize();
WebElement ele=test.findElement(By.xpath("//a[@title='Women']"));
Actions act=new Actions(test);
act.moveToElement(ele).build().perform();
	}

}
