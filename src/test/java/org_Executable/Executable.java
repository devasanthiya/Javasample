package org_Executable;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org_Base.Base;

public class Executable extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {
		// 1.Page launching
		URLlaunching();

		// 2.open URL
		URL("http://adactinhotelapp.com/");
		// 3.MAximizing window
		max();
		// 4.Title
		Title();
		// 5.URLPrinting
		urlprint();
		// 6.Username
		WebElement username = driver.findElement(By.id("username"));
		String val = "Devasanthiya";
		Entries(username, val);
		// 7.Password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("P93A2F");

		// 8.clicking
		clicking(driver.findElement(By.id("login")));
		// 9.Another URL PRINT
		System.out.println("ADACTIN MAINPAGE");
		Title();

		// 10.Screenshot
		screens();
		// 11.dropanddown-selectny vsibletext
		updown2(driver.findElement(By.id("location")), "London");
		// 12.dropdown-selectbyvalue
		updown1(driver.findElement(By.xpath("//select[@name='hotels']")), "Hotel Creek");
		updown(driver.findElement(By.id("room_type")), 3);
		updown(driver.findElement(By.id("room_nos")), 4);
		Entries(driver.findElement(By.xpath("//input[@name='datepick_in']")), "20/12/20");
		Entries(driver.findElement(By.xpath("//input[@name='datepick_out']")), "25/12/20");
		updown(driver.findElement(By.xpath("//select[@id='adult_room']")), 4);
		clicking(driver.findElement(By.xpath("//input[@value='Search']")));
		clicking(driver.findElement(By.xpath("//input[@name=\"radiobutton_0\"]")));
		clicking(driver.findElement(By.id("continue")));

		Entries(driver.findElement(By.id("first_name")), "Deva");
		Entries(driver.findElement(By.id("last_name")), "Chandrasekaran");
		Entries(driver.findElement(By.id("address")), "chennai");
		Entries(driver.findElement(By.xpath("//input[@name='cc_num']")), "1234568799875445");

		updown(driver.findElement(By.id("cc_type")), 2);	
		updown(driver.findElement(By.id("cc_exp_month")), 4);
		updown(driver.findElement(By.id("cc_exp_year")), 10);

		Entries(driver.findElement(By.xpath("//input[@name='cc_cvv']")), "3254");

		clicking(driver.findElement(By.id("book_now")));
	sleeping();
//		sleepingwait();
		
//		WebDriverWait w = new WebDriverWait(driver,50);
//		w.until(ExpectedConditions.elementToBeClickable(By.id("order_no")));
	
		orderval(driver.findElement(By.id("order_no")));
		
		//closing();
	}

}
