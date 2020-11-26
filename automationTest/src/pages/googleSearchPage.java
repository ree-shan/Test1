package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleSearchPage {
	
private static WebElement element = null;
	
	public static WebElement tex_search(WebDriver driver) {
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement btn_search(WebDriver driver) {
		element = driver.findElement(By.name("btnk"));
		return element;
	}

}
