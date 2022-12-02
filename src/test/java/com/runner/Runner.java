package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sriva\\eclipse-workspace\\Amazon\\src\\test\\java\\com\\feature\\amazon.feature",
glue = "com.stepdefinition",
plugin = {
		"pretty", "html:Report/htmlReport.html", "json:Report/jsonReport.json", "junit:Report/junitReport.xml"}, monochrome = true, dryRun = false, tags = "@smoke")

public class Runner {
	public static WebDriver driver = null;

	@BeforeClass
	public static void setUp() {
		driver = Baseclass.browserLaunch();

	}

	@AfterClass
	public static void tearDown() {
		Baseclass.close();
	}

}
