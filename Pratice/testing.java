package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.Amazon.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("puma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Men's Essentials Fleece Sweatpants")).click();
	    
	}
	

}
