package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver test=new ChromeDriver();
		test.navigate().to("http://www.leafground.com/pages/drag.html");
		test.manage().window().maximize();
		WebElement source=test.findElement(By.id("draggable"));
		
		WebElement tar=test.findElement(By.id("content"));
		Actions act=new Actions(test);
		//act.clickAndHold(source).moveToElement(tar).release().build().perform();
		act.dragAndDrop(source, tar);
	}

}
