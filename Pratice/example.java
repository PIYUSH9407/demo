package Pratice;

import java.util.List;

import org.openqa.selenium.By;                                //autosuggestion
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("puma");
		Thread.sleep(2000);
		List<WebElement> list1 = driver.findElements(By.xpath("//*[@class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));
		for(WebElement list:list1) {
			
			System.out.println(list.getText());
			String els = list.getText();
			if(els.equalsIgnoreCase("puma shoes"))
			{
				list.click();
				break;
			}
			
			
			
		}
		
			}
		}
		
		
	


