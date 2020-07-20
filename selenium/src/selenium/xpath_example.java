package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpath_example {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement title = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]"));

		title.click();
		WebElement psearch = driver.findElement(By.xpath("//ul[@class='product_list grid row']/li[1]"));
		WebElement product = driver
				.findElement(By.xpath("//ul[@class='product_list grid row']/li[1]/div[1]/div[2]/div[2]/a[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(psearch).click().build().perform();

		act.moveToElement(product).click().build().perform();
		 WebElement ptoadd=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		//WebElement ptoadd = driver.findElement(By.xpath("//div[@class='button-container']/a/span"));

		 Thread.sleep(5000);		
ptoadd.click();
WebElement cardcount=driver.findElement(By.xpath("//input[@class='cart_quantity_input form-control grey']"));
System.out.println("no of product added in cart " + cardcount.getAttribute("value"));
System.out.println(cardcount.isEnabled());
	}

}
