package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")
	private WebElement dropdown;
		
	
	
	@FindBy (xpath = "//form[@id='nav-search-bar-form']/div/div/input")
	private WebElement searchtab;	
	
	@FindBy(xpath = "//div[@id='nav-flyout-iss-anchor']/child::div/child::div[2]/child::div")
	private List<WebElement>  toy;
	
	
	
    


	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getDropdown() {
		return dropdown;
	}


	public WebElement getSearchtab() {
		return searchtab;
	}


	public List<WebElement> getToy() {
		return toy;
	}


	}