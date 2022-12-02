package com.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.Amazon.SingleXSSFReader;
import com.base.Baseclass;
import com.pom.Sdp;
import com.property.Configurationhelper;
import com.runner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Baseclass {
	public static WebDriver driver = Runner.driver;
	public static String ss = "";
	Sdp sdp = new Sdp(driver);

	@Given("launch The Url Of The Homepage")
	public void launch_the_url_of_the_homepage() throws IOException {
		String url = Configurationhelper.getinstance().getUrl();
		launchUrl(url);
		implicitywait();
	}

	@When("select The {string} From The Dropdown")
	public void select_the_from_the_dropdown(String dropDownValue) throws InterruptedException, IOException {

		String sheet=Configurationhelper.getinstance().getSheet();

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

	}

	@When("go To The SearchTab And Search The {string}")
	public void go_to_the_search_tab_and_search_the(String product) throws InterruptedException, IOException {
		String sheet=Configurationhelper.getinstance().getSheet();

		ss = SingleXSSFReader.singleData(sheet, 2, 0);
		
		userInput(sdp.getHomePage().getSearchtab(), ss);
		Thread.sleep(3000);

	}

	@When("compare The Value Of Suggested List")
	public void compare_the_value_of_suggested_list() {
		List<WebElement> toy =sdp.getHomePage().getToy();
		System.out.println(toy.size());
		for (int i = 1; i < toy.size(); i++) {
			WebElement text = webElement("//div[@class='autocomplete-results-container']/child::div[" + i + "]/div/div");
			String text2 = getTextOnElement(text);

			if (ss.equalsIgnoreCase(text2)) {
				clickOnElement(text);
				break;
			}

		}
	}

	@Then("get The No Of Products In Result And More Result Tag")
	public void get_the_no_of_products_in_result_and_more_result_tag() {
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
