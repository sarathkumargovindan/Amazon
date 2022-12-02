package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(priority= -1)
	@Parameters({"sarath","s"})
	private void userName(String sarath, String s) {
		System.out.println(sarath +" , "+ s);
	}

	@Test(dataProvider = "data")
	
	private void passWord() {
		System.out.println("username +");
	}

	@Test
	@DataProvider(name = "data")
	private Object value() {
		return new Object[][] {
			{"data1","java"},{"data2","python"}
			
		};
		
		
	}

	@Test
	private void createAccount() {
		System.out.println("enter all details");
	}


}
