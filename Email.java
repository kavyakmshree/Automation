package com.automation.kavya.webapp_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Email {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kavyashree\\Downloads\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//launch website
		driver.navigate().to("http://www.gmail.com");
		
		//enter mail id 
	    //to be replaced by valid email id and password
		driver.findElement(By.id("identifierId")).sendKeys("example@gmail.com");
		
		//clicking "next" field
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(1000);
		
		//enter the password field
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
		
		Thread.sleep(1000);
		
		//clicking "next" field
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		//clicking "starred" field 
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div/div/div[2]/span/a")).click();
		
		Thread.sleep(1000);
		
		//clicking "inbox" field
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div/div[2]/span/a")).click();
		
		Thread.sleep(1000);
		
		//clicking "sent" field
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[4]/div/div/div[2]/span/a")).click();
		
		Thread.sleep(1000);
		
		//Actions class
		Actions action=new Actions(driver);
		
		//scrolling down the page
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		
		//scrolling up the page
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		
		//clicking "compose" field
        driver.findElement(By.cssSelector(".aic .z0 div")).click();
        
        Thread.sleep(1000);
        
        //entering "to" field 
        //to be replaced by valid email id
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".oj div textarea"))).sendKeys("abcd@gmail.com");
        
        //entering the "subject" field
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".aoD.az6 input"))).sendKeys("sent mail automatically");
        
        //entering the body of the mail
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".Ar.Au div"))).sendKeys("I HAVE SENT MAIL AUTOMATICALLY");
        
        //clicking the "send" field
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".T-I.J-J5-Ji.aoO.T-I-atl.L3"))).click();
        
        
	}

}
