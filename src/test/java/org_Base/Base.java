package org_Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Base {
	public static WebDriver driver;
	public static Object TakesScreenshot;
	public static int i;	
	public static Select s ;
	public static Actions a;
	
	// 1. URL Launching
	public static void URLlaunching() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\Mavenprog\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	


	// 2.Print Title
	public static void Title() {
		System.out.println(driver.getTitle());

	}

	// 3.Get URL
	public static void URL(String url) {
		driver.get(url);
	}

	// 4.Print URL
	public static void urlprint() {
		// TODO Auto-generated method stub
		String Urlname = driver.getCurrentUrl();
		System.out.println(Urlname);
		// return Urlname;

	}

	// 5.Maximizing the window
	public static void max() {
		driver.manage().window().maximize();
	}

	// 6.Passing the values
	public static void Entries(WebElement loc, String val) {

		loc.sendKeys(val);

	}

	// 7.clicking
	public static void clicking(WebElement e) {
		e.click();

	}

	// 8.Dragdrop
	public static void dropdown(WebElement src, WebElement des) {

		 a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
		

	}

	// 9.Screenshot
	public static void screens() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("c:\\Photos\\1.jpg");

		FileUtils.copyFile(src, des);

	}

	// 10.Dropdown-Selectbyindex
	public static void updown(WebElement e, int a) {
		 s = new Select(e);
		s.selectByIndex(a);
	}

	// 11.Dropdown-selectby value
	public static void updown1(WebElement e, String str) {
	s = new Select(e);
		s.selectByValue(str);

	}

	// 12.dropdown-Selectbyvisibletext
	public static void updown2(WebElement e, String str) {
		s = new Select(e);
		s.selectByVisibleText(str);

	}

	// 13.getattribute
public	static String  value;
	public static void orderval(WebElement e) {
		 String value1 = e.getAttribute("value");
		System.out.println("The value is:" + value1);

	}
	public static void sleep() throws InterruptedException {
	Thread.sleep(5000);

}
	
	// 14.implicit wait
	public static void sleeping() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}
	//Explicitwait
	public static void sleepingwait() {
	Wait w1=new FluentWait(driver).withTimeout(50,TimeUnit.SECONDS).pollingEvery(100,TimeUnit.MICROSECONDS).ignoring(Throwable.class);

		
	}
	//15.close
	public static void closing() {
		driver.close();

	}

}
