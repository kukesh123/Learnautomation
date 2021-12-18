package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement alertbox =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alertbox.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		//
		WebElement confirmbutton =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		confirmbutton.click();
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		//
		WebElement promptbox =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		promptbox.click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Esu");
		promptAlert.accept();
	}

}
