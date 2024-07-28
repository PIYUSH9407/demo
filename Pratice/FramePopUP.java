package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramePopUP {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		/*driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
          Actions act = new Actions(driver);
          act.dragAndDrop(drag, drop).perform();*/
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//driver.switchTo().frame("")
		
		
		
		
		
		
		
		
		

	}

}
