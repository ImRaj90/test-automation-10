package com.newtestautomation.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 

public class Login {



	@Test
	public void logintoSalesforce(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("rajaar231@outlook.com.sandbx");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("Login")).click();	
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Lightning Experience";
		System.out.println(ActualTitle);
		System.out.println(ExpectedTitle);
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		driver.quit();

	}
}