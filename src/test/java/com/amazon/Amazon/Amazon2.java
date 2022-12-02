package com.amazon.Amazon;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import com.base.Baseclass;
import com.pom.Sdp;
import com.property.Configurationhelper;

public class Amazon2 extends Baseclass {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		driver = browserLaunch();
		String url = Configurationhelper.getinstance().getUrl();
		launchUrl(url);
		Sdp sdp = new Sdp(driver);
		Thread.sleep(3000);
		String sheet = Configurationhelper.getinstance().getSheet();

		String expected = SingleXSSFReader.singleData(sheet, 2, 1);

		List<WebElement> options = dropdownoptions(sdp.getHomePage().getDropdown());

		Thread.sleep(3000);

		for (int i = 0; i < options.size(); i++) {
			String actual = options.get(i).getText();
			if (expected.equalsIgnoreCase(actual)) {
				dropdown(sdp.getHomePage().getDropdown(), "text", actual);
			} else {
				continue;
			}
		}

		Thread.sleep(3000);

		String ss = SingleXSSFReader.singleData(sheet, 2, 0);

		userInput(sdp.getHomePage().getSearchtab(), ss);

		Thread.sleep(3000);

		List<WebElement> toy = sdp.getHomePage().getToy();

		System.out.println(toy.size());
		for (int i = 1; i < toy.size(); i++) {
			WebElement text = webElement(
					"//div[@class='autocomplete-results-container']/child::div[" + i + "]/div/div");

			String text2 = getTextOnElement(text);

			if (ss.equalsIgnoreCase(text2)) {
				clickOnElement(text);
				break;
			}

		}

		int size = sdp.getToyPage().getResults().size();
		System.out.println(size);

		int size2 = sdp.getToyPage().getMoreresult().size();
		System.out.println(size2);
		int size3 = sdp.getToyPage().getMorereultss().size();
		System.out.println(size3);
	}

}
