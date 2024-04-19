package testleaf;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsText {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    Thread.sleep(3000);
		
		ElementsText ob = new ElementsText();
	    ob.text_box(driver);
	  //  ElementButton eb = new ElementButton();
	  // eb.button(driver);
	}
	
	public void text_box(ChromeDriver driver) throws InterruptedException {
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/descendant::i[1]")).click();
		    
		 driver.findElement(By.linkText("Text Box")).click();
		 
		 driver.findElement(By.id("j_idt88:name")).sendKeys("Banu Priya");
		 
		 driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(", Guindy");
		 
		 System.out.println(driver.findElement(By.id("j_idt88:j_idt93")).isEnabled());
		 
		 driver.findElement(By.name("j_idt88:j_idt95")).clear();
		 driver.findElement(By.name("j_idt88:j_idt95")).sendKeys("I cleared the text");
		 
		 Thread.sleep(1000);
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement textBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("j_idt88:j_idt97")));
		 String text = textBox.getAttribute("value");
		 System.out.println(text);

		 
//		 WebElement ele = driver.findElement(By.name("j_idt88:j_idt97"));
//		 String text = ele.getText();
//		 System.out.println(text);
//		 Thread.sleep(2000);
		 
		 Actions ac = new Actions(driver);
		 
		 driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("kvbmbanu@Wgmail.com");
		 
		 ac.sendKeys(Keys.TAB).build().perform();
		 
		 driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("my name is Banu and I am 32 years old.\r\n"
		 		+ "\r\n"
		 		+ "For the past 5 years, I’ve been working as a business analyst at Company X and Y.\r\n"
		 		+ "\r\n"
		 		+ "I have some background in data analysis, with a degree from University XY. What really got me into the field, though, is the internship I did at Company Z. ");
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		 
		WebElement t_style = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_toolbar']/descendant::span[@class='ql-picker-label'][1]"));
		
		ac.click(t_style).build().perform();
		 
		WebElement serif = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_toolbar']/descendant::span[@class='ql-picker-options'][1]/child::span[@data-value='serif']"));
		ac.click(serif).build().perform(); 
		Thread.sleep(2000);
		
		WebElement f_style =driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103']/child::div[1]/child::span[1]/child::span[2]"));
		ac.click(f_style).build().perform();
		Thread.sleep(2000);
		
		WebElement font_style =driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103']/child::div[1]/child::span[1]/child::span[2]/child::span[2]/child::span[3]"));
		ac.click(font_style).build().perform(); 
		Thread.sleep(2000);
		
    	driver.findElement(By.xpath("//span[@class='ql-formats'] [2]/child::button[1]")).click();
		 
		driver.findElement(By.xpath("//span[@class='ql-formats'] [3]/child::span[1]")).click();
		Thread.sleep(2000);
		
		WebElement clrPicker = driver.findElement(By.xpath("//span[@class='ql-formats'] [2]/following-sibling::span[1]/child::span[1]/child::span[2]/child::span[6]"));
		ac.click(clrPicker).build().perform();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']/child::div[1]")).sendKeys("I Love my mom");
		Thread.sleep(2000);
		
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        Thread.sleep(2000);
        
		 WebElement ele1 = driver.findElement(By.id("j_idt106:thisform:age"));
		 ac.click(ele1).sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(3000);
		 
		 WebElement error = driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']/parent::div/following-sibling::div/child::div"));
		 String errorMsg = error.getText();
		 System.err.println("Error Message: " + errorMsg);
		 
		 WebElement ele2 = driver.findElement(By.id("j_idt106:float-input"));
		 
		 WebElement label = driver.findElement(By.id("j_idt106:j_idt113"));
		 
		Point labelInitialPosition = label.getLocation();
		 
		 System.out.println(labelInitialPosition);
		 
		 ele2.click();
		 
		 Thread.sleep(2000);
		 
		 Point labelNewPosition = label.getLocation();
		 System.out.println(labelNewPosition);
		 
		 if(!labelInitialPosition.equals(labelNewPosition))
		 {
			 System.out.println("Label Position Changed");
		 }
		 else
		 {
			 System.out.println("Label Position is not changed");
		 }
		 
		 Thread.sleep(2000);
		 
		 WebElement multi = driver.findElement(By.xpath("//input[@name='j_idt106:auto-complete_input']"));

			multi.sendKeys("Jeeva");

			Thread.sleep(2000);

			WebElement ulElement = driver.findElement(By.xpath("//*[@id='j_idt106:auto-complete_panel']/ul"));
			
			List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
			for (WebElement li : liElements) {
			    if (li.getText().equals("Jeeva3")) {
			        li.click(); // This will click the matching element
			        break;
			    }
			}
	
	   
		 
		 WebElement dateInput = driver.findElement(By.id("j_idt106:j_idt116_input"));
		 
		 String testDate = "03/29/1991";
		 
		 dateInput.sendKeys(testDate);
		 Thread.sleep(2000);
		 
		 String enteredDate = dateInput.getAttribute("value");
		 
		 if(enteredDate.equals(testDate))
		 {
			 System.out.println("Selected the date correctly");
		 }
		 else
		 {
			 System.out.println("not selected correctly");
		 }
		 
		  WebElement num = driver.findElement(By.id("j_idt106:j_idt118_input"));
		  
		  String testNum = "6";
		  
		  num.sendKeys(testNum);
		  
		  String initialNum = num.getAttribute("value");
		  
		  driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/child::a[1]")).click();
		  
		  Thread.sleep(3000);
		  
		  String newNum1 =  num.getAttribute("value");
		  
		  if(!initialNum.equals(newNum1))
		  {
			  System.out.println("The number is changing");
		  }
		  else
		  {
			  System.out.println("The number is same");
		  }
		  
		  driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/child::a[2]")).click();
		  
		  driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/child::a[2]")).click();
		  
		  String newNum2 = num.getAttribute(newNum1);
		  
		  if(!newNum1.equals(newNum2))
		  {
			  System.out.println("The number is changing");
		  }
		  else
		  {
			  System.out.println("The number is same");
		  }
		  
		  Thread.sleep(3000);
		  
		  js.executeScript("window.scrollBy(0,250)");
		  
		 WebElement ele6 = driver.findElement(By.xpath("//div[@id='j_idt106:j_idt120']/child::span"));
		 
		 Point p = ele6.getLocation();
		 
