package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactin {

	public static void main(String[] args)throws Exception{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement login =driver.findElement(By.id("username"));
		login.sendKeys("nasheen1");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("nasheen");
		WebElement submit=driver.findElement(By.id("login"));
		submit.click();
		WebElement location=driver.findElement(By.name("location"));
		Select loc =new Select(location);
		loc.selectByIndex(2);
		
		
		WebElement hotels=driver.findElement(By.name("hotels"));
		Select hotel=new Select(hotels);
		hotel.selectByValue("Hotel Sunshine");
		WebElement room=driver.findElement(By.name("room_type"));
		Select roomtype=new Select(room);
		roomtype.selectByIndex(4);
		WebElement no=driver.findElement(By.name("room_nos"));
		Select roomno =new Select(no);
		roomno.selectByIndex(3);
		WebElement datein=driver.findElement(By.name("datepick_in"));
		datein.sendKeys("27/06/2020");
		WebElement dateout=driver.findElement(By.name("datepick_out"));
		dateout.sendKeys("29/06/2020");
		WebElement a_room=driver.findElement(By.name("adult_room"));
		Select ad_room=new Select(a_room);
		ad_room.selectByIndex(1);
		WebElement c_room=driver.findElement(By.name("child_room"));
		Select ch_room=new Select(c_room);
		ch_room.selectByIndex(0);
		WebElement search=driver.findElement(By.name("Submit"));
		search.click();
		WebElement radiobutton=driver.findElement(By.name("radiobutton_0"));
		radiobutton.click();
		WebElement cont=driver.findElement(By.name("continue"));
		cont.click();
		WebElement fname=driver.findElement(By.name("first_name"));
		fname.sendKeys("Benazir");
		WebElement lname=driver.findElement(By.name("last_name"));
		lname.sendKeys("nasheen");
		WebElement address=driver.findElement(By.id("address"));
		address.sendKeys("Chennai");
		WebElement cardno=driver.findElement(By.name("cc_num"));
		cardno.sendKeys("1234567891234567");
		WebElement cardtype=driver.findElement(By.name("cc_type"));
		Select ctype=new Select(cardtype);
		ctype.selectByIndex(4);
		WebElement cmonth=driver.findElement(By.name("cc_exp_month"));
		Select expmonth=new Select(cmonth);
		expmonth.selectByIndex(5);
		WebElement cyear=driver.findElement(By.name("cc_exp_year"));
		
		Select expyear=new Select(cyear);
		expyear.selectByIndex(6);
	
		
		WebElement ccv=driver.findElement(By.name("cc_cvv"));
		ccv.sendKeys("123");
		WebElement booknow=driver.findElement(By.name("book_now"));
		booknow.click();
		Thread.sleep(10000);
		driver.findElement(By.name("my_itinerary")).click();
		WebElement table=driver.findElement
				 (By.xpath("//form[@name='booked_form']/table[1]/tbody/tr[2]/td/table/tbody"));
		List<WebElement> trows=table.findElements(By.xpath(".//tr"));
		System.out.println("No of rows " + trows.size());
		for(WebElement rows:trows) {
			
			List<WebElement> tdata=rows.findElements(By.xpath(".//td/input"));
			for (WebElement data:tdata) {
								System.out.println(data.getAttribute("value"));
								if(data.getAttribute("value").equals("Cancel 7E1G9BIE50")){
									data.click();
									driver.switchTo().alert().accept();
			}				
			}
			
		}System.out.println("No of rows after deletion  " + trows.size());

	}
}
