package cliniops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Examplepro1 {
	
	public static void main(String[] args){
		

		 System.setProperty("webdriver.gecko.driver" ,"C:/Users/manib/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
	      
		 WebDriver driver;
		 driver = new FirefoxDriver();
		 driver.get("https://en-gb.facebook.com/login/");
		 
		 driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("manim");
		 driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("1234");
		 driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

}
