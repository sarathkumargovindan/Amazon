package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class simple1 {
	@Test
	private void userName() {
		System.out.println("xxxxx@gmail.com");
	}

	@Test(dependsOnMethods = "login")
	private void passWord() {
		System.out.println("xxxxxyyyyzzzz");
	}

	@Test
	private void login() {
		System.out.println("click2");
	}

	@Test(priority = 1)
	private void createAccount() {
		System.out.println("enter all details");
	}

	@Test(enabled = false)
	private void userName1() {
		System.out.println("aaaccdd@gmail.com");
	}

	@Test
	@Ignore
	private void passWord1() {
		System.out.println("ggghhhhjjjjj");
	}

	@Test(timeOut = 2000)
	private void login1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("click");
	}

	@Test(expectedExceptions = ArithmeticException.class)
	private void exception() {
		int i = 10 / 0;
		System.out.println(i);
	}

//	@Test(expectedExceptions = NullPointerException.class)
//	private void exception1() {
//		int i = 10 / 0;
//		System.out.println(i);
//	}

	@Test
	private void createAccount1() {
		System.out.println("enter all details");
	}

}
