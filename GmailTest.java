package com.GmailQA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
				 "/home/qainfotech/Downloads/chromedriver"); 
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.gmail.com");
	      driver.findElement(By.id("identifierId")).sendKeys("ashwaniupadhyay29",Keys.ENTER);
	      Thread.sleep(3000);
	      driver.findElement(By.name("password")).sendKeys("Ash@9968",Keys.ENTER);
	      Thread.sleep(4000);
	      List<WebElement> unreademail = driver.findElements(By.cssSelector("tr[class*='zA zE']"));
	      
	      System.out.println("Total No. of Unread Mails: " + unreademail.size());
	      
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "/home/qainfotech/Downloads/chromedriver"); WebDriver driver=new
		 * ChromeDriver();
		 * 
		 * driver.get(
		 * "https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin"
		 * );
		 * 
		 * String actual="Sign in – Google accounts"; String get=driver.getTitle();
		 * CheckTitle(actual,get);
		 * 
		 * driver.findElement(By.id("identifierId")).sendKeys("priyajkumart",Keys.ENTER)
		 * ; // driver.findElement(By.id("identifierId")).sendKeys("raj8805");
		 * //driver.findElement(By.cssSelector("input#identifierId")).sendKeys(
		 * "ashwaniupadhyay29@gmail.com");
		 * //driver.findElement(By.cssSelector("span[class*='RveJvd snByac']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.id("identifierId")).sendKeys("PASSWORD",Keys.ENTER);
		 */
	}

	//*[@id="password"]/div[1]/div/div[1]/input
	public static void CheckTitle(String actual, String get) 
	{
		
			if(actual.equals(get))
			{
				System.out.println("Ok");
			}
			else
			{
				System.out.println("NOT FOUND");
				System.exit(0);
			}
		
	}

}
