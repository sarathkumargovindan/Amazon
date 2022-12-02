
package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SimpleAnnotation {
	

	@BeforeSuite
	private void userName() {
		System.out.println("xxxxx@gmail.com");
	}

	@BeforeClass
	private void passWord() {
		System.out.println("xxxxxyyyyzzzz");
	}

	@Test(priority = -1)
	private void login() {
		System.out.println("click2");
	}

	@BeforeMethod()
	private void createAccount() {
		System.out.println("enter all details");
	}

	@AfterClass
	private void userName1() {
		System.out.println("aaaccdd@gmail.com");
	}

	@AfterSuite
	private void passWord1() {
		System.out.println("ggghhhhjjjjj");
	}

	@Test
	private void login1() {
		System.out.println("click");
	}

	@AfterMethod
	private void createAccount1() {
		System.out.println("enter all details");
	}

}
