package testleaf;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait1 {
     public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    Thread.sleep(3000);
		
	    wait1 w = new wait1();
	    w.waitmeth(driver);
		
	  }
	
    public void waitmeth(ChromeDriver driver) throws InterruptedException
    {
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/descendant::i[1]")).click();
		    
		 driver.findElement(By.linkText("Waits")).click();
		 
		 driver.findElement(By.id("j_idt87:j_idt89")).click();
		 
		 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_idt87:j_idt90")));
		 
		 driver.findElement(By.id("j_idt87:j_idt92")).click();
		 w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("j_idt87:j_idt93")));
		 //Thread.sleep(3000);
		 
		 driver.findElement(By.id("j_idt87:j_idt95")).click();
		 WebElement notification = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='j_idt87:growl_container']/child::div[2]")));
		 notification.click();
		 
		 String msg = notification.getText();
		 System.out.println(msg);
		 		 
		 Thread.sleep(3000);
		 driver.findElement(By.id("j_idt87:j_idt98")).click();
		 
		 	 
    	 WebElement ele1 = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt98']/parent::span/following-sibling::span"));
		 
		 String text1 = ele1.getText();
		 
		 System.out.println("initial text : " + text1);
		 
		 Thread.sleep(3000);
		 
		 WebElement ele2 = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt99']"));
		 
		 String text2 = ele2.getText();
		 
		 		 
		 w.until(ExpectedConditions.textToBePresentInElement(ele2, text2));
		 
		 
		 System.out.println("text has changed to : " + text2);
		 
		 
		 
    }
    
}
