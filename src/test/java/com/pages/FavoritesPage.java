package com.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;

public class FavoritesPage {

	static AppiumDriver<?> driver;
	
	

	By coreVocabularyLink=By.name("Core Vocabulary");

	static By BookMarks = By.name("Bookmarks");

	static By slideMenuIcon = By
			.id("com.mobifusion.android.ldoce5:id/slideMenuButton");

	By searchBar = By.id("com.mobifusion.android.ldoce5:id/search_bar");

	By searchField = By.id("android:id/search_src_text");

	By suggestedWord = By.id("com.mobifusion.android.ldoce5:id/rowText");

	public FavoritesPage(AppiumDriver driver) {
		this.driver = driver;
	}

	public static boolean tapOnMenuPanelIcon() {
		//driver.findElement(slideMenuIcon).click();
		driver.findElement(By.id("com.mobifusion.android.ldoce5:id/slideMenuButton")).click();
        return true;
	}
	
	public void clickOnCoreVocabularyLink(){
		driver.findElement(coreVocabularyLink).click();
	}

	public void tapOnFavoriteMenu() {
		driver.findElement(slideMenuIcon).click();
		driver.findElement(BookMarks).click();
		// driver.navigate().back();
	}

	public void addingWordsIntoFavorites() throws InterruptedException {

		List<String> SearchedWordsList = new ArrayList<String>();
		
		tapOnMenuPanelIcon();
		clickOnCoreVocabularyLink();
		List<WebElement> list = (List<WebElement>) driver.findElements(By.xpath("//android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.TextView"));

		for (int i = 0; i < list.size(); i++) {
			SearchedWordsList.add(list.get(i).getText().replaceAll("\\d", ""));
			list.get(i).click();

			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			
			Set<String> contextNames = driver.getContextHandles();
			
			String nativeView = (String) contextNames.toArray()[0];
			System.out.println(nativeView);
			
			switchToWebView();
			/*driver.findElement(
					By.xpath("//span[@class='new-button blue-button favorite-button outer-span']"))
					.click();*/
			

			Thread.sleep(3000);
		   
		     driver.context(nativeView).switchTo();
			 driver.navigate().back();
			 contextNames.clear();
			
		}
	}
	
	public void switchToWebView() throws InterruptedException{
		Set<String> contextNames = driver.getContextHandles();
		String webView = (String) contextNames.toArray()[1];
		//System.out.println(webView);

		//Thread.sleep(3000);

		driver.context(webView).switchTo();
		Thread.sleep(3000);
/*		driver.findElement(By.className("favorite-button")).click();*/
		driver.findElement(
		By.xpath("//span[@class='new-button blue-button favorite-button outer-span']")).findElement(By.tagName("i"))
		.click();

	}
	public static String getBookmark_LabelName(){
		String ele=driver.findElement(By.name("Bookmarks")).getText();
		System.out.println(ele);
		return ele;
		
	}
	public static boolean verifyBookmarkpage_redirection(){
		boolean ele=driver.findElement(By.name("Bookmarks")).isDisplayed();
		return true;
	}
}
