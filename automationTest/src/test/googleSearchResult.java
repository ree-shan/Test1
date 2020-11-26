package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import pages.googleSearchPage;

public class googleSearchResult {
	private static WebDriver driver= null;
	
    public static void main(String[] args) {
	googleSearch();
    }	
	
    public static void googleSearch() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			googleSearchPage.tex_search(driver).sendKeys("auto");
			
			//HomePage.btn_search(driver).click();
			//HomePage.btn_search(driver).sendKeys(Keys.RETURN);
			driver.close();
			
			System.out.println("passss");
		
}

}
