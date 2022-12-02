package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToyPage {
	public WebDriver driver;

	@FindBy(xpath = "//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']/child::h2[1]")
	private List<WebElement> results;

	
	@FindBy(xpath ="//span[@class='a-size-base-plus a-color-base a-text-normal']")
	private List<WebElement> moreresult;
	
	
	@FindBy(xpath = "//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']")
	private List<WebElement> moreresultss ;
	
	public ToyPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		}
	public List<WebElement> getResults() {
		return results;
	}


	public List<WebElement> getMoreresult() {
		return moreresult;
	}


	public List<WebElement> getMorereultss() {
		return moreresultss;
	}


}
