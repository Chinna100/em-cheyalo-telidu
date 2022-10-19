package chinna.fratello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy {
	
	private static final String Chinna = null;
	WebDriver driver=null;
	@BeforeTest
	public void open_browser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
	@Test
	public void open_Dummypoint()throws InterruptedException{
		driver.get("http://www.Dummypoint.com/");
		String expected_title="General Dashboard — DummyPoint";
		Thread.sleep(1000);
		String expected_title1="Selenium Template";
		driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[5]/ul/li[2]/a")).click();
		Thread.sleep(1000);
	 driver.findElement(By.id("name")).sendKeys("Chinna");
	 driver.findElement(By.id("email")).sendKeys("chinnarayuduyadav@gmail.com");
	 driver.findElement(By.id("g")).click();
	 driver.findElement(By.id("tech")).sendKeys("Java");
	 driver.findElement(By.id("message")).sendKeys("hi");
	 driver.findElement(By.id("captcha")).sendKeys("SGH456");
	 driver.findElement(By.id("btnContactUs")).click();
	 Thread.sleep(1000);
	 driver.close();
	 
	 
		
		

		
	}

}
		
		
	


