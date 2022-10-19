package chinna.fratello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	WebDriver driver=null;
	@BeforeTest
	public void open_fb() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void open_Redbus()throws InterruptedException {
	}
	driver.get("http://www.Redbus.in/");
	String expected_title="redbus";
	Thread.sleep(1000);
	driver.findElement(By.class("db")).sendkeys("KPHB,HYDERABAD");
	driver.findElement(By.id("dest")).sendkeys("Atmakur(k)");
	driver.findElement(By.id("onward_cal").click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]")).click();
	driver.findElement(By.id("search_btn")).click();
	Thread.sleep(1000);
	

		
	}
