package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement Dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(Dropdown1);
		select1.selectByIndex(2);
		//Thread.sleep(3000);
		select1.selectByValue("2");
		//Thread.sleep(3000);
		select1.selectByVisibleText("Selenium");
		
		List<WebElement> numberofelements = select1.getOptions();
		int count = numberofelements.size();
		System.out.println("Count "+count);
				
		Dropdown1.sendKeys("Loadrunner");
		
		WebElement multiselect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select multiselect1 = new Select(multiselect);
		multiselect1.selectByIndex(1);
		multiselect1.selectByIndex(2);
		multiselect1.selectByIndex(3);
		
		
				
	}

}

