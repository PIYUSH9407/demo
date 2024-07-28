package Pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("puma");
		Thread.sleep(4000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		for (WebElement Element : suggestion) 
		{
			System.out.println(Element.getText());
			String text = Element.getText();
			if(text.equalsIgnoreCase("puma shoes"))
			{
				Element.click();
				break;
		}

		}}}
