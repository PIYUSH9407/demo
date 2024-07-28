package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class home_work {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		/*driver.manage().window().maximize();  //maximize the screen
          driver.findElement(By.cssSelector("input[placeholder='First Name']" )).sendKeys("Piyush");
        Thread.sleep(2000); 
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Rana");
        Thread.sleep(1000);
        driver.findElement(By.xpath( "//*[@ng-model='Adress']" )).sendKeys("Nerchowk");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@ng-model=\"EmailAdress\"]" )).sendKeys("piyushranas500@gmail.com");
        driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("7018533130");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@value=\"Male\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("70497049");
        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("70497049");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
        driver.findElement(By.xpath("//option[text()='1994']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[text()='February']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[text()='28']")).click();
       WebElement lung = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
        Thread.sleep(1000);
        lung.click();
        lung.sendKeys(Keys.ARROW_UP);
        Thread.sleep(1000);
        lung.sendKeys(Keys.ARROW_UP);
        Thread.sleep(1000);
        lung.sendKeys(Keys.ARROW_UP);
        Thread.sleep(1000);
        lung.sendKeys(Keys.ARROW_UP);
        driver.findElement(By.xpath("//*[@id=\"Skills\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[text()='AutoCAD']")).click();  */
		
        
        
        


	}

}
