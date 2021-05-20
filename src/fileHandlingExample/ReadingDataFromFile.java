package fileHandlingExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromFile {

	public static void main(String[] args) throws IOException {
		
		Properties obj = new Properties();
		
		FileInputStream fis = new FileInputStream("Config.Poperties");
		
		obj.load(fis);
		
		System.out.println(obj.getProperty("Name"));
		System.out.println(obj.getProperty("Department"));

	}

}
