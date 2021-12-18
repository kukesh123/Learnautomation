package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		WebElement Checkboxsample = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		Checkboxsample.click();
		WebElement selectbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		Boolean Selselected = selectbox.isSelected();
		System.out.println(Selselected);
		
	}
	//*[@id="contentblock"]/section/div[2]/div/input
}
