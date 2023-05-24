package com.teachaway.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;

public class ConfigurationReader {
	private static final Properties properties = new Properties();
	static{
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\teachaway\\resources\\config.properties");
			properties.load(file);
			file.close();
		} catch (IOException e) {
			System.out.println("File not found in the ConfigurationReader class");
			e.printStackTrace();
		}
	}

	public static String getProperty(String keyword) {
		return properties.getProperty(keyword);
	}

	public static void setProperty(String oldValue, String newValue) {
		try {
			File fileToBeModified = new File(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\teachaway\\resources\\config.properties");
			String oldContent = "";
			BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")
					+ "\\src\\main\\java\\com\\teachaway\\resources\\config.properties"));
			String line = reader.readLine();
			while (line != null) {
				oldContent = oldContent + line + System.lineSeparator();
				line = reader.readLine();
			}
			String newContent = oldContent.replaceAll(oldValue, newValue);
			FileWriter writer = new FileWriter(fileToBeModified);
			writer.write(newContent);
			
	
			reader.close();
			writer.close();
		} catch (IOException e) {
			System.out.println("File not found in the ConfigurationReader class");
			e.printStackTrace();
		} 

	}
}
