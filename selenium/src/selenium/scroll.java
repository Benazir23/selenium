package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('txtUsername').setAttribute('value','Admin');");
		//js.executeScript("document.getElementById('txtPassword').setAttribute('value','admin123');");
		//WebElement submit=driver.findElement(By.id("btnLogin"));
		//js.executeScript("arguments[0].click()",submit);
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement a=driver.findElement(By.id("awf_field-91977689"));
		js.executeScript("arguments[0].scrollIntoView(true);", a);
		
		
		
	

		
	}

}
