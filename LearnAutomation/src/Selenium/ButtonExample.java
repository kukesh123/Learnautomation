package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		//Get the position
		WebElement FindpositionButton = driver.findElement(By.id("position"));
		Point xypoint = FindpositionButton.getLocation();
		int xvalue =xypoint.getX();
		int yvalue= xypoint.getY();
		System.out.println("X values is " + xvalue);
		System.out.println("Y values is " + yvalue);
		//find the color
		WebElement Findcolor = driver.findElement(By.id("color"));
		String Buttoncolor = Findcolor.getCssValue("background-color");
		System.out.println("Button color is " + Buttoncolor);
		// Find the size
		WebElement Findsize = driver.findElement(By.id("size"));
	int buttonheight = Findsize.getSize().getHeight();
	int buttonwidth = Findsize.getSize().getWidth();
	System.out.println("Height and width is " +buttonheight+ " & " +buttonwidth);
	//Click the Button
	WebElement ClickButton = driver.findElement(By.id("home"));
		ClickButton.click();
	}

}
