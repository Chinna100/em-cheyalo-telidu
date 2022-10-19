package chinna.fratello;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	WebDriver driver=null;
	@BeforeTest
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void open_fratelloinnotech()throws InterruptedException {
		
		String expected_title="Fratello InnoTech : The Best Place For Development and Training ";
		driver.get("http://www.fratelloinnotech.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		WebElement d = driver.findElement(By.xpath("//*[@id=\"ol-service\"]/div/div/div/div/div[1]/h2"));
		System.out.println(d);
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Chinna");
		Thread.sleep(1000);
		driver.findElement(By.id("rmail")).sendKeys("chinnaydav100@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("phone")).sendKeys("7075010064");
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.id("service"));
		Select q = new Select(element);
		q.selectByVisibleText("Web Developement");
		Thread.sleep(1000);
		driver.findElement(By.id("desc")).sendKeys("hi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"regbtn\"]")).click();
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(1000);
		driver.close();
	}
	/*@AfterTest
	String exp_title="Fratello InnoTech : The Best Place For Development and Training";throws InterruptedException{
	Thread.sleep(1000);
	driver.close();*/
	
	
}
