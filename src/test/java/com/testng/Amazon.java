package com.testng;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.amazon.Amazon.SingleXSSFReader;
import com.base.Baseclass;
import com.pom.Sdp;
import com.property.Configurationhelper;

public class Amazon extends Baseclass {
	public static WebDriver driver = null;
	public static String ss = "";
	 Sdp sdp;

	@Test(priority = 0)
	public void browser() {
		driver = browserLaunch();
		sdp = new Sdp(driver);
	}

	@AfterMethod
	public  void launchTheUrl() throws IOException {
		String url = Configurationhelper.getinstance().getUrl();

		launchUrl(url);

		implicitywait();
	}

	@AfterClass
	public void selectTheValue() throws InterruptedException, IOException {
	
		String sheet = Configurationhelper.getinstance().getSheet();

		String expected = SingleXSSFReader.singleData(sheet, 2, 1);

		List<WebElement> options = dropdownoptions(sdp.getHomePage().getDropdown());

		Thread.sleep(1000);

		for (int i = 0; i < options.size(); i++) {

			String actual = options.get(i).getText();
			if (expected.equalsIgnoreCase(actual)) {
				dropdown(sdp.getHomePage().getDropdown(), "text", actual);
			} else {
				continue;
			}
		}

	}

	@AfterTest
	public  void goToTheSearchtab() throws InterruptedException, IOException {
		String sheet = Configurationhelper.getinstance().getSheet();
		ss = SingleXSSFReader.singleData(sheet, 2, 0);
		userInput(sdp.getHomePage().getSearchtab(), ss);
		Thread.sleep(1000);
		
		List<WebElement> toy = sdp.getHomePage().getToy();

		System.out.println(toy.size());
		for (int i = 1; i < toy.size(); i++) {
			WebElement text =webElement("//div[@class='autocomplete-results-container']/child::div[" + i + "]/div/div");
			String text2 = getTextOnElement(text);

			if (ss.equalsIgnoreCase(text2)) {
				clickOnElement(text);
				break;
			}

		}

	}

	@AfterSuite
	public  void noOfProducts() {
		List<WebElement> results = sdp.getToyPage().getResults();
		int size = results.size();
		System.out.println(size);

		List<WebElement> moreresult = sdp.getToyPage().getMoreresult();
		int size2 = moreresult.size();
		System.out.println(size2);
		List<WebElement> moreresults = sdp.getToyPage().getMorereultss();
		int size3 = moreresults.size();
		System.out.println(size3);

	}

}
