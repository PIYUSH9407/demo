package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#twotabsearchtextbox"  )).sendKeys("watch for man");	
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
//		driver.findElement(By.partialLinkText("BY BENYAR Watch for Men Analog")).click();	
//		driver.findElement(By.className("a-size-base-plus a-color-base a-text-normal")).click();
		int no=driver.findElements(By.tagName("div")).size();
		System.out.println(no);
	
	
	}
}
