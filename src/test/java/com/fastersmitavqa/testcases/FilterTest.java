package com.fastersmitavqa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTest {
   
	@Test
	public void verifySearchResult() throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		
		// hover on men menu
		//click on t-shirt
		
		WebElement menMenu = driver.findElement(By.xpath("//a[@data-group=\"men\"]"));
		Actions acts = new Actions(driver);
		acts.moveToElement(menMenu).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement tshirtSubmenu = driver.findElement(By.xpath("//a[@href=\"/men-tshirts\"]"));
		tshirtSubmenu.click();
		
		Thread.sleep(3000);
		
		
		WebElement categoryTshirtCheckbox = driver.findElement(By.xpath("//ul[@class=\"categories-list\"]//input[@value=\"Tshirts\"]"));
		tshirtSubmenu.click();
		
		Thread.sleep(3000);
		
		List<WebElement> productDescription =  driver.findElements(By.xpath(""));
		
		for(WebElement productDescriptions: productDescription)
		{
			//System.out.println(productDescriptions.getText());
			String text = productDescriptions.getText();
			Assert.assertTrue(text.contains("T-shirt"));
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		
		}
		
	}
}
