package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	Properties p;

	ConfigurationReader() throws IOException {

		File f = new File(
				"C:\\Users\\sriva\\eclipse-workspace\\Amazon\\src\\main\\java\\com\\property\\amazon.properties");
		FileInputStream fi = new FileInputStream(f);

		p = new Properties();
		p.load(fi);

	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getSheet() {
		String sheet = p.getProperty("sheet");
		return sheet;
	}

}
