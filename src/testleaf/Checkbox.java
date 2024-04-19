package testleaf;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    Thread.sleep(3000);
		
	    Checkbox cb = new Checkbox();
	    cb.checkbox(driver);
		
	}
	
	public void checkbox(ChromeDriver driver) throws InterruptedException {
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/descendant::i[1]")).click();
		    
		 driver.findElement(By.linkText("Check Box")).click();
		 
		 driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/child::div[2]")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/child::div[2]")).click();
		 Thread.sleep(3000);
		
		 Actions ac = new Actions(driver);
		 
		 List<WebElement> ele1 = driver.findElements(By.xpath("//table[@id='j_idt87:basic']/descendant::td"));
		 
		 Thread.sleep(3000);
		 for( WebElement x : ele1)
		 {
			 if(x.getText().equals("Python"))
			 {
				 x.click();
			 }
		 }
		 
		 WebElement triCheckBox = driver.findElement(By.id("j_idt87:ajaxTriState"));
		 
		 triCheckBox.click();
		 Thread.sleep(3000);
		 triCheckBox.click();
		 Thread.sleep(3000);
		 triCheckBox.click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("j_idt87:j_idt100")).click();
		 Thread.sleep(3000);
		 
		 WebElement checkbox = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']/child::div[2]"));
		 
		 if(checkbox.isSelected())
		 {
			 System.out.println("check box is enabled");
		 }
		 else
		 {
			 System.out.println("checkbox is disabled");
		 }
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='j_idt87:multiple']/ul")).click();
		 Thread.sleep(3000);
		 
		 WebElement ele2 = driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul"));
		
//		 WebElement search = driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/div[2]"));
//		 ac.click(search).sendKeys("Rome").build().perform();
		 Thread.sleep(3000);
		 List<WebElement> ele3 = ele2.findElements(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/child::li/child::label"));
		 
		 for(WebElement y : ele3)
		 {
			 y.click();
			 
			 if(y.getText().equals("Rome"))
			 {
				 break;
			 }
		 }
		 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[1]/a/span")).click();
		
	}

}
