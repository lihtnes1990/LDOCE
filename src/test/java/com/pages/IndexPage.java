package com.pages;

import java.util.HashMap;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class IndexPage {

	AppiumDriver driver;

	By indexZ = By.name("Z");

	public IndexPage(AppiumDriver driver) {
		this.driver = driver;

	}

	public String getIndex() throws InterruptedException {
		Thread.sleep(3000);
		driver.scrollTo("Z");
		return driver.findElement(indexZ).getText();

	}

	public int getIndexLettersCount() throws InterruptedException {
		int indexCount;
		indexCount = driver.findElements(
				By.id("com.mobifusion.android.ldoce5:id/rowText")).size();
		/*driver.scrollTo("Z");
		Thread.sleep(3000);
		int indexNtoZ = driver.findElements(
				By.id("com.mobifusion.android.ldoce5:id/rowText")).size();
		return indexCount ;*/
		return indexCount;
	}

	public boolean navigateToDetailedPage(String word) {

		//driver.findElement(By.name("A")).click();
		driver.findElement(By.className("android.widget.LinearLayout")).findElement(By.id("com.mobifusion.android.ldoce5:id/rowText")).click();
		driver.scrollTo(word).click();
		return true;
		
		
	}

}
