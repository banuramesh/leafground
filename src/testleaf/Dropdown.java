package testleaf;

import java.net.SocketException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
public static void main(String[] args) throws InterruptedException, SocketException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    Thread.sleep(3000);
		
//		ElementsText ob = new ElementsText();
//	    ob.text_box(driver);
	    Dropdown dd = new Dropdown();
	    dd.dropdown(driver);
	}
	
	public void dropdown(ChromeDriver driver) throws InterruptedException, SocketException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//	driver.findElement(By.xpath("//li[@id='menuform:j_idt38']/descendant::i[1]")).click();
			driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/descendant::i[1]")).click();
			
			driver.findElement(By.linkText("Dropdown")).click();
			Thread.sleep(3000);
			
			Select s = new Select(driver.findElement(By.xpath("//form[@id='j_idt87']/descendant::div[@class='col-12 md:col-6'][1]/descendant::select[1]")));
		//	s.selectByIndex(2);
			s.selectByVisibleText("Selenium");
			Thread.sleep(8000);
			
			WebElement ele1 = driver.findElement(By.id("j_idt87:country"));
			ele1.click();
			Thread.sleep(3000);
			
			WebElement ele2 = driver.findElement(By.xpath("//*[@id='j_idt87:country_items']"));
			
			List<WebElement> ele3 = ele2.findElements(By.tagName("li"));
			
			for(WebElement x : ele3)
			{
				if(x.getText().equals("India"))
				{
					x.click();
				}
			}
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("j_idt87:city")).click();
			Thread.sleep(3000);
			
			WebElement ele4 = driver.findElement(By.id("j_idt87:city_items"));
			
			List<WebElement> ele5 = ele4.findElements(By.tagName("li"));
			
			for(WebElement y : ele5)
			{
				if(y.getText().equals("Chennai"))
				{
					y.click();
				}
			}
			
			driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete']/button/span[1]")).click();
			Thread.sleep(3000);
			
			WebElement ele6 = driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete_panel']/ul"));
			
			List<WebElement> ele7 = ele6.findElements(By.tagName("li"));
			
			for(WebElement z: ele7)
			{
				if(z.getText().equals("Playwright"))
				{
					z.click();
				}
			}
			
			driver.findElement(By.id("j_idt87:lang")).click();
			Thread.sleep(3000);
			
			WebElement ele8 = driver.findElement(By.id("j_idt87:lang_items"));
			
			List<WebElement> ele9 = ele8.findElements(By.tagName("li"));
			
			for(WebElement xy: ele9)
			{
				if(xy.getText().equals("Tamil"))
				{
					xy.click();
				}
			}
			
			driver.findElement(By.xpath("//div[@id='j_idt87:value']")).click();
			
			Thread.sleep(3000);
			
			WebElement ele10 = driver.findElement(By.id("j_idt87:value_items"));
			
			List<WebElement> ele11 = ele10.findElements(By.tagName("li"));
			
			for(WebElement yz: ele11)
			{
				if(yz.getText().equals("இரண்டு"))
				{
					yz.click();
				}
			}
		//	Thread.sleep(5000);
			
		//	driver.close();
		
	}
	

}
