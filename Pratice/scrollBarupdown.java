/*package Pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollBarupdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get(  "https://www.amazon.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
	case-1
		Robot rob = new Robot();    //by useing robo class,scroll  bar (up and down)
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000); 
//	 case -2
	/*	JavascriptExecutor scroll = (JavascriptExecutor)driver;
		for(int i=0;i<=5;i++) {
			scroll.executeScript( "window.scrollBy(0, 500)"); // 500 is  length to down the scroll bar*/ 
	
//	case -3	
	/*	WebElement text = driver.findElement(By.xpath( "//a[text()='Instagram']" ));
		Point data = text.getLocation();	
		System.out.println(data.getX()); //first we get x and y co-ordinate
		System.out.println(data.getY());
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(490,5320)");
		Thread.sleep(1000);
		text.click();*/
			
//	case -4	(direct we jump to link
	/*	WebElement data = driver.findElement(By.xpath("//a[text()='About Us']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", data);
		Thread.sleep(1000);
		data.click();
		
		
		}

	}
*/

