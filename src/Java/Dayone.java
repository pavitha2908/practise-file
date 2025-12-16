package Java;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Dayone {

	public static void main(String[] args) throws InterruptedException, IOException  {
	
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://adactinhotelapp.com/");
	 
	 WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	 username.sendKeys("pavithak");
	
	 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	 password.sendKeys("Pavitha@29");
	 
	 WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
	 login.click();
	 
	 WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
	 Select a = new Select(location);
	 a.selectByValue("Sydney");
	 
	 
	 WebElement Hotel = driver.findElement(By.name("hotels"));
	 Select b = new Select(Hotel);
	 b.selectByValue("Hotel Sunshine");
	 
	 WebElement type = driver.findElement(By.name("room_type"));
	 Select c = new Select(type);
	 c.selectByVisibleText("Double");
	 
	 WebElement search = driver.findElement(By.name("Submit"));
	 search.click();
	 
	 WebElement button = driver.findElement(By.name("radiobutton_0"));
	 button.click();
	 
	 WebElement continuebutton = driver.findElement(By.name("continue"));
	 continuebutton.click();
	 
	 WebElement name = driver.findElement(By.name("first_name"));
	 name.sendKeys("xxxx");
	 
	 WebElement last = driver.findElement(By.name("last_name"));
	 last.sendKeys("y");
	 
	 WebElement address = driver.findElement(By.name("address"));
	 address.sendKeys("coimbatore");
	 
	 WebElement card = driver.findElement(By.name("cc_num"));
	 card.sendKeys("1234567890123456");
	 
	 WebElement cardtype = driver.findElement(By.name("cc_type"));
	 Select d = new Select(cardtype);
	 d.selectByVisibleText("VISA");
	 
	 WebElement month = driver.findElement(By.name("cc_exp_month"));
	 Select e = new Select(month);
	 e.selectByVisibleText("February");
	 
	 WebElement year = driver.findElement(By.name("cc_exp_year"));
	 Select f = new Select(year);
	 f.selectByValue("2026");
	 
	 
	 WebElement CCV = driver.findElement(By.name("cc_cvv"));
	 CCV.sendKeys("336");
	 
	 
	 WebElement book = driver.findElement(By.name("book_now"));
	 book.click();
	 
	 Thread.sleep(6000);
	 
	 WebElement itinerary = driver.findElement(By.name("my_itinerary"));
	 itinerary.click();
	 
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 File object = ts.getScreenshotAs(OutputType.FILE);
	 File h = new File("C:\\Users\\ADMIN\\eclipse-workspace\\trial\\src\\screenshot\\adactin.png");
	 FileHandler.copy(object, h);
	 
	 WebElement logout = driver.findElement(By.name("logout"));
	 logout.click();
	 
	
	 
	}
}
 