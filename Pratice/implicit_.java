package Pratice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicit_ {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		
//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.actitime.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username" ) ).sendKeys("admin",Keys.TAB,"manager" );
	WebElement login = driver.findElement(By.id( "loginButton" ));
//          WebDriverWait(driver,Duration.ofSeconds(10));
	
	
	

	}}
