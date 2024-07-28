package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
                                                              //file upload popUp
import io.github.bonigarcia.wdm.WebDriverManager;

public class authenticationPOpUp {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"heroSection-buttonContainer_secondaryBtn secondaryBtn\"]")).click();
		WebElement text = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
		Thread.sleep(1000);
		
		text.sendKeys("D:\\resume qspider");
		}

}
