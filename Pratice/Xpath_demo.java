package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_demo {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		//xpath by attribute
		//first syntax
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("piyushrana");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("piyushrana");
		//2nd syntax
       //driver.findElement(By.xpath("//button[contains(@name,'l')]")).click();
		Thread.sleep(2000);
		// relative attribute
		driver.findElement(By.xpath("//a[@id='u_0_0_YG']")).click();
		
		
		
		
	}

}
