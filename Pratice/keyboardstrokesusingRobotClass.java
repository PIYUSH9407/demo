package Pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardstrokesusingRobotClass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get( "https://demo.actitime.com/login.do" );
		driver.findElement(By.id( "username" )).sendKeys("admin");
		
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		
		

	}

}
