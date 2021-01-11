package Executable1;

import org.openqa.selenium.By;

import org_Base.Base;

public class Executable1 extends Base{

	public static void main(String[] args) {
		URLlaunching();
		URL("https://www.facebook.com/");
		Entries(driver.findElement(By.id("email")), "greens");
		Entries(driver.findElement(By.id("pass")), "123456");
		clicking(driver.findElement(By.name("login")));
		

	}

}
