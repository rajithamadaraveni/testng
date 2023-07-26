package com.rajitha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumbasics {

	WebDriver driver = new ChromeDriver();

	public void LaunchAut() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91837\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.manage().window().fullscreen();
		System.out.println("Current url : " + driver.getCurrentUrl());

	}

	public void Gettitile() {
		String titile = driver.getTitle();
		System.out.println("Title :" + titile);
	}

	public static void main(String[] args) throws InterruptedException {

		Seleniumbasics obj = new Seleniumbasics();
		obj.LaunchAut();
		obj.Gettitile();

	}

}
