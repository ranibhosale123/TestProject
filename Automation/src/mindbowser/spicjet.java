package mindbowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class spicjet {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\close\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.spicejet.com/");
	     Thread.sleep(3000);
	     WebElement oneway = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	     boolean result = oneway.isSelected();
         if(result==true)
         {
        	 System.out.println("Disabled");
         }
         else
         {
        	 System.out.println("Enabled");
         }
         
         WebElement from = driver.findElement(By.xpath("(//span[@class='red-arrow-btn'])[1]"));
         Actions act=new Actions(driver);
         act.click(from).perform();
         Thread.sleep(2000);
         for(int i=1; i<=7; i++)
         {
        	 act.sendKeys(Keys.ARROW_DOWN).perform();
        	 Thread.sleep(1000);
        	 
         }
         
         Thread.sleep(2000);
         WebElement to = driver.findElement(By.xpath("(//span[@class='red-arrow-btn'])[2]"));
         Actions act1=new Actions(driver);
         act1.click(to).perform();
         Thread.sleep(2000);
         for(int i=1; i<=55; i++)
         {
        	 act1.sendKeys(Keys.ARROW_DOWN).perform();
        	 Thread.sleep(1000);
         }
         
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
         Thread.sleep(1000);
        
         driver.findElement(By.xpath("(//a[text()='21'])[1]")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("(//select[@name='ctl00$mainContent$ddl_Adult'])/option[5]")).click();
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("(//select[@name='ctl00$mainContent$DropDownListCurrency'])/option[4]")).click();
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
         Thread.sleep(1000);
        
         driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
         
         
         
         
         
         
         
         }
	}

