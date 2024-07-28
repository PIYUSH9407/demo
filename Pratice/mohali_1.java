package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mohali_1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		/*driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().forward();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).sendKeys("first NAME");
		driver.findElement(By.xpath("//*[@placeholder=\"Last Name\"]")).sendKeys("last name");*/
		
	/*	driver.get("https://chat.qspiders.com/student-dashboard");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().to("https://www.facebook.com/");*/
		/*driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class=\"form-control ng-pristine ng-valid ng-touched\"]")).click();
		WebElement dropdwn = driver.findElement(By.xpath("//*[@class=\\\"form-control ng-pristine ng-valid ng-touched\\\"]"));
		
	    Select drop=new Select(dropdwn);
		Thread.sleep(1000);
		drop.selectByVisibleText("c");
		driver.findElement(By.xpath("//*[@class=\"select2-selection select2-selection--single\"]")).click();
		WebElement countrydrop = driver.findElement(By.xpath("//*[@class=\"select2-selection select2-selection--single\"]"));
		Thread.sleep(2000);
		Select dropc = new Select(countrydrop);
		dropc.selectByVisibleText("india");*/
		
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class=\"checks\"]")).click();
		
		 
		 
		

		
	}

}