//		 System.out.println(p.getX()+ p.getY());
//		 String initialPosition = ele5.getAttribute("value");

		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("j_idt106:slider")).sendKeys("42");
		 Thread.sleep(3000);
		 
		 Point p1 = ele6.getLocation();  
//		 System.out.println(p1.getX()+ p1.getY());
		 
//		 String newPosition = ele5.getAttribute("value");
		 
		 Thread.sleep(3000);
		 
		 if(!p.equals(p1))
		 {
			 System.out.println("Position has changed");
		 }
		 else
		 {
			 System.out.println("Position not changed");
		 }
		  
		 driver.findElement(By.name("j_idt106:j_idt122")).click();
		 Thread.sleep(3000);
		 
		 WebElement keyboard = driver.findElement(By.xpath("//div[@id='j_idt133']/following-sibling::div[2]"));
		 if(keyboard.isDisplayed())
		 {
			 System.out.println("Keyboard is displaying");
		 }
		 else
		 {
			 System.out.println("Keyboard is not displaying");
		 }
		 
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 Thread.sleep(3000);
		 
		 WebElement textPara = driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']/child::div[1]"));
		 textPara.sendKeys("I Love My Dad");
		 ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_toolbar']/descendant::button[1]")).click();
		 
		 driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_toolbar']/descendant::button[2]")).click();
		 
		 driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_toolbar']/descendant::button[3]")).click();
		  
		 driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_toolbar']/descendant::button[4]")).click(); 
		  
		 driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_toolbar']/child::span[2]/descendant::span[2]")).click();
		 
		 driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_toolbar']/child::span[2]/descendant::span[3]/child::span[3]")).click();
		 
		 driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_toolbar']/child::span[2]/child::span[2]")).click();
		 
		 driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_toolbar']/child::span[2]/child::span[2]/child::span[2]/child::span[4]")).click();
		  
		 
		 
		 
	 } 

}
