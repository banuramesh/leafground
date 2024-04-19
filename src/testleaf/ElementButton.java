package testleaf;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementButton{
	
    public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    Thread.sleep(3000);
		
//		ElementsText ob = new ElementsText();
//	    ob.text_box(driver);
	    ElementButton eb = new ElementButton();
	    eb.button(driver);
	}
	
	public void button(ChromeDriver driver)
	{
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("//li[@id='menuform:j_idt38']/descendant::i[1]")).click();
		driver.findElement(By.xpath("//li[@id='menuform:j_idt40']/descendant::i[1]")).click();
		
		driver.findElement(By.linkText("Button")).click();
		Actions ac = new Actions(driver);
		
		//Click the button and capture the title
		WebElement clk1 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']"));
		
		ac.click(clk1).build().perform();
		
		System.out.println("Title is " + driver.getTitle());
	
		driver.navigate().back();
		
		//check whether the button is enabled or not
		System.out.println("button is enabled : " + driver.findElement(By.id("j_idt88:j_idt92")).isEnabled());
		
		//get the button position
		WebElement buttonPosition = driver.findElement(By.id("j_idt88:j_idt94"));
		 
		Point position = buttonPosition.getLocation();
		 
		System.out.println("X value : " + position.getX() + " & Y value : " + position.getY());
		
        //get the button color
		
		WebElement buttonColor = driver.findElement(By.cssSelector("#j_idt88\\:j_idt96"));
		
		String color = buttonColor.getCssValue("background-color");
		
		System.out.println("Button Color :" + color);
		
		//get the size of the button
		
		WebElement buttonSize =  driver.findElement(By.id("j_idt88:j_idt98"));
		
		Dimension d =  buttonSize.getSize();
		
		System.out.println("Height :"+ d.getHeight() + " Width : " + d.getWidth());
		
		//mousehover and confirm the color changes
		
     	WebElement colorChange = driver.findElement(By.cssSelector("#j_idt88\\:j_idt100"));
     	
     	String beforeHoverColor = colorChange.getCssValue("background-color");
     	
		ac.moveToElement(colorChange).perform();		

	    // Capture the color after hover
		String afterHoverColor = colorChange.getCssValue("background-color");

	   // Output color changes
		System.out.println("Before Hover: " + beforeHoverColor);
		System.out.println("After Hover: " + afterHoverColor);
		
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		
		colorChange.click();
		
		List<WebElement> roundbuttons = driver.findElements(By.xpath("//div[@class='card ui-fluid']/following-sibling::div/child::button"));
		
		int count = 0;
		for(WebElement x : roundbuttons)
		{
			count = count+1 ;
			
		}
		 
		System.out.println( count + " Rounded buttons are present");
		      
	}


		private static String getColor(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return (String) js.executeScript("return window.getComputedStyle(arguments[0]).getPropertyValue('color');", element);
		}
		
		
		 
		
}


