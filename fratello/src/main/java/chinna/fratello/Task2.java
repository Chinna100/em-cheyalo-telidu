package chinna.fratello;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 extends Task1 {
	WebDriver driver=null;
	@BeforeTest
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void open_fratelloinnotech() throws InterruptedException {
		driver.get("http://www.fratelloinnotech.com/");
		String expected_title="Fratello InnoTech : The Best Place For Development and Training";
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a")).click();
		Thread.sleep(1000);
		String expected_title1="Internships";
		String actual_title = driver.findElement(By.xpath("//*[@id=\"ol-about-us\"]/div/div/div/div/div/div[2]/div/div[1]/h2")).getText();
		System.out.println(actual_title);
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("chinna");
		driver.findElement(By.id("rmail")).sendKeys("chinnarayudu@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("7075010064");
		driver.findElement(By.id("address")).sendKeys("KPHB");
		driver.findElement(By.id("college")).sendKeys("Sri Adithya juniour college");
		WebElement d = driver.findElement(By.id("stream"));
		Select stream=new Select(d);
		stream.selectByVisibleText("Btech");
		Thread.sleep(1000);
		WebElement d1=driver.findElement(By.id("technology"));
		Select technology=new Select(d1);
		technology.selectByVisibleText("Java");
		Thread.sleep(1000);
		WebElement d2=driver.findElement(By.id("domain"));
		Select domain=new Select(d2);
		domain.selectByVisibleText("Image Processing");
		Thread.sleep(1000);
		driver.findElement(By.id("skills")).sendKeys("Javascrpit writting");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();
		
	}

}
