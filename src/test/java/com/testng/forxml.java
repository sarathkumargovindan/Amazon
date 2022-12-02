package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class forxml {
	@Test(priority= -1)
	@Parameters({"sarath","s"})
	private void userName(String sarath, String s) {
		System.out.println(sarath +" , "+ s);
	}

	@Test
	private void passWord() {
		System.out.println("xxxxxyyyyzzzz");
	}

	@Test
	private void login() {
		System.out.println("click2");
	}

	@Test
	private void createAccount() {
		System.out.println("enter all details");
	}


}
