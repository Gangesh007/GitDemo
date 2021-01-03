package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		//1.geckodriver
   // System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
  //1.chromedriver
    System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
   // WebDriver driver = new FirefoxDriver();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    String title = driver.getTitle();
    if (title.equals("Google")) {
		System.out.println("Titlematched");
	}
    else {
		System.out.println("Title not matched");
	}
    System.out.println(driver.getCurrentUrl());
    //System.out.println(driver.getPageSource());
    driver.close();
	}

}
