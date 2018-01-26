package cliniops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cliniops009 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver" ,"C:/Users/manib/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
	      
		 WebDriver driver;
		 driver = new FirefoxDriver();
		 
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 WebElement element =driver.findElement(By.name("q"));
		 Thread.sleep(5000);
		 element.sendKeys("Mani");
		 element.submit();
		 Thread.sleep(5000);
		 driver.quit();
		


	}

}
