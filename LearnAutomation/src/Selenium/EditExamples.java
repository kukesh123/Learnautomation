package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("esu31@gmail.com");
		WebElement appendBox =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		appendBox.sendKeys("Text");
	    
	   WebElement clearbox =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
			   clearbox.clear();
       WebElement getTextBox =driver.findElement(By.name("username"));
			 		String value= getTextBox.getAttribute("value");
			  System.out.println(value);
		WebElement Textenabled =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		 	Boolean enabled = Textenabled.isEnabled();
		  System.out.println(enabled);
	}

}
