package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sdp {

	public WebDriver driver;
	public HomePage hp;
	public ToyPage tp;

	public Sdp(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public HomePage getHomePage() {
		if (hp == null) {
			hp = new HomePage(driver);

		}
		return hp;
	}

	public ToyPage getToyPage() {
		if (tp == null) {
			tp = new ToyPage(driver);
		}
		return tp;
	}

}
